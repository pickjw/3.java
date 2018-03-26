package j1207;

public class ForTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("이중 for문");
           //   1)     2) 10)     9)   =>하나 증가(행) 5*5=25반복
      for(int a=0;a<5;a++) {
    	        //3)        4)7)     6)
    	  for(int b=0;b<5;b++) {  //=>열 5
    		  System.out.println("a="+a+",b="+b);//5)
    	  }
    	  System.out.println();//줄바꿈 //8)
      }//outer for
      System.out.println("이중 for문 종료");
	}

}




