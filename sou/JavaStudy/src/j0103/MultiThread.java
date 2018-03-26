package j0103;

//main 쓰레드+내가 만든 쓰레드 서로 독립적으로 작동
//1.Thread클래스를 상속받으면 쓰레드기능을 부여=>p728 start() => run()
//2.쓰레드의 관련된 메서드를 상속->run()를 반드시 구현해야한다.(오버라이딩)
//3.쓰레드 객체를 생성->쓰레드객체명.start()-->run()호출

public class MultiThread extends Thread{

	//쓰레드 이름
	public MultiThread(String s) { //setName(부여하고 싶은 쓰레드 이름)
		super(s);//setName(s); <->getName()
	}
	@Override
	public void run() { //기능?->실시간으로 데이터를 출력,저장,계산,,,
		// TODO Auto-generated method stub
		for(char i='a';i<='z';i++) {
			try {
				Thread.sleep(500);//sleep(1000)->1초
			System.out.println(i+" 쓰레드의 이름=>"+this.getName());
			//System.out.println("쓰레드의 이름=>"+this.getName());
			}catch(Exception e) {e.printStackTrace();}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       MultiThread mt=new MultiThread("임시");//mt.setName("임시")(X)
       /*
        * MultiThread mt=new MultiThread();
        * mt.setName("임시")
        */
       mt.start();//내부적으로 run()를 메서드를 호출? 직접적으로 run()를 호출X
	}
}








