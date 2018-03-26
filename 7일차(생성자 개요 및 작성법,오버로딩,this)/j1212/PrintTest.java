package j1212;
 //메서드 오버로딩
//클래스(설계도)를 ->데이터를 저장(X)->멤버변수가 존재하지 않으면
//멤버변수가 존재->데이터 저장 O
//여기서는 메서드의 기능중심

public class PrintTest { //객체생성->메서드 호출목적
	
	//1.입력(매개변수 O)->출력시켜주는 메서드(반환값 X)
	//(3)메서드를 호출할 목적->각각의 메서드를 호출할 생성자를 만들어보기
	PrintTest(char a){ //부장
	//객체명.메서드명(~)->자기 클래스내부의 다른 메서드를 호출->객체먕 생략가능
		                           //다른 클래스내부의 다른 메서드를 호출->객체명 쓴다.
		print(a);//2)print('v')
		System.out.println("인수 1(char)개짜리 호출해주는 생성자");//4)
	}
	PrintTest(int a){
		print(a);//6)print(2017)
		System.out.println("인수 1(int)개짜리 호출해주는 생성자");//8)
	}
	PrintTest(boolean a){
		print(a);
		System.out.println("인수 1(boolean)개짜리 호출해주는 생성자");
	}
	
	//(2)
	void print(char a) {
		System.out.println("a=>"+a);//3) a=>'v'
	}
	
	void print(int a) {
		System.out.println("a=>"+a);//7) a=2017
	}
	
	void print(boolean a) {
		System.out.println("a=>"+a);
	}
	//(1)
	/*void charPrint(char a) {
		System.out.println("a=>"+a);
	}
	
	void intPrint(int a) {
		System.out.println("a=>"+a);
	}
	
	void booleanPrint(boolean a) {
		System.out.println("a=>"+a);
	}*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /* (1) 
        PrintTest pt=new PrintTest();//기본생성자를 호출
        pt.charPrint('v');
        pt.intPrint(2017);
        pt.booleanPrint(2>3);*/
		//(2)메서드 오버로딩
		/*
		PrintTest pt=new PrintTest();//기본생성자를 호출
        pt.print('v');
        pt.print(2017);
        pt.print(2>3);*/
		
        //(3) 생성자 오버로딩
		PrintTest pt=new PrintTest('v');//1) 문자인수 1개를 처리->생성자 호출
		PrintTest pt2=new PrintTest(2017);//5)
		PrintTest pt3=new PrintTest(2>3);//9)
	}
}







