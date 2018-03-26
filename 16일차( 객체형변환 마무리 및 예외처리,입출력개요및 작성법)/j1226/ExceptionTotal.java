package j1226;

//사용자로부터 값을 입력(숫자) 2개 =>문자
public class ExceptionTotal {

	public static void main(String[] args) {// "9"->9,"3"->3
		// TODO Auto-generated method stub
		System.out.println("매개변수 2개입력(동적배열)");
		try {
			int a = Integer.parseInt("9"); // args[0] ->배열첨자 연습할때 코딩!
			int b = Integer.parseInt("3");
			// String s="abc";
			String s = null;
			System.out.println(s.toString());
			System.out.println("a=" + a + ",b=" + b);
			System.out.println("a를 b로 나눈몫=>" + (a / b));
			System.out.println("a를 b로 나눈 나머지=>" + (a % b));
		} catch (ArithmeticException e) { // e 는 에러가 발생된 정보를 담는다.
			System.out.println(e);
			System.out.println("9를 0으로 나눌수가 없습니다.");
		} catch (NumberFormatException e) {

			System.out.println(e);
			System.out.println("문자열 상수만 입력 가능하고, 문자는 입력불가.");
		} catch (IndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("2개를 입력해야 합니다.");
		} catch (Exception e) {// Exception을 상속받은 자식클래스의 모든 객체처리. (Exception은 꼭! 맨마지막에배치)
			System.out.println(e); // 객체의 자동형변환
			System.out.println("위에서 발생한 예외처리외에 다른 예외처리를 처리해줄때 사용.");
		}

	}
}
