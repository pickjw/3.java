package j1219;

//재귀메서드 호출시 주의할사항
public class RecuError {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           showHi(3);
	}
	//반복할 횟수 만큼->자기 자신의 메서드를 호출=> 특정문자열을 출력
	//반복할 횟수가 1->이 메서드를 탈출할 수 있도록 코딩
	public static void showHi(int cnt) {
		 System.out.println("HI~");
		 showHi(cnt--);  //감소연산자를 잘못 사용
		 if(cnt==1)
			 return;//탈출문
	}
}


