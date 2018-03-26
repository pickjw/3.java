package j1220;

public class VolTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         TV t=new TV();
         Radio ra=new Radio();
         //객체는 다르지만 메서드는 동일=>다형성의 한예
         t.turnOn(); ra.turnOn();
         
         t.volumeUp(12);
         ra.volumeUp(20);
	}
}
