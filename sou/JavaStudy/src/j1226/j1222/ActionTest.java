package j1222;

import java.awt.*;//그래픽->*->클래스만 적용(파일만)
                            //서브패키지는 적용X
import javax.swing.*;//JFrame

//1.이벤트를 처리
import java.awt.event.*;//

//2.발생이벤트를 감지하는 리스너를 상속------------------------------------
public class ActionTest extends JFrame implements ActionListener{

	JButton b1;
	public ActionTest(String s) {
		  super(s);
		  setBounds(300,300,400,200);//창의 위치,크기지정
		  //버튼생성->부착
		  b1=new JButton("종료");
		  FlowLayout fl=new FlowLayout();
		  getContentPane().setLayout(fl);
		  add(b1);
		  //4.이벤트소스(버튼)->리스너가 감지->메서드호출->연결
		  //형식) 이벤트소스명.addXXXXListener(이벤트객체명);
		  b1.addActionListener(this);//현재 클래스가 처리해주는 경우는 this를 쓴다.
		  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            new ActionTest("버튼클릭");
	}
	//3.리스너에 해당하는 메서드를 작성(콜백메서드->운영체제기 자동으로 호출)
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("프로그램종료됨!");
		System.exit(0);
	}
}




