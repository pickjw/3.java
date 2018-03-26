package j0105;

import java.net.*;//Socket클래스
import java.util.Properties;
import java.io.*;//입출력
import java.awt.*;//GUI
import java.awt.event.*;//event

//추가
import javax.swing.*;//JFrame,JTextArea,JTextField,

//이벤트처리+쓰레드 기능까지 구현
class ChatGUIClient extends JFrame  implements ActionListener,Runnable
{
	JTextArea ta;//클라이언트의 대화를 출력
	JTextField tf;//입력
	//추가
	JScrollPane js;//스크롤바가 나오게 해주는 컴포넌트
    //---추가------
	Socket s;//서버와 통신하기 위해서
	BufferedReader br;//입력
	PrintWriter pw;
	String str,str1;//서버,대화에 출력할 문자열
	//-------------------------------------------
	
	public ChatGUIClient(){
       //객체생성 및 배치
	   ta = new JTextArea();
	   tf = new JTextField();
	   //추가
	   js=new JScrollPane(ta);//JTextArea가 결합된 스크롤바
	   //-------------------------
	   add(js,"Center");//BorderLayout.CENTER
	   add(tf,"South");//아래
	   tf.addActionListener(this);//이벤트소스->tf
	   setBounds(200,200,500,350);
	   setVisible(true);
	   tf.requestFocus();//커서입력

	   //종료
	   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   //서버와 연결하는 구문
	   try{
		   //-------------------------------------------
		   Properties props=new Properties();
			//FileInputStream in=null;
			FileInputStream in = 
					    new FileInputStream
					        ("C:/webtest/3.java/sou/JavaStudy/src/j0105/port.properties");
			String ip="";//불러올 ip주소를 저장
			
			if(in!=null && in.available() > 0) {
				props.load(in);
				ip=props.getProperty("ip");
			}
		   //--------------------------------------------
		   //1.접속할 컴퓨터ip주소,포트번호
		   //s=new Socket("192.168.0.57",5432);
		   s=new Socket(ip,5432);
		   System.out.println("s=>"+s);
		   //입출력스트림
		   br=new BufferedReader(new InputStreamReader(s.getInputStream()));
           pw=new PrintWriter(s.getOutputStream(),true);
	   }catch(Exception e){
		   System.out.println("접속오류="+e);
	   }
	   //Thread 객체를 생성->run()호출
	   Thread ct=new Thread(this);//ChatGUIClient객체
	   ct.start();//run()
	}
    //run
	public void run() {
		//더 이상 입력받을 수 없을때까지 ->JTextArea
		try {
			while((str1=br.readLine())!=null) {
				ta.append(str1+"\n");//상대방이 보내준 글자를 세로로 출력
			}
		}catch(Exception e) {e.printStackTrace();}
	}
	//채팅할때->이벤트발생시 호출되는 메서드->글자->서버->상대방
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		str=tf.getText();
		tf.setText("");//새로 입력하기위해서
		pw.println(str);//내가 입력한글자
		pw.flush();
	}
	public static void main(String[] args) 
	{
		new ChatGUIClient();
	}
}
