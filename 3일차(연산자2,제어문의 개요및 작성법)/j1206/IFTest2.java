package j1206;
//중첩 if문

public class IFTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int su=123;
		//1~100까지의 값을 입력?
	  if(su>=1   &&  su<=100) {
		 if (su%2==0) {//짝수
	    	   System.out.println(su+"은 짝수입니다.");
	       }else {
	    	   System.out.println(su+"은 홀수입니다.");
	       }
	  }else {
		  System.out.println("su값은 1~100까지의 값만 입력이 가능합니다.");
	  }//else
	}
}
