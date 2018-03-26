package j1227;

import java.io.*;

//외부의 파일을 읽어들여서 데이터값을 모니터에 출력
public class FileInputTest2 {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        
		FileInputStream fis=new FileInputStream("C:/webtest/3.java/epp420_64bit.exe");
		//추가
		//(1)
		/*File f=new File("C:/webtest/3.java/abc3.txt");
		FileOutputStream fos=new FileOutputStream(f);*/
		
		//(3)
		FileOutputStream fos=new FileOutputStream
				       (new File("C:/webtest/3.java/kkk.exe"));
		//(2)
		//FileOutputStream fos=new FileOutputStream("C:/webtest/3.java/abc3.txt");
		int read=0;//파일을 읽어들여서 임시로 저장할 목적변수 선언
		
		while(true) {
			read=fis.read();//한줄씩 읽어들여서 read변수에 저장
			//추가
			if(read==-1) break;
			//System.out.write(read);
			fos.write(read);
		}
		
		fis.close();//메모리 해제
		fos.close();
		
	}
}
