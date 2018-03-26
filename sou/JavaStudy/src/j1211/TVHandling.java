package j1211;

//추상화->저장대상자(TV)->TV정보
class TV{  //=>새로운 자료형을 만들어내는 것
	//1.멤버변수=>TV(공통)속성
	String name;//모델명
	String color;//색깔
	String maker;//제조사
	int su;//수량
	//상태(움직임)
	boolean power=false;//int power=1;//on  0(off)
	int channel;//default ->초기값을 안주면 0,double->0.0 boolean=false
	
	//기능->TV
	
	//1)전원 on(단순,반복)->매개변수 X , 반환형 X
	void turnOn() { //기본기능->
		//power=true;
		power=!power; //power=!false;
		System.out.println("TV가 turnOn됨!");
	}
	
	//2)전원 off(단순,반복)
	void turnOff() { //기본기능->
		//power=false;
		power=!power;//power=!true
		System.out.println("TV가 turnOff됨!");
	}
	
	//3)채널 증가(수정)->매개변수 O, 반환값 X =>입력->출력,계산,저장(수정)
	void channelUp(int ch) { //메서드호출->매개변수를 반드시 전달
		channel+=ch;//channel=channel+ch->channel=0+7
		System.out.println(channel+"만큼 채널을 증가돼서 이동됨!");
	}
	
	//4)채널 감소(수정)
	void channelDown(int ch) {
		channel-=ch;
		System.out.println(channel+"만큼 채널을 감소시켜서 이동됨!");
	}
	
	//5)채널변경2(음성 인식)=>String전달->tvn(17),ocn(23),,,->수정
	
	void channelSpeak(String str) {
		//str(채널명)->채널명을 비교(equals)->채널번호로 이동=>제어문
		if(str.equals("tvn")) { //만약에 tvn을 전달 받았다면(tvn)비교
			channel=17;
			System.out.println(channel+"로 이동합니다.");
		}else if(str.equals("ocn")) {
			channel=23;
			System.out.println(channel+"로 이동합니다.");
		}
	}
	
	//6)TV에서의 기본적인 TV정보를 출력->단순,반복
	void display() {
		System.out.println("***TV정보 출력****");
		System.out.println("TV이름=>"+name);
		System.out.println("TV 제조사=>"+maker);
		System.out.println("TV색깔=>"+color);
		System.out.println("TV의 현재채널=>"+channel);
	}
}

public class TVHandling {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //1.TV객체를 생성->TV데이터 저장(공간)
		TV t=new TV();//새로운 클래스명 객체명=new 클래스명(); //4byte
		//객체명.멤버변수=저장할값<-->객체명.멤버변수
		t.name="삼성SmartTV";
		t.color="검정색";
		t.su=1;
		t.maker="삼성";
		//테스트->전원스위치 누름=>메서드를 호출
		t.turnOn();
		t.channelUp(7);//7번
		//ocn 23
		t.channelSpeak("ocn");//7->ocn
		System.out.println("저장된 TV이름을 출력=>"+t.name);
		t.display();
	}
}









