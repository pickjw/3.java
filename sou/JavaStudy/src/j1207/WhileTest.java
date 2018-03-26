package j1207;

public class WhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//반복문->테이블의 5개=>하나씩 읽어들여서 웹에 출력
       /* (1)
       System.out.println("while반복문 연습1");//1->start
       System.out.println("while반복문 연습2");
       System.out.println("while반복문 연습3");
       System.out.println("while반복문 연습4");
       System.out.println("while반복문 연습5"); end*/
       //종류->반복할 횟수가 필요->변수로 설정
		int i=10;
		do {
			 System.out.println("while반복문 연습"+i);
			   i++;
		}while(i<=5);
		/*while(i<=5) { //1<=5,,,6<=5  while(true) 
		   System.out.println("while반복문 연습"+i);
		   i++;//i=i+1  i+=1
		}//while
*/		System.out.println("while종료!");
	}
}





