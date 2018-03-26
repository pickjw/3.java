package j1206;

public class Op5Cast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("자동형변환");
      //byte s=12; 00001100
      short s=12; //2진수->00000000  00001100
      int n=s;//int n=12  00000000 00000000  00000000  00001100
      System.out.println("n=>"+n+",s=>"+s);
      //2.서로 연산을 할때 형이 변환이 된다.=>적은 데이터자료형->큰데이터형변환
      char c='A';//65
      System.out.println("c=>"+c);
      int n2=c+1;//char(2byte)+int(4byte)=>int(65)+int(1)=int
      System.out.println("n2="+n2);
      //(자료형)변수=>큰데이터->작은테이터형으로 변환될때
      System.out.println("강제형변환");
      System.out.println("(char)n2="+(char)n2);//66->char로 변환출력->B
      int su=(int)3.5;
      System.out.println("su=>"+su);//강제형변환->데이터의 일부손실이 있다.
      int x=123;
      //double y=x+12.3; int+double->double+double=>double
      float y=x+12.3f;//123(int)+12.3f(float)=123.0f(float)+12.3f(float)
      System.out.println("y=>"+y);
      System.out.println("강제형변환 주의할점");
      byte s2=12;  short s3=45;
      int re=s2+s3;//byte(12)+short(45)=>short+short=short
                               //자바에서 연산의 기본자료형=>int
      short re2=(short)(s2+s3); //int->short로 변환->강제형변환
                       //수식인 값을 형변환시킬때에는 (   )로 묶어줘야 된다.
      System.out.println("re=>"+re);
      System.out.println("re2=>"+re2);
	}

}











