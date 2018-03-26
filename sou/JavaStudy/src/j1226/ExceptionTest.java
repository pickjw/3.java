package j1226;
//예외처리를 할때 중요 ->처리해주는지, 안해주는지 어떻게 확인하나요?442p
public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a();
	}

	static void a() {
		try {
			/*String s= null;
			System.out.println("문자열의 길이=>"+s.length());*/
			/*NullPointerException null=new NullPointerException("널포인터에러 연습");
			throw null;*/
			throw new NullPointerException("널포인터에러 연습");
		}catch(NullPointerException e) {
			System.out.println(e.toString());
			System.out.println("메서드를 호출할때 먼저 객체가 생성되었는지 확인요망.");
		}
	}
}
