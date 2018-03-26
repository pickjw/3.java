package j1219;

//5!=>5*4*3*2*1->1!->1
public class RecuResult2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           System.out.println("3 factorial=>"+factorial(3));//3*2*1
           System.out.println("12 factorial=>"+factorial(12));
	}
	//자바스크립트->setTimeout(),setInterval
	//팩토리얼 계산
	public static int factorial(int n) { //스택에 저장
		 if(n==1) //1.먼저 빠져나갈 조건을 기술
			 return 1;//탈출문
		 else
		     return n*factorial(n-1);  //2.자신의 메서드를 감소하면서 호출
		               //3*facotrial(2)
	}                             //2*factorial(1)
	                                      //1
}






