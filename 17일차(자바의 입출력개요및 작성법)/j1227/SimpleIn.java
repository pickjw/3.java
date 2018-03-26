package j1227;

import java.io.*; //java.lang패키지를 제외한 나머지 무조건 import

public class SimpleIn {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//키보드로 값을 입력->저장->출력->더 이상 입력X=>-1을 리턴
		int charRead;//System.in.read()->문자-->숫자로 바꿔서 저장->문자변환출력
		//char->0~65535 저장범위
       System.out.println("입력하고자하는 문자열을 입력요망?");
         while((charRead=System.in.read())>=0) // 어떠한 글자라도 계속 입력중이라면
        	 System.out.write(charRead);
	}
}






