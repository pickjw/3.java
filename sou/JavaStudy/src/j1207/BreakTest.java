package j1207;

public class BreakTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("이중 for문");
      for(int a=0;a<5;a++) {
    	  for(int b=0;b<5;b++) {  
    		  //추가
    		  if(b==2) break;
    		  //
    		  System.out.println("a="+a+",b="+b);//5)
    	  }
    	  System.out.println();//줄바꿈 //8)
      }//outer for
      System.out.println("이중 for문 종료");
	}
}




