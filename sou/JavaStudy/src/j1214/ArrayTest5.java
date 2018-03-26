package j1214;

//사용자로부터 점수를 직접 입력을 받아서 총점,평균?
//콘솔로부터 값을 입력?->java.util.Scanner->숫자,문자열,,
//다른 패키지에 존재하는 클래스의 특정 메서드가 필요
//형식) import 상위패키지명.하위패키지명..불러올클래스명
import java.util.Scanner;//* ->모든 클래스 불러오기
//

public class ArrayTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// API
		Scanner sc = new Scanner(System.in);// 키보드를 통해서 입력받을 객체생성
		int jumsu[] = new int[5];// 점수를 저장 jumsu2,jumsu3,jumsu4,jums5
		int sum = 0;// 합계
		double avg = 0.0;// 평균
		System.out.println("5과목의 점수를 입력하세요?");
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = sc.nextInt();// sc.next(),sc.nextLine()
			sum += jumsu[i]; // sum=sum+jumsu
		}
		//최종 평균,합계
		avg=(double)sum/jumsu.length; //합계/과목수(=배열갯수)
		System.out.println("총합(sum)=>"+sum+",평균->"+avg);
	}
}





