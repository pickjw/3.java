package j0103;
//start()와 run()의 차이점
public class MyThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("is Running!");
			try {
				Thread.sleep(1000);//1초->5000->5초
			}catch(Exception e) {}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MyThread my=new MyThread();
        Thread t=new Thread(my);
        t.start();//->run()
       // t.run();->main Thread를 더이상 작동X==>다른 쓰레드를 실행
        System.out.println("MainThread Terminated!");
        System.out.println("MainThread Terminated2");
	}
}







