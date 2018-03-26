package j1206;

public class IFTest {
//문1) 사용자로부터 값(숫자)을 입력을 받아서 짝수,홀수인지 판별?
//이클립스에서 화면에 출력하는 구문이 없으면 화면에 결과가 안나온다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int su=17;
       //제어문->if문->조건식(변수,수식)->둘중의 하나값을 체크하는 경우
       /*
        * (1)
        * if (su%2==0)//짝수
    	   System.out.println(su+"은 짝수입니다.");*/
       
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
	}
}







