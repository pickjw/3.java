package j1219;

class Car{
	 String color;//차색깔
	 String model;//모델
	 String owner;//소유주
	 static int serialNumber;//차의 생산량(차의 모델과 상관없이 합계) 공유
	 
	 public Car(String color,String model,String owner) {
		 this.color=color;  //c1.color="Red","SM5","테스트"
		 this.model=model;
		 this.owner=owner;
		 serialNumber++;
	 }
	 { //생성자 오버로딩할때 공통으로 사용되는 구문이 필요하면 설정
		//객체생성할때 마다 호출
		 System.out.println("인스턴스블럭 생성자의 공통적인 부분을 기술");
	 }
	/* 
	 public static String getColor() {
		 return color;
	 }*/
	 //차의 생산량을 확인
	 //정적메서드->정적멤버변수 불러올 수 있다. 일반 멤버변수 사용불가(this 사용불가)
	 public static int getNumber() { //클래스명.정적메서드명(~)
		 return serialNumber;             //객체명.정적메서드명(~)
	 }
	 
	  //클래스내부에 초기화 블럭을 작성->static 영역 또는 static 블럭
	 static {
	 System.out.println("제일 먼저 main()보다 먼저 실행해야할 구문이 있다면 사용");
	 System.out.println("DB접속이 가능하도록 환경설정을 하고자할때");
	 System.out.println("1.static 멤버변수 2.main()호출,다른 정적메서드,클래스로드");
	 }
	  
}

public class CarFactory {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Car c1=new Car("Red","SM5","테스트");
         Car c2=new Car("Blue","Sonata","임시");
         Car c3=new Car("Blue","Matiz","임시2");
         
         System.out.println("지금까지의 차생산량은?"+c1.getNumber());
         System.out.println("지금까지의 차생산량은?"+c2.serialNumber);
         //객체명.정적 멤버변수(공유)  클래스명.정적 멤버변수(공유)
         System.out.println("지금까지의 차생산량은?"+Car.serialNumber);
	}
}






