package j1220;
//프로그램->문자열 취급
public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //문자열=>객체로 취급(기본 자료형이 아니다.
		//         =>참조형(클래스형,배열,인터페이스)
		String str="Hello";//권장=>새로 무조건 공간 생성X->없으면 공간생성
		                           //주소값이 같고 내용도 같다
		String str2=new String("Hello");//무조건 새로 공간을 생성=>Hello
		                          //주소값이 다르고 내용은 같다
		String str3="Hello";
		String str4="Hello";
		//연산자=>==
		if(str==str2)
			System.out.println("주소값이 서로 같다");
		else
			System.out.println("주소값이 서로 다르다");
		//str,str3주소,내용을 비교
		if(str==str3)
			System.out.println("str과 str3는 주소값이 서로 같다");
		else
			System.out.println("str과 str3는 주소값이 서로 다르다");
		//equals(대소구분=>문자열 비교) ,equalsIgnoreCase
		if (str.equals(str3)) {
			System.out.println("str과 str3의 내용은 서로 같다.(Hello)");
		} else {
            System.out.println("str과 str3은 내용이 서로 다르다(Hello)");
		}
		
	}

}







