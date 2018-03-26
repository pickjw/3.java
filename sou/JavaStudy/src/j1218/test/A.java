package j1218.test;

public class A {
//class A {
	
	private int i=10;//멤버변수앞에 private 
    int j;//default 접근지정자를 부여->
    protected int k; //protected로 선언
    //추가
    public int m;
	
	private void print() { //외부에서 절대로 호출이 안된다.
		System.out.println("private i=>"+i);
	}
	
	 void print2() { //자기패키지내부,자기클래스에서 접근가능
		System.out.println(" j(default)=>"+j);
	}
	 //추가
	 protected void print3() { 
			System.out.println(" protected k=>"+k);
	 }
	 //추가2
	 public void print4() { 
			System.out.println(" public m=>"+m);
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        A  a=new A();
        a.i=20;//객체명.멤버변수=값
        a.print();
        System.out.println("======default 권한=====");
        a.j=200;
        a.print2();
        System.out.println("======protected 권한=====");
        a.k=300;
        a.print3();
        //추가
        System.out.println("======public 권한=====");
        a.m=400;
        a.print4();
	}
}





