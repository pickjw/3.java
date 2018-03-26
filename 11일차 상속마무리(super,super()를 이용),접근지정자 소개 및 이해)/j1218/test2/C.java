package j1218.test2;

import j1218.test.A;// 어디에 있는지 알려주기위해서 import

//public class C {
public class C extends A {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("======default 권한=====");
		   //A a=new A();//default권한은 상속과 상관없이 외부패키지에 있기에
		  //                        접근이 불가
		   C a=new C();
	       // a.j=300;
	       // a.print2();
	        //protected->다른 패키지에 있어도 자식객체로 접근이 가능하다.
	        System.out.println("======protected 권한=====");
	        a.k=400;
	        a.print3();
	        //추가
	        System.out.println("======public 권한=====");
	        a.m=500;
	        a.print4();
	}
}





