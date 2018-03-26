package j1208;

public class Alpha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Alpha을 출력");
		//추가
		char mun='A';
	      for(int i=1;i<=5;i++) {
	    	  for(int j=1;j<=i;j++) {
	    	      //System.out.print("A");
	    		  System.out.print(mun);
	    		  mun++;//mun=mun+1
	    	  }                                         
	    	  System.out.println();
	      }//outer for
	        System.out.println("이중 for문 종료");
	}

}
