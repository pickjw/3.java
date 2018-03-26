package j0105.sub;

//인터페이스에서 추상메서드가 하나만 존재할때 그 추상메서드를 가지고 람다표현식
//을 사용할 수 가 있다.

interface Xyz{ //인터페이스에서 람다식을 사용할때 주의할점->매개변수 있는경우
	int x=8;    
	public void a(int x,int y);
	//public void b();
}

public class LamTest2 implements Xyz{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         //2.방법->익명클래스로 작성->추상메서드를 오버라이딩해서 호출
         //형식) 인터페이스형 객체명=new 인터페이스형(){메서드선언 및 내용}
         Xyz abc=new Xyz() {
        	 public void a(int x,int y) {
        		 System.out.println("익명클래스를 이용한 메서드 호출방법"+(x*y));
        	 }
        	 /*public void b() {
        		 System.out.println("오버라이딩 순서가 중요하지 않는다.");
        	 }*/
         };
         abc.a(6,5);
         //abc.b();
         //방법3->람다표현식을 추가-->반환형 메서드명 부분을 생략
         Xyz abc2=(x,y)->System.out.println("람다를 이용함"+(x*y));
         abc2.a(4, 5);//람다표현식이 적용된 메서드를 호출->메서드명은 사용
	}

}







