package j1226;

import java.awt.*;//그래픽
import javax.swing.*;//스윙
import java.awt.event.*;//이벤트처리

public class ButtonEvent extends JFrame implements ActionListener {

	JButton b1, b2, b3, b4;
	JTextField tf1;// 사용자로부터 값을 입력받을때 ->JTextArea(채팅창)

	public ButtonEvent() {
		super("버튼의 이벤트연결");
		setBounds(300, 200, 300, 500);
		// 부착시킬 컴포넌트의 생성,이벤트연결,배치관리자 변경
		// JFrame의 객체만 getContentPane()을 이용해서 코딩.
		this.getContentPane().setLayout(new GridLayout(5, 1, 3, 3));// 5행1열 가로세로 사이의공백
		// 객체5개 만듬.
		b1 = new JButton("시작");
		b2 = new JButton("고");
		b3 = new JButton("백");
		b4 = new JButton("점프");
		tf1 = new JTextField(""); // 빈문자열에 해당되는 텍스트 입력창.

		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(tf1); // this생략

		// 이벤트연결
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		tf1.addActionListener(this);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // WindowClosing()
		setVisible(true);
	}

	// 버튼을 클릭할때 자동적으로 호출되는 메서드=>actionPerformed
	// ActionEvent e ->이벤트 발생 컴포턴트 정보를 받음.
	// 1.이벤트를 발생시킨 이름을 얻어올수있다. ->e.getActionCommand();
	// 2.이벤트를 발생시킨 컴포넌트의 종류->e.getSource()->tf1을 구분
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String s = e.getActionCommand();
		System.out.println(e.getActionCommand());
		// 이벤트를 발생시킨 컴포넌트의 정보를 얻어온다. ->e.getSource()
		Object o = e.getSource();
		// 버튼인지 , 텍스트필드 인지 구분할수있게하는것?-> 객체명 instanceof 연산자 부모자료형
		if (o instanceof JButton) { // 자식컴포넌트구분->자식에 맞게 내용처리
			JButton b = (JButton) o; // 자식클래스의 객체=(자식형)부모형

			// 각 버튼
			if (s.equals("시작")) {
				b.setBackground(Color.red);
				setTitle(s);
			} else if (s.equals("고")) {
				b.setBackground(Color.yellow);
			} else if (s.equals("백")) {
				b.setBackground(Color.blue);
				setTitle(s);
			} else {
				b.setBackground(Color.orange);
				setTitle(s);
			}
		} else {// 이벤트를 발생시킨 컴포넌트가 JTextField라면
			JTextField tf2 = (JTextField) o;
			// setText(글자) =>텍스트필드에 글자를쓸때 사용하는메서드!
			// getText() =>쓴 글자를 얻어오는 메서드!
			tf2.setText("객체형변환이 중요함!");
			setTitle(tf2.getText());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ButtonEvent();
	}
}
