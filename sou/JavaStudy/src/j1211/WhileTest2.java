package j1211;

public class WhileTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int start=30;//start(시작값)
		int end=100;//end(종료값)
		
		//start <end 비교->참,거짓을 판별
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
		//System.out.println("while종료!");
	}
}





