package j1212;

class Rect{ //직사각형->Triangle
	//1.공통점
	private int x,y;//넓이,높이  //1.멤버변수앞에 private 적용->외부에서 접근불가
	                                          //자기 클래스 내부의 메서드에서는 접근가능
	
	//외부에 x,y에 접근가능->Setter ,Getter Method
	//입력->저장(수정)->매개변수 O ,반환값 X
	public void setX(int w) { //올바른 값만 입력을 받기위해서 작성
		if(w < 0) {
			System.out.println("넓이는 음수를 입력할 수 가 없습니다.");
			x=10;//디폴트값->0 설정이 되기때문에
			return;//탈출문
		}
		x=w;
	}
	//높이
	public void setY(int h) { // 올바른 값만 입력을 받기위해서 작성
		if (h < 0) {
			System.out.println("높이는 음수를 입력할 수 가 없습니다.");
			y = 20;// 디폴트값->0 설정이 되기때문에
		} else {
			y = h;
		}
	}
	//getXXX->값을 가져오기
	public int getX() { return x;}
	public int getY() { return y;}
	
	//2.화면 출력->단순,반복->
	void display() {
		System.out.println("==직사각형의 정보==");
		System.out.println("직사각형의 넓이=>"+x);
		System.out.println("직사각형의 높이=>"+y);
		System.out.println("직사각형의 면적=>"+x*y);
	}
	//두개의 매개변수값을 받아서 계산해주는 메서드 작성
	int areaPrint(int w,int h) {
		/* (1)
		int result=w*h;
		return result;*/
		return (w*h); 
		//리턴값을 전달해주는 유형=>return 변수명; return  수식; return 객체명;
	}
}
public class RectHandling {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //객체생성->데이터 저장공간생성->저장,수정,화면출력->x,y
		Rect r=new Rect();
		System.out.println("메서드 유형 3번째(계산목적)");
		//반환값이 있는 메서드 호출=>반환받는 변수명=객체명.메서드명(~)
		int accept=r.areaPrint(25, 35);
		System.out.println("반환받은값(보고)=>"+accept);
		System.out.println("반환받은값(보고)2=>"+r.areaPrint(25, 35));
		/* (1)
		r.x=0;//객체명.멤버변수=값->쓰레기값(=엉터리값)
		r.y=10;*/
		r.setX(-70);
		r.setY(20);
		r.display();//객체명.메서드명(~)
		
	}
}












