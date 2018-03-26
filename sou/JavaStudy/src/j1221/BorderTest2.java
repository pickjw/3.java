package j1221;

import java.awt.*;//그래픽
import javax.swing.*;//JFrame

public class BorderTest2 extends JFrame {

	//멤버변수에 선언(부착시킬 컴포넌트)
	JButton b1,b2,b3,b4,b5;
	
	public BorderTest2() {
		 setTitle("배치관리자 연습");
		 setBounds(300,300,400,300);//x,y,w,h
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 getContentPane().setBackground(new Color(255,255,0));
		 //다른 컴포넌트를  생성->부착
		 b1=new JButton("연습1");
		 b2=new JButton("연습2");
		 b3=new JButton("연습3");
		 b4=new JButton("연습4");
		 b5=new JButton("연습5");
		 //컴포넌트를 부착->JFrame객체명.add(부착시킬 컴포넌트명,위치)
		 /* (1)
		 this.add(b1,BorderLayout.NORTH); //BorderLayout-->"North"
		 this.add(b2,BorderLayout.SOUTH);//내부적으로 문자열사용->"South" 
		 add(b3,"Center"); 
		 add(b4,"East");
		 add(b5,"West");*/
		 
		 /*(2)
		 FlowLayout fl=new FlowLayout();
		 getContentPane().setLayout(fl);*/
		 
		 //(3)행,열->생성자 매개변수가 필요
		 GridLayout gl=new GridLayout(3,2,5,5);//3행,2열,horizontal gap,vertical gap
		 getContentPane().setLayout(gl);
		 
		 add(b1);add(b2);add(b3);add(b4);add(b5);
		 
		 setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		                     new BorderTest2();
	}
}





