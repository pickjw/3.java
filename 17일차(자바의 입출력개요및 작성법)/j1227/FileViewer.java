package j1227;
//채팅창
//AWT->Swing+입출력
import java.awt.*;
import java.awt.event.*;//이벤트처리
import java.io.*;//외부파일 불러오기

public class FileViewer extends Frame implements ActionListener {

	TextArea ta;//글내용(여러줄 출력)
	TextField tf;//입력창
	
	public FileViewer() {
		  super("파일불러오기");
		  setBounds(250,250,400,300);
		  setResizable(false);//확대금지=>
		  //add(컴포넌트,위치)=>add(위치, 컴포넌트명)
		  add("Center",ta=new TextArea());//만들면서 부착
		  add("South",tf=new TextField());
		  //x버튼 종료
		  this.addWindowListener(new WindowAdapter() {
			  @Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);//정상종료
			}
		  });
		  //이벤트연결
		  tf.addActionListener(this);
		  setVisible(true);
	}
	//불러올  파일의 내용->byte[]에 임시저장->변수에 담아서 ->TextArea에 출력
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//이벤트발생시킨 컴포넌트->e.getSource()
		Object source=e.getSource();
		  if(source==tf) {//이벤트발생시킨 컴포넌트가 tf가 맞다면
		     //불러올 파일명 확인
			  String fileName=tf.getText();
			  System.out.println("fileName=>"+fileName);
			  tf.setText("");//다음의 불러올 파일명을 편하게 입력하기위해서
			  File f=new File(fileName);//f.length()->파일의 길이(들여있는 내용만큼)
			  System.out.println("파일의 길이(length)=>"+f.length());
			  try {
				  int readByte=0;//파일의 내용을 읽어들여서 저장
				  FileInputStream fis=new FileInputStream(f);
				  //불러오는 파일의 크기만큼 메모리에 저장하기위해서 
				  byte input[] =new byte[(int)f.length()];
				  //byte[]에서 계속 읽어들여서 readByte에 저장==-1
				  while((readByte=fis.read(input))!=-1) {
					  //byte[]->String->화면에 출력
					  String s=new String(input);
					  ta.append(s);
					  System.out.println(s);
				  }
				  fis.close();//메모리 해제
			  }catch(Exception e2) {
				  System.out.println("경로명 및 파일명을 확인해주세요!");
			  }
		  }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
               new FileViewer();//이름이 없는 익명객체생성
	}
}





