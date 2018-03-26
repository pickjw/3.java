package j1221;

import java.util.Scanner;

//Scanner클래스의 객체를 얻어오는 메서드 2개를 작성->Setter,Getter 방법
//p265(참조형 매개변수=>Setter Method),
//p269(참조형 반환타입=>Getter Method)

public class ScanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		(1) new연산자를 이용
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력하세요?");
		String str = sc.nextLine();
		System.out.println("입력받은 문자열은=>"+str);*/
		ScanTest st=new ScanTest();
		//Scanner sc = new Scanner(System.in);
		Scanner sc=st.getScan();
		st.setScan(sc);//setScan()를 호출하면서 Scanner객체를 전달
	}
	//(2)Scanner객체를 만들어서 갖다주는 메서드 작성->getXXXX()
	public Scanner  getScan() {  //반환형(객체)
		/*Scanner sc = new Scanner(System.in);
		return sc;*/
		return  new Scanner(System.in);//객체이름을 정확하게 모를뿐
	}
	
	//(3)main->setXXX(객체)=>메서드호출->출력
	public void setScan(Scanner sc) {
		System.out.println("문자열을 입력하세요?");
		String str = sc.nextLine();
		System.out.println("입력받은 문자열은=>"+str);
	}
}







