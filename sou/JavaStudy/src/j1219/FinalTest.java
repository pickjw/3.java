package j1219;

import java.util.Scanner;
//추가
import static java.lang.Math.*;//Math클래스내부의 모든 정적메서드 대상
import static java.lang.System.out;

//import java.util.Scanner;

//final 예약어의 사용용도
//3. final class->상속금지->내용을 변경하면 안되는 메서드가 많다->상속X
 class Parent {//final class Parent {
	//1.final 멤버변수=>상수(변경금지)=>상수화된 멤버변수=>전부 대문자로 기술
	 final int COUNT=1;
	 int su=2;
	
	 //2.final 메서드명->오버라이딩 금지->ex)읽기전용 파일
	final void sub() {
		out.println("재정의 금지 메서드연습!");
	}
	//메서드의 기능과 동떨어지는 내용을 변경하지 못하게 설정=>정적메서드
	//수학적인 계산
	int max(int a,int b) {
		return 1;
	}
	void sub2() {  //읽기,쓰기용 파일
		out.println("재정의 가능");
	}
}

public class FinalTest extends Parent {

	/*void sub() {
		System.out.println("변경가능!");
	}*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Parent p=new Parent();
         //p.COUNT=5;
         out.println("p.count=>"+p.COUNT);
         //java.util.Scanner sc=new java.util.Scanner(System.in);
         Scanner sc=new Scanner(System.in);
         //클래스명.정적메서드명->외부에서 작성한 정적메서드->정적메서드명(~)
         //원의 면적
         double area=5*5*PI;//Math.PI->Math이 생략이 될 수 가 있다.
         out.println("area=>"+area);
	}
}





