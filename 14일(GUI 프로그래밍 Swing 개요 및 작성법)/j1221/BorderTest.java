package j1221;

import java.awt.*;//그래픽
import javax.swing.*;//JFrame

public class BorderTest extends JFrame {

	public BorderTest() {
		 setTitle("배치관리자 연습");
		 setBounds(300,300,400,300);//x,y,w,h
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 //생성자에서는 자기클래스의 객체명은 사용X, 다른 클래스의 객체명은 사용O
		 /*Color c=new Color(255,255,0);//r,g,b(0~255)
		 getContentPane().setBackground(c);*/
		 getContentPane().setBackground(new Color(255,255,0));
		 //getContentPane().setBackground(Color.yellow); 정적상수명
		 setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         //BorderTest bt=new BorderTest();//객체명이 있는 경우 다음문장->메서드
		                     new BorderTest();
	}
}





