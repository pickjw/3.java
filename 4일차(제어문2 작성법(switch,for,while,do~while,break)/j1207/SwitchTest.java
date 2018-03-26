package j1207;

public class SwitchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int su=24;
		/* (1)
		 if (su%2==0) {//짝수
	    	   System.out.println(su+"은 짝수입니다.");
	       }else {
	    	   System.out.println(su+"은 홀수입니다.");
	       }*/
		switch(su%2) {//변수,수식->case 갯수가 적게 나오게 설정(키포인트)
			case 0:
					System.out.println(su+"은 짝수입니다.");
					break;
			case 1:
					System.out.println(su+"은 홀수입니다.");
					break;
		}//switch
		System.out.println("switch구문 종료");
	}
}







