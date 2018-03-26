package j1211;
//저장하고 싶은 대상자(=객체)
public class Car {  //public class 영어단어(명사)

	//1.기본적으로 가지고 있는 특성->8가지 자료형=>멤버변수 선언->초기값
	private String name;//차의이름
	private int output;//배기량->0
	private int year;//년도->0
	private String color;//색깔->null
	//상태
	private int current_speed;//차의 속도계기->0
	private boolean sidong=false;//차의 주차상태
	
	//Setter Method
	public void setName(String n) {//n="소나타"
		name=n;//name="소나타"
	}
	
	public void setOutput(int out) {//o=-1500=>음수X  3000이상 입력X
		if(out<=0 || out >=3000) {
			System.out.println("배기량은 음수이거나 3000cc이상은 입력불가");
			output=1500;//제대로 입력을 못했을 경우에 기본적으로 저장할 값
			return;//탈출문
		}
		 output=out;//output=-1500
	}
	//setYear->y
	public void setYear(int y) {//음수이거나 2017이상을 입력->에러유발
	  if(y<=0 || y>2017) {
		  System.out.println("음수이거나 2017년 이상은 입력불가입니다.!");
	      year=2017;
	  }else {
		 year=y;
	  }
	}
	public void setColor(String c) {//c="blue"
		color=c;
	}
	//current_speed
	public void setCurrent_Speed(int cs) {
		current_speed=cs;
	}
	
	public void setSidong(boolean s) {
		sidong=s;
	}
	
	//Getter Method=>private String name;
	public String getName() { return name;}// return "소나타"
	public int getOutput() {return output;}
	public int getYear() {return year;}
	public String getColor() {return color;}
	public int getCurrent_Speed() { return current_speed;}
	public boolean getSidong() {return sidong;}
	//--------------------------------------------------------------
	//2.공통기능->메서드로 구현->3~4가지 기능
	//비지니스 로직 메서드(=기능에 관련된 메서드)
	
	//1)시동걸기=>단순,반복->매개변수 X 반환형 X =>동사형
	void startEnginee() {  //반환형 메서드명(직원)(){ 메서드의 기능 }
		sidong=true;
		System.out.println("시동이 걸렸습니다.");
	}
	
	//2)차의 속도를 증가?->입력->계산,화면에 출력->매개변수 O 반환형 X
	void speedUp(int speed) { // 매개변수->지역변수(p261)
		// 시동이 걸린상태인지 아닌지를 체크
		if (sidong) {// if (sidong==true) { 변수의 값이 true인 경우 if문 내부에서 생략
						// 이 가능하다.
			// 음수X ,양수 current_speed+speed>=180
			if (speed < 0 || current_speed + speed >= 180) {
				System.out.println("속도는 음수이거나 180km이상은 증가는 불가합니다");
				current_speed = 100;
				return;
			} else {
				current_speed += speed;// current_speed=current_speed+speed
				System.out.println(speed + "km만큼 속도가 증가됨!");
			}
		} else {
			System.out.println("먼저 시동이 걸려야 속도를 증가시킬수가 있습니다.");
			current_speed = 70;
		}
	}
	//3)차의 속도를 감소
	void speedDown(int speed) {
		//speed<0 || current_speed-speed <=0
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








