package j1213;
//1차원 배열 예제
public class ArrayTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int b[]= {56,38,12,36,41,27,26,32,59,16,18,28,21,17};
       //세대수->20대 몇명?(20~29)
       int count=0;//20대 사람수를 기억
       for(int i=0;i<b.length;i++) {
    	   if(b[i] >=20 && b[i] <=29) {
    		    count++;
    	        System.out.println("b["+i+"]="+b[i]);
    	   }
       }//for
       System.out.println("20대 인원의수(count)=>"+count);//4
	}//main
}




