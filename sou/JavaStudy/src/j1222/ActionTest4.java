package j1222;

import java.awt.*;//그래픽->*->클래스만 적용(파일만)
                            //서브패키지는 적용X
import javax.swing.*;//JFrame

//1.이벤트를 처리
import java.awt.event.*;//

//2.발생이벤트를 감지하는 리스너를 상속------------------------------------
public class ActionTest4 extends JFrame{

	JButton b1;
	public ActionTest4(String s) {
		  super(s);
		  setBounds(300,300,400,200);//창의 위치,크기지정
		  //버튼생성->부착
		  b1=new JButton("종료");
		  FlowLayout fl=new FlowLayout();
		  getContentPane().setLayout(fl);
		  add(b1);
		  //ActionListener al=new ActionListener(){~}
		  b1.addActionListener(new ActionListener() {
			  //이벤트핸들러 메서드를 지정
			  public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					System.out.println("프로그램종료됨!");
					System.exit(0);
				}
		  }  
          );
		  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            new ActionTest4("익명의 내부클래스가 이벤트처리");
	}
}


















