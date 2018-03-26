package j1220;

import java.util.Scanner;

//String->자주 사용이 되는 메서드를 정리
public class StringTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("문자열을 입력하세요?");//nextLine(),next()
       String input=sc.nextLine();
       //정적메서드
       stringPrint(input);//"imsi2"
	}

	//입력을 받아서 처리해주는 직원->매개변수 O 반환값 X
	public static void stringPrint(String s) {
		//1.concat=>문자열을 결합=>새로 문자열->+
		System.out.println("s.concat('test')=>"+s.concat("test"));
		//2.substring(시작인덱스번호(O),종료인덱스번호(바로앞번호))
		//   substring(시작인덱스번호)->시작인덱스번호부터 문자열끝까지 출력
		//"imsi2"
		System.out.println("s.substring(1,4)=>"+s.substring(1,4));
		System.out.println("s.substring(1)=>"+s.substring(1));
		//3.toUpperCase()->대문자로 변환<->toLowerCase()
		System.out.println("s.toUpperCase()=>"+s.toUpperCase());
		//4.특정문자열을 변경->replace(변경전단어(i),변경후 단어(t));
		System.out.println("s.replace('i','t')=>"+s.replace('i','t'));
		//5.문자열의 길이를 구함->length()
		System.out.println("s.length()=>"+s.length());
		//6.문자열 중에서 특정위치에 있는 문자출력=->charAt(인덱스번호)
		System.out.println("s.charAt(2)=>"+s.charAt(2));
		//7.특정문자가 몇번째 인덱스번호에 위치? ->indexOf('찾는단어')->인덱스번호
		System.out.println("s.indexOf('s')=>"+s.indexOf('s'));
		//8.공백을 제거->trim()->"abcd     "=>"abcd"
		System.out.println("s.trim()=>"+s.trim());
	}
}





