package j1220;


public class Radio  implements AdvanceVolume {

	private int VolLevel;//볼륨의 크기
	private boolean ispower=false;
	
	@Override //어노테이션->추상메서드가 일반메서드로 재정의 했다는 표시
	public void turnOn() {
		// TODO Auto-generated method stub
		ispower=!ispower;
		System.out.println("Radio turn On!!");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		ispower=!ispower;
		System.out.println("Radio turn Off!!");
	}
	
	@Override
	public void volumeUp(int level) {
		// TODO Auto-generated method stub
		VolLevel+=level;
		System.out.println("Radio의 볼륨을"+level+"만큼 올림!");
	}
	
	@Override
	public void volumeDown(int level) {
		// TODO Auto-generated method stub
		VolLevel-=level;
		if(VolLevel < 0)
			VolLevel=0;
		System.out.println("Radio의 볼륨을"+level+"만큼 내림!");
	}
	//나머지 메서드는 개발자에게 일임
}







