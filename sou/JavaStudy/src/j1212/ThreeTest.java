package j1212;

//3개의 값을 입력을 받아서 최대값을 구해주는 프로그램?->main()
//getMaxPrint() 작성->부하직원->중복해서 작성->코드

public class ThreeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a=12,b=4,c=19;//c=19 ->결승
      //35,78,90     ,  90,88,23
      ThreeTest tt=new ThreeTest();
      tt.getMaxPrint(a, b, c);//tt.getMaxPrint(12,4,19)
      tt.getMaxPrint(35, 78, 90);
      tt.getMaxPrint(12, 55, 66);
      //int result=tt.getMaxPrint(a, b, c);
      //if문 (a>b) a,b
      /* (1)
      int max;//최대값 저장(계산)
      max=(a>b)?a:b;  //(12 > 4)?12:4->12
      max=(max>c)?max:c;//max=(12>19)?12:19
      System.out.println("최대값(max)=>"+max);*/
	}
	//int getMaxPrint(int a,int b,int c) {
	void getMaxPrint(int a,int b,int c) { //1.매개변수 X  반환값 X
		  int max;//최대값 저장(계산)
	      max=(a>b)?a:b;  //(12 > 4)?12:4->12
	      max=(max>c)?max:c;//max=(12>19)?12:19
	      System.out.println("최대값(max)=>"+max);
	      //return max;
	}
}






