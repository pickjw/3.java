package j1207;

//1~10까지의 값을 입력을 받아서 짝수,홀수판별->조건X->default
public class SwitchTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int su=8;
		switch(su) {//변수
			case 2: //범위를 지정 한계=>case 10to20 (X) ->AB+AC+AD=A(B+C+D)
			case 4:	//숫자,문자,문자열 위주로 작성
			case 6:
			case 8:
			case 10:
					System.out.println(su+"은 짝수입니다.");
					break;
					
			case 1:
			case 3:	
			case 5:
			case 7:
			case 9:	
					System.out.println(su+"은 홀수입니다.");
					break;
			default:
				    System.out.println("숫자는 1~10까지만 허용해준다.");
				    break;
		}//switch
		System.out.println("switch구문 종료");
	}
}







