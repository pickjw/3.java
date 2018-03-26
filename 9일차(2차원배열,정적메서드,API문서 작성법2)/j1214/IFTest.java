package j1214;

import java.util.Scanner;

public class IFTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//-------------추가-------------------------------
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자하나를 입력해 주세요!");
        int su=sc.nextInt();
        //---------------------------------------------------
       if (su%2==0) {//짝수
    	   System.out.println(su+"은 짝수입니다.");
    	   System.out.println("블럭처리 연습1");  
       }else {
    	   System.out.println(su+"은 홀수입니다.");
    	   System.out.println("블럭처리 연습2");
       }
       System.out.println("====삼항연산자를 이용========");
       //변수=(조건식)?참인문장:거짓인 문장
       //String su2=(su%2==0)?"짝수":"홀수";
       String su2=(su%2==1)?"홀수":"짝수";
       System.out.println("입력받은값(su)은"+su2+"입니다.");
       System.out.println("if문 연습");
       //절대값(su)->음수->양수,양수->양수
       su=(su < 0)?-su:su;
       System.out.println("절대값(su)=>"+su);
       //정적메서드(=클래스메서드)->내장(java.lang.Math~)
       System.out.println("정적메서드 사용");
       su=Math.abs(su);//-2500->2500
       System.out.println("절대값 su=>"+su);
       int max=Math.max(34, 98);
       int min=Math.min(34, 98);
       System.out.println("최대값(max)="+max+"이고,최소값(min)=>"+min);
	}
}







