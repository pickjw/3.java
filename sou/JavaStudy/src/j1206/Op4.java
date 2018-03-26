package j1206;

public class Op4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("대입,삼항연산자");
       int a=5; int b=7; int x=10,y=-10; //같은 자료형은 ,로 구분해서 작성
       //삼항연산자->변수명=(조건식(변수,관계,논리))?항1(참):항2(거짓)
       //절대값을 구하기 =>10->10, -10=>10
       int absX=(x>=0)?x:-x; //10>=0->10  -10>=0 -(-10)=10
       int absY=(y>=0)?y:-y; //-(-10)=10
       System.out.println("x=10일때 x의 절대값="+absX);
       System.out.println("y=-10일때 y의 절대값="+absY);
       
       //대입
      // a=a+b; a+=b;->실행속도가 빠르다(연산자가 하나)
       a+=b; //a=a+b->a=5+7
       System.out.println("a="+a);//12
       
       a-=b; //a=a-b->a=12-7
       System.out.println("a="+a);//5
       
       a*=b; //a=a*b->a=5*7
       System.out.println("a="+a);//35
       
       a/=b; //a=a/b->a=35/7->소수점이 나오면 5.4->소수점은 버려진다.
                 //기본연산 자료형->int
       System.out.println("a="+a);//5
       
       a%=b; //a=a%b ->a=5%7->나머지->5
       System.out.println("a="+a);
   
	}
}
