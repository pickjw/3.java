package j1227;
//메모리상-->파일에 저장(기본 자료형에 맞게)

import java.io.*;

public class DataOutTest {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
       //1.파일로 저장
		FileOutputStream fos=new FileOutputStream("c:/webtest/3.java/data.txt");
	   //2.자바의 자료형에 맞게 내용을 포장
		//생성자의 매개변수가 부모형->자식클래스의 객체도 적용(객체형변환)
		DataOutputStream dos=new DataOutputStream(fos);
		//3.메모리에 저장
		char han='한';
		System.out.println((int)han);//아스키코드값
		byte b=21;
		String str="bg\n";
		byte ba[]= {65,66,67};//A,B,C
		//파일로 저장
		dos.writeChar(han);
		dos.writeByte(b);
		dos.writeBytes(str);//dos.writeChars(str)도 된다.
		dos.write(ba);//아스키코드값을 변환->문자로 변환
		dos.close();
	}
}





