package j1214;

import java.util.Scanner;
//추가
import j1214.sub.PrintTest;
//----------------------------------
public class RepeatChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//자동 import 기능->ctrl+shift+o
		char ch;//입력받은 문자열에서 문자하나를 분리시켜서 저장변수
		int n;//반복할 횟수를 저장할 변수
        Scanner sc=new Scanner(System.in);// 01 ->substring   0
        System.out.println("반복할 문자를 입력?");//"ab"->'a','b', "a"->'a'
        String str=sc.nextLine();//"    a      " =>"a"->'a'
        ch=str.trim().charAt(0);
        System.out.println("반복할 숫자를 입력?");
        n=sc.nextInt();
        
        //(3) PrintTest 객체를 생성=>charPrint()를 호출
        PrintTest pt=new PrintTest();
        pt.charPrint(n,ch);
       /*  (2)
        RepeatChar rc=new RepeatChar();
        rc.charPrint(n, ch);*/
       /* (1)
        *  for(int i=1;i<=n;i++)
           System.out.print(ch);*/
	}
   //입력받은 문자열과 숫자만 입력을 받아서 처리
	/*(2)
	   void charPrint(int n,char ch) {
		 for(int i=1;i<=n;i++)
	           System.out.print(ch);
	}*/
}




