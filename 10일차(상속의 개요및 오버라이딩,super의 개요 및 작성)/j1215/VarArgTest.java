package j1215;

//메서드 오버로딩+동적배열+확장 for문->p287

public class VarArgTest {
	
	//형식) 메서드 작성방법과 동일->(자료형 ... 배열명) 
	//가변형의 매개변수는 항상 메서드의 맨 마지막에 위치
	public void print(String a,String ... names) { //구분자,출력할 배열
		//String names[]={"홍길동"}
		//String names[]={"홍길동","이길수"}
		//String names[]={"홍길동","이길수","테스트",,,,,}
		for(int i=0;i<names.length;i++)
			System.out.print(names[i]+a);
		System.out.println();
	}
	/*(1) 메서드 오버로딩할때 매개변수가 각각 다르고 자료형이 같은 경우
	 public void print(String a) {
		System.out.println("a=>"+a);
	}
	
	public void print(String a,String b) {//print(String a, int b)
		System.out.println("a=>"+a+",b=>"+b);
	}
	
	public void print(String a,String b,String c) {
		System.out.println("a=>"+a+",b=>"+b+",c=>"+c);
	}*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         VarArgTest vat=new VarArgTest();
         vat.print(",","홍길동");
         vat.print("-","홍길동","이길수");
         vat.print(",","홍길동","이길수","테스트");
         vat.print(",","홍길동","이길수","테스트","테스트2");
         vat.print(",","홍길동","이길수","테스트","테스트2","테스트3");
         vat.print(",","홍길동","이길수","테스트","테스트2","테스트3","테스트4");
	}
}







