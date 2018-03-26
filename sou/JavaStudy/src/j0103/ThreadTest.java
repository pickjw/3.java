package j0103;
 //기존에 존재하는 쓰레드 정보=>API(java.lang.Thread)
public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Thread의 이름=>getName(),고유의 id로 구분 =>getId()
		//내부적으로 메인메서드를 실행시켜주는 원동력쓰레드=>메인쓰레드
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getId());
		
		 while(true) { //for(;;){} =>무한루프도 쓰레드의 한종류
            System.out.println("main Thread실행중");
		 }
	}
}
