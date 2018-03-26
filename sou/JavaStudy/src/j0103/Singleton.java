package j0103;

//클래스 내부에서 특정객체를 한개만 생성-->외부에서 빌려준다.(대여)->반납
public class Singleton {

	//1.객체를 생성->한개만 생성(공유할 수 있도록->정적 멤버변수로 선언)
	//형식) private static 클래스명 객체명=null;
	private static Singleton instance=null;
	
	//2.객체를 생성->생성자를 호출->형식) private 생성자(){}
	private Singleton() { //외부에서 이 생성자를 호출X->외부에서 객체생성불가
		System.out.println("인스턴스(=객체)생성");
	}
	
	//3.공유객체를 다른 모든 사람들에게 공유해서 사용->정적메서드로 선언
	//형식) public static 클래스의 자료형 정적메서드명() {return 객체명;}
	
	public static Singleton getInstance() {
		if(instance==null) { //아직 안만들어져 있는 상태
			//만들고자하는 객체를 동기화처리=>synchronized(클래스명.class){}
			synchronized(Singleton.class) {
				if(instance==null) {
					instance=new Singleton();
				}
			}
		}
		return instance;
	}
}



