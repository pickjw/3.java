package j1218;

class Person{
	String name;
	int age=20;
	
	void print() {
		System.out.println("Person의 메서드호출=>"+name);
	}
}
//Man
class Man extends Person{
	//상속을 받은 멤버변수와 같은 이름의 변수를 자식클래스에 또 선언이 가능
	int age=40;
	/*
	 * String name="상속연습"
	     int age=20;
	     void print() {
		  System.out.println("Person의 메서드호출=>"+name);
	    }
	  오버라이딩(Overriding)=>재정의와 같은 말
	  오버라이딩->전의 부모클래스의 메서드를 호출할 수가 있다.
	                     부모클래스의 오버라이딩 되기전의 메서드를 호출하고 싶다.
	                     super.부모클래스의 메서드명();
	 */  
	void print() {
		System.out.println("자식클래스의 age=>"+this.age);
		System.out.println("부모클래스의 age=>"+super.age);//suepr.부모의 멤버변수
	    super.print();
	}
}
//super의 사용용도
public class SuperTest2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Man m=new Man();
        m.name="상속연습";
        m.print();
	}
}






