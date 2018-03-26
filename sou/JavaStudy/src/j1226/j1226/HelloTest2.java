package j1226; //예외의 종류를 확인하는 예제.

//예외처리 --->caller ---> worker()호출.
public class HelloTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			HelloTest2 ht = new HelloTest2();
			ht.go();
		} catch (ArrayIndexOutOfBoundsException e) { // 에러메세지 출력하기.
			System.out.println("배열의 첨자가 잘못 계산되었습니다. 확인요망");
			System.out.println(e.getMessage()); // 3
			System.out.println(e.toString());// System.out.println(e); =>toString생략가능.
			e.printStackTrace();
			// ▽에러뜸/ e.printStackTrace();는 단독으로쓸수밖에없다.
			/* System.out.println(e.printStackTrace()); */
		} finally {// 메모리에 해제
			System.out.println("예외발생 유무 상관없이 무조건 수행할 문장을 여기에..");
		}
		System.out.println("예외처리 끝!");
		/*
		 * 사장님이 했던일(->부하직원한테 넘기기) int i = 0; // 첨자 저장. String greetings[] = { "객체형변환",
		 * "예외처리개념", "예외처리작성법" }; while (i <3) { // [0] , [1] , [2]
		 * System.out.println(greetings[i]); i++; }
		 */
		// while
	}

	// 단순히 배열의 값만 출력하는 메서드->(매개변수x,반환값x)
	// 형식) ~메서드명(~) throws 예외가 발생한 예외처리class명 (427p)
	public void go() throws ArrayIndexOutOfBoundsException { // 예외처리를 메인메서드로넘김.
		int i = 0; // 첨자 저장.
		String greetings[] = { "객체형변환", "예외처리개념", "예외처리작성법" };
		while (i < 3) { // [0] , [1] , [2]
			System.out.println(greetings[i]);
			i++;
		}
	}
}
