package j0108;

//MVC모델-> 1.Model(모델)->데이터 저장영역->배열로 저장
//                 2.View(화면에 보여주는 부분)->컴포넌트(디자인)
//                 3.Controller->Model==이벤트처리==>View에 보여줄것인가?

import java.awt.*;//그래픽
import javax.swing.*;//스윙->JTable
//추가
import javax.swing.table.*;//JTable에서 사용하는 DefaultTableModel
//                                          을 불러오기 위해서 필요(데이터 저장)

import java.awt.event.*;//ActionEvent->ActionListener

//추가2
import java.sql.*;//DB연동 1)
//-------------------------------

public class DB_Person extends JFrame implements ActionListener{
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
	
	//DB연동 관련 객체 선언 2)
	Connection con=null;
	PreparedStatement pstmt=null;//SQL구문을 실행->select or insert
	ResultSet rs=null;//select구문을 사용->결과값이 반드시 나오게 되어있다.
	//--------------------------------------------------------------------------------
	//생성자->초기화 작업->화면디자인
	public DB_Person() {
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
		//3.DB연결->생성자->다른 메서드를 따로 뽑아서 작성->호출
		connect();
		//4.select * from person
		select();
		//5.x버튼을 클릭->프로그램 종료->DB작업한 내용을 메모리 해제
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				//DB연결해제
				try {
					if(rs!=null) rs.close();
					if(pstmt!=null) rs.close();
					if(con!=null) con.close();
					System.out.println("정상적으로 DB메모리 해제됨!");
				}catch(Exception e2) {}
				System.exit(0);
			}
		});
	}
	//단순,반복적으로 실행->매개변수X, 반환값 X
	private void connect() {
        try {
        	//1.접속할 데이터베이스의 드라이버를 메모리에 로드
        	Class.forName("oracle.jdbc.driver.OracleDriver"); 
        	//2.연결객체 얻어온다.(1.접속할 컴퓨터의 위치 2.접속할계정 3.암호)
        	String url="jdbc:oracle:thin:@localhost:1521:orcl";
        	con=DriverManager.getConnection(url, "scott", "tiger");
            System.out.println("접속 con=>"+con);
        }catch(Exception e) {
        	System.out.println("DB접속 오류=>"+e);
        }
	}
	//application이 실행하면 무조건 ->select만
	public void select() { //select * from person;
		try {
			String sql="select * from person";
			pstmt=con.prepareStatement(sql);
			System.out.println("pstm=>"+pstmt);
			rs=pstmt.executeQuery();
			System.out.println("rs=>"+rs);
			//person테이블에서 불러와서 JTable에 출력
			while(rs.next()) {//불러올 수 있는 상태라면 rs.next()==true인 동안
				String name=rs.getString("name");
				String age=rs.getString("age");
				String tel=rs.getString("tel");
				//JTable의 화면에 출력
				Object data[]= {name,age,tel};
				model.addRow(data);//테이블의 필드값
				//-----------------------------------------------
				System.out.println(name+","+age+","+tel);
			}
		}catch(Exception e) {
			System.out.println("select()메서드 실행중 오류=>"+e);
		}
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
			//실제로 모델에 추가된 데이터를 person테이블에도 똑같이 필드별로 저장
			try {
				String sql="insert into person values(?,?,?)";
				pstmt=con.prepareStatement(sql);
				//pstmt.set자료형(?순서번호,저장할값)->setString,setInt~
				pstmt.setString(1, tf1.getText());//입력받은 값을 그대로 적용
				pstmt.setString(2, tf2.getText());
				pstmt.setString(3, tf3.getText());
				int insert=pstmt.executeUpdate();//1(성공) or 0(sql구문이 실패했을때 반환)
				//insert한 레코드갯수 1
				System.out.println("데이터 성공유무(insert)=>"+insert);
				//제대로 데이터가 추가됐는지를 확인하는 방법
				rs=pstmt.executeQuery("select * from person");
				while(rs.next()) {//불러올 수 있는 상태라면 rs.next()==true인 동안
					String name=rs.getString("name");
					String age=rs.getString("age");
					String tel=rs.getString("tel");
					System.out.println(name+","+age+","+tel);
				}
				//-------------------------------------------------------------
			}catch(Exception e2) {
				System.out.println("person테이블에 데이터입력 실패=>"+e2);
			}
			//-------------------------------------------------------------------------
			//재입력하도록 설정
			tf1.setText("");
			tf2.setText("");
			tf3.setText("");
			tf1.requestFocus();//커서입력
		}
	}
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
                 new DB_Person();
	}
}





