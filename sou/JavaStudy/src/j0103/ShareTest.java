package j0103;

//입출력+쓰레드
import java.io.*;

public class ShareTest implements Runnable { //extends Thread

	RandomAccessFile raf=null;//현재폴더를 기준->임의의 파일 생성
	
	//초기화 작업->생성자->Thread객체를 생성->한개의 파일에 글자를 쓰도록처리
	public ShareTest() { //파일을 생성->rw
		//1.경로포함해서 생성할파일명,2.모드(r,rw)->파일이 없다->생성
		//                                                                파일이 이미 존재->내용 덮어쓰기
		try {
			raf=new RandomAccessFile("c:/webtest/3.java/result.txt","rw");
			//Thread객체 생성
			Thread t1=new Thread(this,"lys");//내 쓰레드
			Thread t2=new Thread(this,"test");//상대방 쓰레드
			//Thread객체 생성->start()
			t1.start(); t2.start();//->run()
		}catch(IOException e) {
			System.out.println("파일생성에 오류가 발생=>"+e);
		}
	}
	
	@Override
		public synchronized void run() {//생성된 파일에 내용을 출력시켜주는 기능
			// TODO Auto-generated method stub
			//raf의 writeBytes()을 이용->FilePointer의 위치를 이용->글자갯수를 예측
		    try {
		    	for(int i=0;i<1000;i++) {
		    		raf.writeBytes
		    		(Thread.currentThread().getName()+"["+i+"]"+raf.getFilePointer()+"\n");
		    	}
		    }catch(Exception e) {
		    	System.out.println("파일에 출력오류=>"+e);
		    }
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           new ShareTest();//ShareTest st=new ShareTest();
	}

}




