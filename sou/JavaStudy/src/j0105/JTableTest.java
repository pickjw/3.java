package j0105;

//MVC모델-> 1.Model(모델)->데이터 저장영역->배열로 저장
//                 2.View(화면에 보여주는 부분)->컴포넌트(디자인)
//                 3.Controller->Model==이벤트처리==>View에 보여줄것인가?

import java.awt.*;//그래픽
import javax.swing.*;//스윙

public class JTableTest extends JFrame{
    //부착
	JTable table;
	
	public JTableTest() {
		setTitle("JTable 구조연습");
		setBounds(300,300,300,200);
		//1.JFrame에 부착시킬 JTable을 생성->Model
		String header[]= {"one","two","three"};//컬럼명(타이틀)
		String cells[][]= {{"111","222","333"},
				                    {"444","555","666"},
				                    {"777","888","999"}};
		
		//2.JTable을 생성->1)데이터 부분(모델) 2) 컬럼명
		
		table=new JTable(cells,header);//JTable+모델을 결합
		JScrollPane js=new JScrollPane(table);//JScrollPane+JTable이 결합
		this.add(js);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
                 new JTableTest();
	}

}





