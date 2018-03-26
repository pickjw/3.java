package j1222;

import java.awt.*;//그래픽에 관련된 기본패키지
import javax.swing.*;//JFrame
//이벤트 처리
import java.awt.event.*;
//2.창을 상속받자
public class WindowTest extends Frame{
	
	public WindowTest(String s) { //생성자->일반메서드->객체명.일반메서드명(~)
		 //super(s);//setTitle(s)
		 this.setTitle(s);
		//창의 제목을 출력기능
		setBounds(200,400,300,200);
			//4.창을 화면에 보여달라
	    setResizable(false);//확대금지
	    //x버튼을 클릭->종료
	    //this.addWindowListener(new Test());
	    this.addWindowListener(new WindowAdapter() {
	    	public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.out.println("WindowClosing메서드 호출");
				System.exit(0);
			}
	    });
	    setVisible(true);
	}
	//내부 클래스->다중상속이 안되기때문에 이벤트처리를 할 수 가 없기때문에
	/*
	 *  class Test extends WindowAdapter{
		@Override
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			System.out.println("WindowClosing메서드 호출");
			System.exit(0);
		}
	}*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //1.Frame 생성
		WindowTest f=new WindowTest("윈도우 어댑터클래스이용");
	}
}







