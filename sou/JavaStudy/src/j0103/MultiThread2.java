package j0103;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//2.Runnable인터페이스를 상속받아서 작성하는 경우
//주로 Thread클래스를 상속을 받을 수 없는 경우에 사용->Runnable

public class MultiThread2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
       //1.Runnable인터페이스를 상속받은 자식클래스 객체 생성
		/* (1)
		System.out.println("실행시킬 단을 입력?");
		BufferedReader br=new BufferedReader
				                  (new InputStreamReader(System.in));
		int dan=Integer.parseInt(br.readLine());
		GooGoo go=new GooGoo(dan);*/
		GooGoo go=new GooGoo(6);
		//2.Thread객체 생성->생성자에 위의 생성된 자식클래스객체를 매개변수로 전달
		Thread t=new Thread(go);
		//2번째 쓰레드 생성->실행
		PrintThread pt=new PrintThread();
		//3.Thread객체의 start()->내부적으로 run()호출
		//우선순위를 정해주기->setPriority(우선순위 숫자)->10 or Thread.MAX_PRIORITY
		//getPrioity()
		t.setPriority(10);
		//t.setPriority(Thread.MAX_PRIORITY)
		pt.setPriority(Thread.MIN_PRIORITY);//1
		  t.start(); pt.start();
		//t.run(); pt.run();
	}
}

//2.구구단을 출력->Runnable인터페이스를 상속->Thread클래스 상속X

class GooGoo implements Runnable{
	
	private int dan;//단
	
	public GooGoo(int dan) {
		this.dan=dan;//go.dan=7
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=9;i++) {
			try {
				Thread.sleep(500);
				System.out.println(dan+"단:"+dan+"*"+i+"="+(dan*i));
				//System.out.println("i(1)="+i);
			}catch(InterruptedException e) {System.out.println(e);}
		}//for
	}
}

//3.임의의 숫자를 속도조절하면서 출력
class PrintThread extends Thread{
	
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=9;i++) {
			try {
			//난수(임의의 수)발생->0~0.9999999999999999->1X
			//Math.random()*45+1
			long sleeptime=(int)(Math.random()*500+1);
			//System.out.println("sleeptime=>"+sleeptime);
			Thread.sleep(sleeptime);
			//   Thread.sleep(500);
			System.out.println("i(2)="+i);
			}catch(Exception e) {}
		}//for
	}
}






