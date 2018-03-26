package j1220;

import java.util.Scanner;

//사용자로부터 값을 입력->대<->소문자로 변환해서 출력
public class ConvertTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력하세요?");
		String str = sc.nextLine();
		// "abA"->'a','b','A'->"ABa" ->length(),charAt(),메서드?
		//System.out.println("입력받은 문자열의 길이(str.length())=>" + str.length());
		// System.out.println(str.charAt(0)+","+str.charAt(1)+","+str.charAt(2));
		char ch;
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
           if(Character.isUpperCase(ch))  //대문자라면
			    System.out.print(Character.toLowerCase(ch)); //대->소,소->대
           else
        	    System.out.print(Character.toUpperCase(ch));
		}//for
	}
}





