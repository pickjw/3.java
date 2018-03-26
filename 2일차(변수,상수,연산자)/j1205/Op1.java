package j1205;

//산술연산자->단항연산자(증감연산자)
public class Op1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("증감연산자");
       /*
       int a=3,b=4;//계산->int
       int c=a+b;
       System.out.println("c=>"+c);*/
       int a=4;
       int b=a++; //증가연산자->변수의 값을 하나 증가
       /*
        * int b=a; b=4
        * a=a+1; a=5
        */
       System.out.println("중간 a=>"+a+",b=>"+b);
       System.out.println("================");
       int c=++a;
       /*
        * a=a+1; a=5+1->a=6
        * int c=a; ->int c=6
        */
       System.out.println("a=>"+a+",b=>"+b+",c=>"+c);
	}
}





