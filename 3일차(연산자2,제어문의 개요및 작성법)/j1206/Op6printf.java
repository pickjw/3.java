package j1206;

public class Op6printf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //printf("출력양식",출력할값(대상자))->출력할값을 특정 출력양식에 맞춰서 출력
	  //ex) %d->정수값(decimal), %c->문자(char),%s->문자열(String),%f(소수점)
		int num1=20,num2=30;
		System.out.println("첫번째숫자="+num1+",두번째숫자="+num2);
		//printformat(출력양식)
		System.out.printf("첫번째숫자=%d,두번째숫자=%d",num1,num2);
		System.out.println();//줄바꿈
		//printf메서드의 활용
		char ch='A';//65저장 ->char(0~65535)(양수)->int(4byte)(음,양수)
		//문자 A의 유니코드값은 65이다.
		System.out.println("문자"+ch+"의 유니코드값은"+(int)ch+"이다.");
		//printf->줄바꿈->특수기호를 사용->\n(다음줄로 이동)
		System.out.printf("문자 %c의 유니코드값은 %d\n",ch,(int)ch);
		//총점
		int java=90,jsp=85,oracle=70;
		//합계->변수->1.계산을 할때 2.입출력 프로그램작성
		int sum=java+jsp+oracle;
		//System.out.printf("첫번째숫자=%d,num1);
		//sum=245(sum)입니다.->printf
		System.out.printf("sum=%d 입니다.",sum);
		//평균->총점/과목수
		 int avg=sum/3; //소수점이 있어도 소수점버리고 자동적으로 int계산
		 double avg2=sum/3;//sum/3->처음부터 자동형변환 int(81)->double(81.0)
		 double avg3=(double)sum/3;//->무조건 double으로 계산->소수점계산
		 System.out.println("avg2=>"+avg2);
		 System.out.println("avg3=>"+avg3);
		 //형식) %f->%.소수점자리수f->%.2f->소수점을 출력(자릿수 2째자리 맞게)
		 System.out.printf("평균(avg3):%.2f",avg3);
	}

}




