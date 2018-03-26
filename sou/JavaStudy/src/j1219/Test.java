package j1219;

//추상메서드,추상클래스 개념
 abstract class Exam{
	public static int sum(int x,int y) { //구현부
		return (x+y);//10+20
	}
	public abstract void draw();
	abstract public void go();
}
//추상클래스를 상속받은 자식클래스->추상클래스에 들어가 있는 추상메서드를
 //반드시 구현(=>오버라이딩(재정의))해야 한다.=>일반메서드로 작성=>내용기술

public class Test extends Exam {
	/*
	 * public static int sum(int x,int y) { //구현부
		return (x+y);//10+20
	   }
	 */
	public  void draw() {}
	public void go() {
		int result=sum(10,20);
		System.out.println("result=>"+result);//30
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Test t=new Test();
         t.go();
         //System.out.println(t.sum(30,40));//70
         System.out.println(sum(30,40));
	}
}



