package j1208;

public class ConTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("continue문 출력");
       A:for(int a=0;a<5;a++) {
    	   for(int b=0;b<5;b++) {  
    		  //추가
    		  if(b==2) continue A;//continue A: 레이블이 있는 반복문의 증감식이동 
    		  //
    		  System.out.println("a="+a+",b="+b);//5)
    	  }
    	  System.out.println();//줄바꿈 //8)
      }//outer for
      //A:
      System.out.println("이중 for문 종료");
	}
}




