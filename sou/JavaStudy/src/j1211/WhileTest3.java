package j1211;

public class WhileTest3 { //회사

	public static void main(String[] args) { //ceo
		//
		// TODO Auto-generated method stub
		//메서드 내부에 선언된 변수는 ->지역변수
		int start=30;//start(시작값)
		int end=100;//end(종료값)
		//메서드를 호출하는 방법->객체를 생성
		WhileTest3 wt=new WhileTest3();
		wt.printTest(10, 20);//printTest(30,100)
		wt.printTest(30, 90);
		wt.printTest(100, 200);
		//start <end 비교->참,거짓을 판별
		/*if (start < end) {
		//for(int start=10;start<=end;start++)
		//System.out.println("while반복문 연습"+start);
		while(start<=end) { //1<=5,,,6<=5  while(true) 
		   System.out.println("while반복문 연습"+start);
		   start++;//i=i+1  i+=1
		}//while
	  }else { //start > end
		  System.out.println("start값은 end값보다 클 수 가 없다");
	  }*/
		//System.out.println("while종료!");
	}
	
	//부하직원
	void printTest(int start,int end) { //start=10,end=20
		if (start < end) {
			//for(int start=10;start<=end;start++)
			//System.out.println("while반복문 연습"+start);
			while(start<=end) { //1<=5,,,6<=5  while(true) 
			   System.out.println("while반복문 연습"+start);
			   start++;//i=i+1  i+=1
			}//while
		  }else { //start > end
			  System.out.println("start값은 end값보다 클 수 가 없다");
		  }
	}
}





