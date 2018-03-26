package j1222;

//Outer class는 inner class에 접근 ->멤버변수,메서드 호출
//inner class의 객체를 생성해서 접근이 가능하다.
public class Outer {

	int a;// 0

	public Outer() {// 기본생성자 호출
		a = 10;
	}

	public void aa() {
		System.out.println("aa 호출됨!");
		Inner in = new Inner(); // outer 클래스->Inner 클래스 접근 하려면? "객체를 반드시생성" ->호출"객체명.메서드"
		in.cc();
		// cc(); 바깥의 클래스는 inner의 클래스의 메서드를 호출할수없다.
	}

	public void bb() {
		System.out.println("bb 호출됨!");
	}

	// -----------------------------------------------------
	class Inner {// inner class 객체생성 //outer class의 메소드,멤버변수 를 접근지정자 상관없이 호출가능
		int ax;

		public Inner() {
			ax = 20;
		}

		public void cc() {
			System.out.println("내부 ax=" + ax + ",외부 a=>" + a);
			bb();
		}

	}

	// -------------------------------------------------------
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1.Outer 클래스의 객체생성
		Outer out = new Outer();
		// 2.Main에서 직접 inner클래스에 접근하기위해서?
		// 형식) Outer클래스명.Inner 클래스명 Inner클래스객체명 =
		// Outer클래스객체명.new Inner클래스명()
		Outer.Inner oi = out.new Inner();
		System.out.println("ax=>"+oi.ax); //객체명.메서드명
		
		out.aa();//->Inner in=new Inner()->cc()->bb() 
		//▲하나의메서드를 호출->다른메서드호출->다른메서드호출
		  
		
	}

}
