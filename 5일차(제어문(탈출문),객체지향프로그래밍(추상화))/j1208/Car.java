package j1208;
//저장하고 싶은 대상자(=객체)
public class Car {  //public class 영어단어(명사)

	//1.기본적으로 가지고 있는 특성->8가지 자료형=>멤버변수 선언->초기값
	String name;//차의이름
	int output;//배기량->0
	int year;//년도->0
	String color;//색깔->null
	//상태
	int current_speed;//차의 속도계기->0
	boolean sidong=false;//차의 주차상태
	
	//2.공통기능->메서드로 구현->3~4가지 기능
	
	//1)시동걸기=>단순,반복->매개변수 X 반환형 X =>동사형
	void startEnginee() {  //반환형 메서드명(직원)(){ 메서드의 기능 }
		sidong=true;
		System.out.println("시동이 걸렸습니다.");
	}
	
	//2)차의 속도를 증가?->입력->계산,화면에 출력->매개변수 O 반환형 X
	void speedUp(int speed) { //매개변수->지역변수(p261)
		current_speed+=speed;//current_speed=current_speed+speed
		System.out.println(speed+"km만큼 속도가 증가됨!");
	}
	//3)차의 속도를 감소
	void speedDown(int speed) {
		current_speed-=speed;//current_speed=current_speed-speed
		System.out.println(speed+"km만큼 속도가 감소됨!");
	}
	//4)차의 정보를 화면출력=>단순,반복
	void carInfoDisplay() {
		System.out.println("==차의 정보===");
		System.out.println("차의이름=>"+name);
		System.out.println("차의 배기량=>"+output);
		System.out.println("차의 년식=>"+year);
		System.out.println("차의 색깔=>"+color);
		System.out.println("차의 속도=>"+current_speed);
		System.out.println("차의 시동유무=>"+sidong);
	}
	//5)차의 주차기능->단순,반복
	void stop() {
		sidong=false; //시동 꺼짐
		current_speed=0;//속도 0
		System.out.println("정상적으로 주차가 완료되었습니다.!");
	}
}








