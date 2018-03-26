package j1218;

public class SuperTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        C  c=new C("홍길동");//(1)
	}
}

class A extends Object{ //Object(){}//5)
	public A() {
		super();//4)
		System.out.println("난 A의 생성자 호출됨!");//6)
	}
}
//class B{
class B extends A {
	public B() {
	 super();
	System.out.println("난 B의 생성자 호출됨!");
   }
   //반드시 부모클래스에서 호출하는 매개변수에 해당하는 생성자가 존재O
	public B(String s) {
		super();//(3)
		System.out.println(s);//7)홍길동
	}
}
//class C
class C extends B {
	public C() {
	System.out.println("난 C의 생성자 호출됨!");
   }
	public C(String s) {
		super(s);//생략 가능->기능은 그대로 작동  (2)
		System.out.println(s);//8)홍길동
	 }
}










