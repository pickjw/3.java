package j1205;
//2장 변수(Variable)와 상수(Constant),자료형

public class VarTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("변수개념과 사용법");//ctrl+s(저장)->컴파일
		//컴퓨터에 저장시킨값도 출력->자료형 변수이름(명사)=값
		int age;//변수선언->메모리상에 공간이 만들어진 상태
		//변수를 선언->반드시 값을 저장시켜야 된다.
		age=23;//초기화
		age=24;//변수는 맨 마지막 값만 기억을 한다.
		System.out.println("저장된 나이는 "+age+"살입니다.");//출력문장과 변수출력=>+
	    byte b=23;//변수를 선언하면서 값을 같이 부여하는 경우
	    short c=12;
	    //변수들에 저장된 값도 계산->출력
	    int sum=b+c;//35=>형변환
	    double gap=3*4*3.141592;//소수점->double
	    //주민등록번호를 저장(6-7)
	    long no=1234567890909L; 
	    //long형으로 값을 저장시에는 뒤의 숫자L or 숫자l ->무조건 int로 저장하기때문
	    System.out.println("합계(sum)=>"+sum);
	    System.out.println("no=>"+no);
	    
	}
}






