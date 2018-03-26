package j0104;
//서버역할(1.접속한 클라이언트의 정보를 저장->메세지 전달
              //2.실시간 데이터 전송(쓰레드))

import java.net.*;//ServerSocket,Socket
import java.io.*;//PrintWriter,
import java.util.Vector;//List계열(동적 배열)->실시간으로 접속한 클라이언트수

public class ChatGUIServer {

	ServerSocket ss;//클라이언트와의 접속할때만 필요로하는 클래스 객체
	Socket s;//클라이언트와 통신(문자열 전송)
	Vector v;//실시간으로 접속할 클라이언트의 정보를 저장
	
	//서버를 가동->클라이언트가 접속할때 기다린다.(무한루프)
	public ChatGUIServer() {
		//1.클라이언트 정보 저장->벡터생성
		v=new Vector();//생성자에서는 다른 클래스의 객체명을 사용 가능
		
		try {
			//2.서버소켓객체->포트열어준다.
			ss=new ServerSocket(5432);//7777
			System.out.println("ss=>"+ss);
			System.out.println("채팅서버 가동중....");
			
			while(true) { //for(;;)
				s=ss.accept();//요청을 받아들이는 메서드
				System.out.println("Accepted from"+s);
			}
		}catch(Exception e) {
			System.out.println("서버의 접속 실패=>"+e);//e.toString()
			//e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           new ChatGUIServer();
	}
}

//실시간으로 데이터를 전송->쓰레드 기능
class ServerThread extends Thread {
	
	//입출력
	BufferedReader br;
	PrintWriter pw;//BufferedWriter bw; 출력용
	String str;//전달할 문자열
	String name;//대화명(id)
}










