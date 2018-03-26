package j0105;

//MVC모델-> 1.Model(모델)->데이터 저장영역->배열로 저장
//                 2.View(화면에 보여주는 부분)->컴포넌트(디자인)
//                 3.Controller->Model==이벤트처리==>View에 보여줄것인가?

import java.awt.*;//그래픽
import javax.swing.*;//스윙->JTable
//추가
import javax.swing.table.*;//JTable에서 사용하는 DefaultTableModel
//                                          을 불러오기 위해서 필요(데이터 저장)

import java.awt.event.*;//ActionEvent->ActionListener

public class JTableTest2 extends JFrame implements ActionListener{
    //부착
	JLabel l1,l2,l3;//이름,나이,전화
	JTextField tf1,tf2,tf3;
	JPanel panel;// JLabel,JTextField와 같은 다른 컴포넌트를 포함(Container)
	//JTable
	Object ob[][]=new Object[0][3];//데이터표시(행X)->열만 표시
	DefaultTableModel model;//데이터 저장부분
	JTable table;
	JScrollPane js;//스크롤바
	String str[]= {"이름","나이","전화번호"};//컬럼명
	
	public JTableTest2() {
		setTitle("테이블에 데이터를 입력연습");
		panel=new JPanel();
		panel.setBackground(Color.orange);
		//1.문자열 2.위치(left,Center,right)
		l1=new JLabel("이름",JLabel.CENTER);
		l2=new JLabel("나이",JLabel.LEFT);
		l3=new JLabel("전번",JLabel.RIGHT);
		
		tf1=new JTextField(); tf2=new JTextField(); tf3=new JTextField();
		//패널의 배치->3*2=>GridLayout
		panel.setLayout(new GridLayout(3,2));
		panel.add(l1); panel.add(tf1);
		panel.add(l2); panel.add(tf2);
		panel.add(l3); panel.add(tf3);
		//JFrame
		this.add("North",panel);//위치,부착시킬 컴포넌트명
		//JTable을 가운데배치->1.모델생성->2.JTable에 결합->JScrollPane->JFrame
		model=new DefaultTableModel(ob,str);//[][],[]컬럼
		table=new JTable(model);
		js=new JScrollPane(table);
		this.add("Center",js);
		setBounds(700,300,300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		//이벤트를 연결하는 코딩
		tf1.addActionListener(this);
		tf2.addActionListener(this);
		tf3.addActionListener(this);
	}
	 //e.getSource()->컴포넌트
	 @Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==tf1) {//이름을 입력하고 나서 enter친 경우라면
			tf2.requestFocus();//커서 이동
		}else if(e.getSource()==tf2) {//나이 입력한 후 enter
			tf3.requestFocus();
		}else if(e.getSource()==tf3) {//전번
			if(tf1.getText().equals("") && tf2.getText().equals("") &&
			   tf3.getText().equals("")) {
				//JOptionPane.showMessageDialog(부모객체명,경고메세지)
				JOptionPane.showMessageDialog(this,"값을 하나라도 입력해야됩니다");
			    tf1.requestFocus();
			    return;//탈출문
			}
			//다입력하고 나서 값을 모델에 데이터를 입력->JTable에 결합해서 보여준다
			//Object data[]= {"홍길동","23","02-123-0978"};
			Object data[]= {tf1.getText(),tf2.getText(),tf3.getText()};
			model.addRow(data);
			//재입력하도록 설정
			tf1.setText("");
			tf2.setText("");
			tf3.setText("");
			tf1.requestFocus();//커서입력
		}
	}
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
                 new JTableTest2();
	}
}





