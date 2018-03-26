package j0105;
//서버역할(1.접속한 클라이언트의 정보를 저장->메세지 전달
              //2.실시간 데이터 전송(쓰레드))

//PrintWriter,
import java.io.*;

//ServerSocket,Socket
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Properties;
import java.util.Vector;//List계열(동적 배열)->실시간으로 접속한 클라이언트수

public class ChatGUIServer {

	ServerSocket ss;//클라이언트와의 접속할때만 필요로하는 클래스 객체
	Socket s;//클라이언트와 통신(문자열 전송)
	Vector v;//실시간으로 접속할 클라이언트의 정보를 저장
	//Thread객체가 필요->has a 관계
	ServerThread st;
	
	//서버를 가동->클라이언트가 접속할때 기다린다.(무한루프)
	public ChatGUIServer() throws Exception{
		//환경설정파일을 불러오는 구문
		Properties props=new Properties();
		//FileInputStream in=null;
		FileInputStream in = 
				    new FileInputStream
				        ("C:/webtest/3.java/sou/JavaStudy/src/j0105/port.properties");
		String service="";//임시로 저장할 포트번호
		//입출력=>현재 파일을 불러올 수 있는 상태인지 체크->available()->-1 리턴X
		//불러올 파일의 정보를 가지고 있으면서 파일을 불러올 수 있다면
		if(in!=null && in.available() > 0) {
			props.load(in);
			service=props.getProperty("port");//"1"->""
		}
		if("".equals(service)) { //정상적으로 port속성을 못 불러오는 경우 왜 ""
			service="5432";
		}
		int port=Integer.parseInt(service);//"1"->1
		switch (port) {
		case 1: port=5432;break;
		case 2: port=5000;break;
		case 3: port=5500;break;
		
		default:port=3000;
			break;
		}
		System.out.println("port=>"+port);
		//-------------------------------------------------------------------
		//1.클라이언트 정보 저장->벡터생성
		v=new Vector();//생성자에서는 다른 클래스의 객체명을 사용 가능
		
		try {
			//2.서버소켓객체->포트열어준다.
			//ss=new ServerSocket(5432);//7777
			ss=new ServerSocket(port);
			System.out.println("ss=>"+ss);
			System.out.println("채팅서버 가동중....");
			
			while(true) { //for(;;)
				s=ss.accept();//요청을 받아들이는 메서드
				System.out.println("Accepted from"+s);
				//생성자->ServerThread객체를 생성->매개변수로 전달
				st=new ServerThread(this,s);//1.ChatGUIServer객체전달 2.연결된소켓객체전달
			    //v.add(st);
				this.addThread(st);
				st.start();//->ServerThread에서의 run()호출
			}
		}catch(Exception e) {
			System.out.println("서버의 접속 실패=>"+e);//e.toString()
			//e.printStackTrace();
		}
	}
	
	//1.접속한 클라이언트의 정보를 벡터에 저장->입력=>저장
	public void addThread(ServerThread st) {
		   v.add(st);//cg,s(접속한 클라이언트 정보)
	}
	
	//2.퇴장한 클라이언트의 정보를 벡터에서 삭제->ServerThread에서 cg
	public void removeThread(ServerThread st) {
		   v.remove(st);
	}
	
	//3.각 클라이언트에게 실시간으로 메세지를 전달시켜주는 메서드
	public void broadCast(String str) {
		for(int i=0;i<v.size();i++) {
			ServerThread st=(ServerThread)v.elementAt(i);
			//접속한 클라이언트->str를 각각 출력
			st.send(str);
		}
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
           new ChatGUIServer();
	}
}

//실시간으로 데이터를 전송->쓰레드 기능
class ServerThread extends Thread {
	
	//추가
	Socket s;//클라이언트와 통신->InputStream,OutputStream객체를 얻어올수
	             //                              있다.
	ChatGUIServer cg;//cg=new ChatGUIServer(); X->생성자를 두번호출X
	//입출력
	BufferedReader br;
	PrintWriter pw;//BufferedWriter bw; 출력용->자동으로 버퍼에 저장된내용을
	                      //바로바로 출력시켜주는 스트림
	String str;//전달할 문자열
	String name;//대화명(id)
	
	//st=new ServerThread(this,s); 서버에서 생성자를 통해서 객체전달
	public ServerThread(ChatGUIServer cg,Socket s) {
		
		  this.cg=cg;
		  this.s=s;
		  //입출력을 만들어서 연결
		  try { //1.System.in 2.원격컴퓨터(socket)->s.getInputStream()
			  br=new BufferedReader(new InputStreamReader
					                                                        (s.getInputStream()));
			  //단방향->BufferedWriter() 주목->bw.print()->출력
			  //입출력->WriteHello예제->어느정도 양이 버퍼에 쌓아놓는다.->한꺼번에 출력
			  //bw.flush();=>버퍼에 저장된 양에 상관없이 바로바로 출력하라
			  //1.출력객체명 2.버퍼에 저장된 내용을 자동으로 출력시켜주는 옵션
			  pw=new PrintWriter(s.getOutputStream(),true);//autoflush때문에
		  }catch(Exception e) {
			  System.out.println("연결실패(e)=>"+e);
		  } 
	}
	//데이터를 전송해주는 메서드(클라이언트)
	public void send(String str) { //<--broadCast()내부에서
		pw.println(str);
		pw.flush();
	}
	//실시간 데이터를 전송,받는 코딩->클라이언트 프로그램을 종료=>퇴장
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			pw.println("먼저 대화명을 입력하세요?");//<--->br
			name=br.readLine();
			//각 클라이언트에게 특정아이디가 입장했다는 메세지를 전달
			cg.broadCast("["+name+"]님이 입장하셨습니다.");
			//상대방의 문자열을 계속 전달
			while((str=br.readLine())!=null) {
				cg.broadCast("["+name+"]"+str);
			}
		}catch(Exception e) {//종료시 연결해제->퇴장으로 간주
			//접속한 사용자가 퇴장->현재 접속자들에게 실시간으로 전송
			cg.removeThread(this);
			cg.broadCast("["+name+"]님이 퇴장하셨습니다.");
			//s.getInetAddress()->상대방의 접속ip주소
			System.out.println(s.getInetAddress()+"의 연결이 종료되었습니다.!");
		}
	}
}










