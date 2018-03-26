package j1207;

public class SwitchTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("조건식과 case구문에 문자열 사용가능");
		String day="10";//문자열 상수->겉(상수) 내용은 문자열
        switch (day) {//조건식에 문자열이 가능(7.0이후 부터)
		case "10":
				System.out.println("10"); break;
				
		case "20":
			System.out.println("10"); break;	
			
		default:
			System.out.println("기타");
			break;
		}
	}
}
