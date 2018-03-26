package j1220;

//수동으로 작성
//자식클래스명 extends 부모클래스명
//자식인터페이스명 extends 부모인터페이스명
//자식클래스명 implements 부모인터페이스,인터페이스,,,,

public class TV  implements AdvanceVolume {

	
	private int VolLevel;//볼륨의 크기
	private boolean ispower=false;
	
	@Override //어노테이션->추상메서드가 일반메서드로 재정의 했다는 표시
	public void turnOn() {
		// TODO Auto-generated method stub
		ispower=!ispower;
		System.out.println("TV turn On!!");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		ispower=!ispower;
		System.out.println("TV turn Off!!");
	}
	
	@Override
	public void volumeUp(int level) {
		// TODO Auto-generated method stub
		VolLevel+=level;
		System.out.println("TV의 볼륨을"+level+"만큼 올림!");
	}
	
	@Override
	public void volumeDown(int level) {
		// TODO Auto-generated method stub
		VolLevel-=level;
		if(VolLevel < 0)
			VolLevel=0;
		System.out.println("TV의 볼륨을"+level+"만큼 내림!");
	}
	//나머지 메서드는 개발자에게 일임
}







