package j1221;

import java.awt.*;//Frame
import javax.swing.*;//JFrame

public class FrameTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //1.Frame 생성
		JFrame f=new JFrame();
		//2.넓이,높이를 지정
		/*f.setLocation(200,400);//0,0
		f.setSize(300,200);*/
		f.setBounds(200,400,300,200);
	    //3.x버튼클릭시 종료할수 있도록
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//4.창을 화면에 보여달라
		f.setVisible(true);
	}
}
