package j0104;

import java.net.*;//Socket클래스
import java.io.*;//입출력
import java.awt.*;//GUI
import java.awt.event.*;//event

//추가
import javax.swing.*;//JFrame,JTextArea,JTextField,

class ChatGUIClient extends JFrame  implements ActionListener,Runnable
{
	JTextArea ta;//클라이언트의 대화를 출력
	JTextField tf;//입력
	//추가
	JScrollPane js;//스크롤바가 나오게 해주는 컴포넌트
    //---추가------
	Socket s;//서버와 통신하기 위해서
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
	   tf.addActionListener(this);
	   setBounds(200,200,500,350);
	   setVisible(true);
	   tf.requestFocus();//커서입력

	   //종료
	   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   //서버와 연결하는 구문
	   try{
		   //1.접속할 컴퓨터ip주소,포트번호
		   s=new Socket("192.168.0.57",5432);
		   System.out.println("s=>"+s);
		  
	   }catch(Exception e){
		   System.out.println("접속오류="+e);
	   }
	   //Thread 객체를 생성->run()호출
	   Thread ct=new Thread(this);
	   ct.start();//run()
	}
    //run
	public void run() {
		//더 이상 입력받을 수 없을때까지 ->JTextArea
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) 
	{
		new ChatGUIClient();
	}
}
