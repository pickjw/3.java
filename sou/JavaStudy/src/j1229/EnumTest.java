package j1229;

//정적상수->static final
public class EnumTest {
	
	//프로그램 전반적으로 자주 사용이 되는 상수값이 필요(월(1~12),요일(0~6),,,)
	//누구나 외부에서 접근이 가능하면서 사용할 수 있도록 공유된 상수화된 변수
	//->열거형(enums)클래스에 추가
	
	public static final int SUN=0;
	public static final int MON=1;
	public static final int TUE=2;
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int su1,su2,su3,su4;
        su1=SUN; //상수화된 변수로 값을 대입
        su2=TUE;
        
        System.out.println("su1=>"+su1+",su2=>"+su2);
        System.out.println("===외부의 enum을 사용하는 경우");
        //1.변수에 값을 대입 or 출력목적
        System.out.println(Day.SUN);//열거형(Day).항목->항목에 해당하는 문자열 출력
        System.out.println(Day.SUN.ordinal());//열거형 항목에 해당되는 내부숫자
        System.out.println(Day.MON.ordinal());
        //2.제어문의 조건식을 체크
        //형식) 열거형 객체명=열거형클래스명.열거형항목 =>열거형 하나만 존재
        //형식2)클래스명.열거형.항목명 =>열거형여러개를 하나의 클래스에 포함
        Day d=Day.SUN;
        su3=Day.MON.ordinal();//1
        
        switch (d) {
        //case 열거형클래스명.항목X
		case SUN:
			            System.out.println("일요일");
			break;

		case MON: System.out.println("월요일");break;
            
		}
	}

}




