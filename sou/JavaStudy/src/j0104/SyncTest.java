package j0104;

//급여통장(공과금,보험 자동이체)<------ATM(Thread 작동)

class ATM implements Runnable{
	
   //급여계좌 금액
	private long Money=10000;
	
	//실시간으로 공과금,보험료를 자동이체하는 기능
	@Override
	public void run() {//공과금
		//형식)
		// TODO Auto-generated method stub
		//형식)synchronized(공유객체명(계좌)){ 처리해야할 내용;}
		synchronized(this) { //atm(계좌)
			for(int i=0;i<5;i++) {
				try {
					Thread.sleep(1000);//1초
				}catch(Exception e) {}
				if(getMoney()<=0)
					break;//더이상 돈이 없으면 인출X
				withDraw(1000);
			}//for
		}//syn
	}
	
	//돈을 인출시켜주는 메서드->수정목적
	public void withDraw(long howmuch) {
		//if(Money > 0)
		if(getMoney() > 0) {
			Money-=howmuch;//Money=Money-howmuch
			System.out.println(Thread.currentThread().getName()+","+getMoney());
		}else {
			System.out.println("잔액이 부족합니다.");
		}
	}
	
	//잔액을 조회하는 메서드->Getter->매개변수X, 반환값 O
	public long getMoney() {
		return Money;
	}
}

public class SyncTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ATM atm=new ATM();
        Thread t1=new Thread(atm,"보험회사");//계좌
        Thread t2=new Thread(atm,"공과금");
        t1.start(); t2.start();
	}
}






