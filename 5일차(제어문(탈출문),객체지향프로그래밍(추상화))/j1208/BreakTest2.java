package j1208;

public class BreakTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("레이블이 있는 break문");
      A:for(int a=0;a<5;a++) {
    	   for(int b=0;b<5;b++) {  
    		  //추가
    		  if(b==2) break A; //조건식 break 레이블명
    		  //
    		  System.out.println("a="+a+",b="+b);//5)
    	  }
    	  System.out.println();//줄바꿈 //8)
      }//outer for
      //A:
      System.out.println("이중 for문 종료");
	}
}




