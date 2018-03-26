package j1221;

import java.util.Scanner;

//사용자로부터 값을 입력->대<->소문자로 변환해서 출력
public class ConvertTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {  //for(;;){
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력하세요?");
		String str = sc.nextLine();
		//e or E인지 체크
		if(str.equalsIgnoreCase("e")) {//if(str.equals("e") || str.equals("E")) {
			System.out.println("프로그램이 정상적으로 종료됩니다.");
			System.exit(0);
		}
		char ch;
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);//무조건 영문자인 경우
		  if(Character.isDigit(ch)) { //숫자인 경우
			  System.out.println("영문자만 입력이 가능합니다.");
			  System.out.println("프로그램 자동종료!");
			  return;//System.exit(0);
		  }else {//정상적인 영문자라면
           if(Character.isUpperCase(ch))  //대문자라면
			    System.out.print(Character.toLowerCase(ch)); //대->소,소->대
           else
        	    System.out.print(Character.toUpperCase(ch));
		  }
		}//for
		System.out.println();//줄바꿈  System.out.print('\n')
	  }//while
	}
}





