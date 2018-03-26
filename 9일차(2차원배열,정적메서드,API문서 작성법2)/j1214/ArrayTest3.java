package j1214;
//1차원 배열 예제
public class ArrayTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int b[]= {56,38,12,36,41,27,26,32,59,16,18,28,21,17};
       //세대수->20대 몇명?(20~29)
       //int count=0;//20대 사람수를 기억,10,30,40,50
       //count1; //10 ,count2;30대 count3;40 ,count4;50
       int cnt[]=new int[5];//각 세대별로 배열에 저장
       
       for(int i=0;i<b.length;i++) {
    	   if (b[i] >=10 && b[i] <=19) cnt[0]++;//10대
    	   if (b[i] >=20 && b[i] <=29) cnt[1]++;//20대
    	   if (b[i] >=30 && b[i] <=39) cnt[2]++;//30대
    	   if (b[i] >=40 && b[i] <=49) cnt[3]++;//40대
    	   if (b[i] >=50 && b[i] <=59) cnt[4]++;//50대
       }//for
       for(int i=0;i<cnt.length;i++)
       System.out.println((i+1)*10+"대 인원의수=>"+cnt[i]+"명");//4
	}//main
}












