package j0105;
//Properties파일의 중요한 역할->파일로 저장,불러오기
//C:\webtest\3.java\sou\JavaStudy\src\ex1.properties
/*
 * a=test
    b=imsitest
 */
import java.util.*;
import java.io.*;

public class ProTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //1.파일불러오기
		Properties  pro=new Properties();
		//FileInputStream fis=new ~
		try {
			pro.load(new FileInputStream
					("C:/webtest/3.java/sou/JavaStudy/src/ex1.properties"));
		}catch(IOException e) {
			System.out.println("파일불러오기 오류=>"+e);
		}catch(Exception e) {
			e.printStackTrace();
		}
		//2.저장된 속성값을 불러오기->getProperty("키명")<->setProperty(키명,값)
		String avalue=pro.getProperty("a");
		System.out.println("a의 속성값=>"+avalue);
		//3.저장된 속성명의 특정값을 변경->setProperty(키명,값)
		pro.setProperty("b", "property test");//imsitest->property test로 변경
		//메모리상에서만 변경-->파일에서도 변경->store
		System.out.println("pro.getProperty('b')=>"+pro.getProperty("b"));
		//4.실제 파일에 반영->store(동기화)->메모리상태=파일저장상태
		try {
			pro.store(new FileOutputStream
					("C:/webtest/3.java/sou/JavaStudy/src/ex1.properties"),null);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}











