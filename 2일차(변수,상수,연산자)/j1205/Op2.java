package j1205;
//증감연산자를 정리
public class Op2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a=5,b=6;
       int c,d;//선언만
       c=a++*4;
       /*
        * c=a*4; c=5*4=20
        * a=a+1;->a=5+1=6
        */
       d=++b*5;
       /*
        * b=b+1;=>b=6+1->b=7
        * d=b*5;=>d=7*5->d=35
        */
       System.out.println("a="+a+",b="+b);//6,7
       System.out.println("c="+c+",d="+d);//20,35
       byte b1=5;   short s=-4; //선언만 하고 있는 변수(대기상태 표시)
       int i=9; long l=2;
       //산술연산자 중에서 단항연산자를 의미(양수,음수)
       System.out.println("b1="+(+b1)); //+5 양수
       System.out.println("-s="+(-s));//부호가 겹치는 경우->명확하게 구분 (  )음수
       System.out.println("++i="+(++i));//10
       /*
        * i=i+1-->i=9+1->i=10
        * System.out.println(i);//i=10
        */
       System.out.println("i--="+(i--));
       /*
        *System.out.println(i) //10
        *i=i-1 -->i=10-1=9
        */
       System.out.println("i="+i);//9
       System.out.println("++l="+(++l));//3
       /*
        *l=l+1-->l=2+1->l=3
        * System.out.println(l); 
        */
       System.out.println("l--="+(l--));//3
       /*
        * System.out.println(l); //3
        * l=l-1-->l=3-1=2
        */
       System.out.println("l="+l);//2
	}
}




