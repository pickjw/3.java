package j1205;
//boolean,char,String->p55
public class VarTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("논리적인값,문자,문자열출력");
        byte b;
        b=3;
        int c=23;//변수선언과 동시에 값을 저장
        //p25
        //int 3test; 변수명은 숫자로 시작할 수 가 없다.(패키지 작성할때)
        int _test; //int $test //int #test; 특수기호는 _,$만 가능하다.
        //int true; 변수 선언시 예약어를 사용할 수 가 없다.
        int True;
        //int d; int e; int f;  같은 자료형을 동시에 여러개 선언할때
        int d,e,f; //같은 자료형의 변수는 ,로 구분해서 선언이 가능
        System.out.println("논리적인 값 출력");
        boolean b2=true; //서로 다른 자료형이라도 같은 변수명은 두번 쓸수가 없다.
        boolean b3=2>3;//수식을 통해서 저장가능
        //document.write("b2=>"+b2+",b3=>"+b3);
        System.out.println("b2=>"+b2+",b3=>"+b3);
        System.out.println("===문자형===");
        char c1='A';//2byte (0~65535)
        char c2=65;//아스키코드값
        char c3='\u0041';//16진수형태로 저장(1~9,10(A),11(B),12,13,,,15)
        //'\u0000'~\uFFFF' =>숫자는 뒤에서부터 맞춘고 비어있는 0을 채운다.
        //int c2=65;
        System.out.println("c1=>"+c1+",c2=>"+c2+",c3=>"+c3);
        //문자열->문자+문자,문자열+문자열->문자열
        String s="자바기초(변수,자료형,식별자)";
        String s2="연산자";
        String s3=s+"  "+s2;
        System.out.println("s3=>"+s3);
	}
}





