package j1213;

//회원가입->개인정보 저장=>추상화+캡슐화+다형성+this
class Person{
	//1.개인정보
  private String name;//null->값이 저장된 상태X
  private int age;//0
  //private String addr;//주소
   //2.기본 생성자
     Person(){
    	 this("홍길동",23); //(2)다른 생성자를 호출->맨 첫번째라인에 쓸것.
    	 /* 생성자->다른 생성자호출->this(매개변수값,,,)
    	 this.name="홍길동";//p.name="홍길동"
    	 this.age=23;//p.age=23
*/    	 System.out.println("난 Person클래스의 기본생성자입니다.");//4)
         //this("홍길동",23);
     } //객체생성할때 기본생성자가 없으면 만들어서 자동 호출
     
     Person(String name){//이길수
    	 this.name=name;//name="이길수";
    	 this.age=45;
    	 System.out.println("인수 한개(문자열)를 처리해주는 생성자 호출");
     }
     
     Person(int age){//24
    	 this.name="박아무개";
    	 this.age=age;
    	 System.out.println("인수 한개(정수)를 처리해주는 생성자 호출");
     }
     //가장 이상적인것을 선택
     Person(String name,int age){
    	 this.name=name;//p.name="홍길동";
    	 this.age=age;//p.age=23
    	 System.out.println("인수 두개(문자열,정수)를 처리해주는 생성자 호출");//3)
     }
  //---------------------------------------------------------------------------------
  public void setName(String name) {
	  this.name=name;
  }
  public void setAge(int age) {
	  this.age=age;//age=24
  }
  
  public String getName() { return this.name;}
  public int getAge() { return this.age;}
  //정보 출력
  void print() {
	  System.out.println("이름=>"+getName()+",나이=>"+getAge());
  }
}
public class PersonTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//새로운 자료형 객체명=new 생성자명();//객체를 생성->자동->기본생성자호출
        Person p=new Person();//기본생성자 호출 (1)
        //Person p=new Person("홍길동",23);
        //p.setName("홍길동");
        //p.setAge(24);
        p.print();
        //이길수, 나이 35->생성자(이름)
        Person p2=new Person("이길수");//p2객체를 생성->생성자 인수1개문자열
        p2.print();
        //박아무개,나이 56->생성자만 이용->인수2개
        Person p3=new Person("박아무개",56);//p3객체를 생성->생성자 인수2개문자열
        p3.print();
        
	}
}
