package j1208;

public class SumBreak2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int sum=0;//합계
        for(int i=1;i<=100;i++) {  //i=1,2,3,,,,100
        	//1.3의배수 또는 5의 배수를 체크->합계
        	if(i%3==0 || i%5==0) {
        	      sum+=i;
        	      System.out.print(i+"\t"); //\t 특수키를 써주면 tab키만큼 이동할
        	}
        	if (sum > 200) break; //for문을 벗어나기위해서 
        }
        System.out.println("최종 sum=>"+sum);
	}
}
