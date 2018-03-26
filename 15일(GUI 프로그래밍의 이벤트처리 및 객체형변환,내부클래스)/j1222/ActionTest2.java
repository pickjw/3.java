package j1222;

import java.awt.*;//그래픽->*->클래스만 적용(파일만)
                            //서브패키지는 적용X
import javax.swing.*;//JFrame

//1.이벤트를 처리
import java.awt.event.*;//

//2.발생이벤트를 감지하는 리스너를 상속------------------------------------
public class ActionTest2 extends JFrame{

	JButton b1;
	public ActionTest2(String s) {
		  super(s);
		  setBounds(300,300,400,200);//창의 위치,크기지정
		  //버튼생성->부착
		  b1=new JButton("종료");
		  FlowLayout fl=new FlowLayout();
		  getContentPane().setLayout(fl);
		  add(b1);
		  //4.이벤트소스(버튼)->리스너가 감지->메서드호출->연결
		  //형식) 이벤트소스명.addXXXXListener(이벤트객체명);
		  Other ot=new Other();
		  b1.addActionListener(ot);//현재 클래스가 처리해주는 경우는 this를 쓴다.
		  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            new ActionTest2("외부클래스가 이벤트처리");
	}
}

//이벤트를 대신 처리해주는 클래스를 따로 작성
class Other implements ActionListener{
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("프로그램종료됨!");
		System.exit(0);
	}
}


















