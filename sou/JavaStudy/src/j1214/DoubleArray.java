package j1214;

//2차원배열->3차원배열
public class DoubleArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("2차원배열을 생성 및 가변배열");
        //형식) 배열의 자료형 배열명[][]=new 자료형 [행수][열수];
        //int b[][]=new int[3][3];//b[0][0]=10;b[0][1]=?,,,,,
        //형식2) 배열의 자료형 배열명[][] ={{값1,값2,,,},{값1,값2,,},{}}//행
        //b[0][0]=10,b[0][1]=20,b[0][2]=30,b[1][0]=40,b[1][1]=50~
        int b[][]= {{10,20,30},{40,50},{60,70,80,90}};
         for(int i=0;i<b.length;i++) {//행수
        	 //System.out.println("b["+i+"]="+b[i]);//열이 어디에 저장위치 저장
             for(int j=0;j<b[i].length;j++) { //열
            	System.out.println("b["+i+"]["+j+"]="+b[i][j]);
             }//inner for
         }//outer for
         System.out.println("========================");
         System.out.println("확장 for문(배열의 첨자계산과 상관없이");
         //[][][]->[][]->[]->변수들의 집합
         /*
          * for(2차원배열 자료형[][] 배열명:3차원배열명)//[][][]
          *   for(1차원배열 자료형[] 배열명:2차원배열명)
          *      for(배열의 자료형 출력변수명:1차원배열명)
          *  int b[][]= {{10,20,30},{40,50},{60,70,80,90}};
          */
         for(int tmp[]:b) {//[][]
        	 for(int su:tmp) //10	20		30
        		 System.out.print(su+"\t");//\t 탭키를 누른만큼 거리를 유지하면서
        	 System.out.println();//줄바꿈 
         }//outer for
	}
}





