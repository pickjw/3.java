package j1215;

import java.util.Arrays;

public class ArrayTest6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int n=(int)(Math.random()*45)+1; //절대로 1이 안나온관계로
      System.out.println("n=>"+n);
      System.out.println("배열의 정렬");
      //String str[] = new String[3];
      String str[]= {"Banana","Orange","Apple"}; //c=c+1, c++
      System.out.println("배열의 정렬전 출력");
      
      /* for(String su:str)
	  System.out.print("su=>"+su+"\t");*/
      arrayPrint(str);//내부 클래스끼리의 정적메서드에서의 경우
                            //외부의 다른 패키지의 클래스의 정적메서드->클래스명.정적메서드
      System.out.println();//줄바꿈
      System.out.println("배열의 정렬후 출력");
      //정적메서드
      Arrays.sort(str);
     /* for(String su:str)
    	  System.out.print("su=>"+su+"\t");*/
      ArrayTest6.arrayPrint(str);
	}

	//메서드의 자주 사용->객체를 생성->호출X->정적 메서드
	static void arrayPrint(String str[]) { //(String ... str)
		for(String su:str)
	    	  System.out.print("su=>"+su+"\t");
	}
	
	
	
}




