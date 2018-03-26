package j1222;
//Outer class는 inner class에 접근->멤버변수,메서드호출
//inner class의 객체를 생성->접근이 가능
public class Outer {

	int a;//0
	public Outer() {
		a=10;
	}
	
	public void aa() {
		System.out.println("aa 호출됨!");
		Inner in=new Inner();//Outer ->Inner접근->반드시 객체를 생성->호출
		in.cc();
	}
	public void bb() {
		System.out.println("bb 호출됨!");
	}
	//----------------------------------
	class Inner{  //안쪽->멤버변수,메서드 접근이 가능
		int ax;
		public Inner() {
			ax=20;
		}
		public void cc() {
			System.out.println("내부 ax="+ax+",외부 a=>"+a);
			bb();
		}
	}
	//------------------------------------------
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //1.Outer클래스의 객체생성
		Outer out=new Outer();
		//2.main()->Inner class에 접근
		//형식) Outer클래스명.Inner클래스명 Inner클래스객체명=
		//         Outer클래스객체명.new Inner클래스명()
		Outer.Inner oi=out.new Inner();
		System.out.println("ax=>"+oi.ax);
		out.aa();//->Inner in=new Inner()->cc()->bb()
	}
}








