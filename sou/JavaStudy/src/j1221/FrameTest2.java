package j1221;

import java.awt.*;//그래픽에 관련된 기본패키지
import javax.swing.*;//JFrame

//2.창을 상속받자
public class FrameTest2 extends JFrame {
	
	public FrameTest2(String s) { //생성자->일반메서드->객체명.일반메서드명(~)
		 //super(s);//setTitle(s)
		 this.setTitle(s);
		//창의 제목을 출력기능
		setBounds(200,400,300,200);
		    //3.x버튼클릭시 종료할수 있도록
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			//4.창을 화면에 보여달라
	    setResizable(false);//확대금지
	    setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //1.Frame 생성
		FrameTest2 f=new FrameTest2("창의 제목을 출력");
	}
}
