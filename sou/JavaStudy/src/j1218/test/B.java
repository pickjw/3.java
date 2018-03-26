package j1218.test;//같은 패키지라도 접근이 차단->private

public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    A  a=new A();
	        //a.i=20;//객체명.멤버변수=값->Setter ,Getter이용
	        //a.print();
		    System.out.println("======default 권한=====");
	        a.j=300;
	        a.print2();
	        //추가
	        System.out.println("======protected 권한=====");
	        a.k=400;
	        a.print3();
	        //추가2
	        System.out.println("======public 권한=====");
	        a.m=500;
	        a.print4();
	}
}



