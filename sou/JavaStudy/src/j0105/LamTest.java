package j0105;

interface Xyz{ //공통으로 사용하고자하는 추상메서드,상수선언시
	int x=8; //public static final int x=8;
	public void a();
}

public class LamTest implements Xyz{

	public void a() {
		System.out.println("일반적인 방법인 경우");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.방법
		//Xyz  lt=new LamTest();
         LamTest lt=new LamTest();
         lt.a();
         //2.방법->익명클래스로 작성->추상메서드를 오버라이딩해서 호출
         //형식) 인터페이스형 객체명=new 인터페이스형(){메서드선언 및 내용}
         Xyz abc=new Xyz() {
        	 public void a() {
        		 System.out.println("익명클래스를 이용한 메서드 호출방법");
        	 }
         };
         abc.a();
	}

}







