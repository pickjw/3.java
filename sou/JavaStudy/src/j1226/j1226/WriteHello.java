package j1226;

import java.io.*;//입출력.

//입출력 프로그램=>파일 읽어들여서(read) 출력(write)
public class WriteHello {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		//byte=>입출력의 기본자료형(=데이터의 전송단위)
		//문자를 사용 => 컴퓨터가 '아스키코드값'으로 변환(byte[]) 후 데이터를전송->문자로 변환
		byte hello[]= {72,101,108,108,111,32,87,111,114,108,100,33,10};
		byte a=72;
		//System.out : 표준출력장치(모니터,프린터)/ System.in: 표준 입력장치(키보드)
		System.out.println((char)a);
		System.out.println(hello); //배열은 객체로인식하기때문에 =>주소를출력.
		System.out.write(a); //H
		System.out.write(hello);//Hello World!
		
		byte name[]= {74,43,72,89,69,32,72,69,69,87,79,78};
		System.out.write(name);
	}

}
