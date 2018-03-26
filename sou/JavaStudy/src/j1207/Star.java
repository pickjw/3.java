package j1207;

public class Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("별을 출력");
     //변수가 2개(행(i),열(j))
             //1)      2) 10)     9)
      for(int i=1;i<=5;i++) {//행
    	          //3)      4)7)     6)
    	  for(int j=1;j<=5;j++) {
    	      System.out.print("*");//5)    *****
    	  }                                           // *****
    	  System.out.println();//줄바꿈 //8)
      }//outer for
        System.out.println("이중 for문 종료");
	}

}




