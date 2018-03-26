package j1220;
//p390=>표준화(전체 프로그램의 뼈대(=명세서))를 작성

//음악 프로그램 전체에서 사용되는 모든 공통적인 기능을 가진 메서드를 선언
public interface Volume {
    
	//1.볼륨을 올리기->수정목적
	public void volumeUp(int level);
	//2.볼륨을 내리기->수정
	public void volumeDown(int level);
	//3,4->turnOn,turnOff
}
