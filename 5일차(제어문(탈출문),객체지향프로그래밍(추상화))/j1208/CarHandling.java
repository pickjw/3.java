package j1208;

public class CarHandling {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //1.차(객체)를 생성=>데이터를 저장할 공간 생성
		//형식) 새로운 자료형(클래스명) 객체명(저장대상자)=new 클래스명();
		//객체=인스턴스=참조변수=레퍼런스변수=포인트변수(C언어)
		//int a;
		Car sonata,test1; //객체선언->변수는 존재하는데 변수안에 아무것도 저장X
		//int sonata; //4byte공간
		sonata=new Car();//메모리에  객체의 값이 저장할 공간생성->4byte
		test1=new Car();
		//Car sonata=new Car();
		System.out.println("sonata=>"+sonata);
		System.out.println("test1=>"+test1);
		//j1208.Car@70dea4e=>패키지명.클래스명@주소값(16진수)
		//주소값->저장된 위치
		//2.객체명.멤버변수=저장할값;
		//test1.name="벤츠";
		sonata.name="소나타";
		sonata.output=1500;
		sonata.year=2017;
		sonata.color="blue";
		//3.자동차를 운전->메서드를 호출->객체명.메서드명() or 객체명.메서드명(~)
		//caller method(main)==>객체명.speedUp(100)
		sonata.startEnginee();
		for(int i=1;i<=6;i++)
		    sonata.speedUp(20);//120km
		sonata.speedDown(40);
		//저장된 값 그대로 출력하세요->객체이름.멤버변수를 구분
		System.out.println("차의 이름=>"+sonata.name);
		System.out.println("차의 배기량=>"+sonata.output);
		System.out.println("===================");
		sonata.carInfoDisplay();
		
	}
}







