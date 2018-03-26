package j1207;

public class ForTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println(".for문의 형태");
      System.out.println("1.c++형태의 for문");
      for(int i=1;i<=5;i++)
    	  System.out.println("반복문for"+i);
      System.out.println("for문 종료");
      System.out.println("2.c언어형태의 for문");
      
      /*
      int k;//for문 밖에 변수선언
      for(k=10;k>5;k--)
    	  System.out.println(k+"테스트");*/
      
      int k=10;//초기식이 for문 밖에서 선언이 가능
      for(;k>5;k--)
    	  System.out.println(k+"테스트");
      
      System.out.println("3.초기식,증감식 생략가능");
      int c=1;//초기식
      //c++; 증감식은 for문 밖에 선언X ->for문 내부에 작성
       for(;c<=20;) {//while(c<=20)  for(;;) ->while(true)
    	  System.out.println("20번 반복"+c);
          c++; //c=c+1
      }//for
       System.out.println("4.합계,곱을 구하기");
       //합계->1+2+3+4...100=5050(sum)->반복할 횟수,합계
       int sum=0;
       int gap=1;// 곱
       for(int i=1;i<=5;i++) {
    	    sum+=i; //sum=sum+i
            gap*=i;
       }
       System.out.println("최종합계(sum)="+sum);//15
       System.out.println("최종곱(gap)="+gap);//120
	}
}










