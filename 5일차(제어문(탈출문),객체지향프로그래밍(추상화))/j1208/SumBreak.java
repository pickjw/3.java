package j1208;

public class SumBreak {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int sum=0;//합계
        for(int i=1;i<=100;i+=2) {  //i=1,2,3,,,,100
        	//if(i%2==1)//->홀수의 합(2500) if(i%2==0)짝수의 합
        	   sum+=i;
        }
        System.out.println("최종 sum=>"+sum);
	}
}
