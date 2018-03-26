package j1227;

import java.io.*;

//외부의 파일을 읽어들여서 데이터값을 모니터에 출력
public class FileInputTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //한글데이터->FileReader ,영문자위주->FileInputStream
		// \=>인식X  \\ or /를 사용할것
		try {
		FileInputStream fis=new FileInputStream("C:/webtest/3.java/readme.txt");
		int read=0;//파일을 읽어들여서 임시로 저장할 목적변수 선언
		
		/*(1)
		    while(read!=-1) {//-1값을 리턴할때까지 계속해서 읽어들인다면
			read=fis.read();//한줄씩 읽어들여서 read변수에 저장
			System.out.write(read);
		}*/
		
		//(2)
		while(true) {
			read=fis.read();//한줄씩 읽어들여서 read변수에 저장
			//추가
			if(read==-1) break;
			System.out.write(read);
		}
		
		fis.close();//메모리 해제
		
		}catch(IOException  e) {
			System.out.println(e);
			System.out.println("외부에서 파일을 읽어들이는데 실패했습니다.!");
		}
	}
	
	
	
	

}
