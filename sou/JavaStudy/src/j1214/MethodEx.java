package j1214;

import java.util.Scanner;

//국,영,수을 입력->총점->평균->등급(=학점)->출력,성적처리 프로그램 작성

public class MethodEx {
     //int kor,eng,math;  멤버변수가 없으면 매개변수를 전달받아서 처리
	 //double tot;            멤버변수가 있으면 매개변수를 전달X
	
	//1.총점=>계산목적->매개변수 O ,반환값 O
	static int calcSum(int kor,int eng,int math) {
		int t=kor+eng+math;
		return t;// return (kor+eng+math)
	}
	
	//2.평균->총점/과목수->정해져 있는 경우(국,영,수)->메서드 오버로딩
	static double calcAve(int tot) {
		return (double)(tot/3);
	}
	//3.평균2->총점/과목수->정해져 있지 않은 경우(국,영,수,사회과학,물리,생물,,,)
	double calcAve(int tot,int su) {
		return (double)(tot/su);
	}
	
	//4.등급(=학점)=>평균값가지고 등급
	char calcGrade(double a) {
		if (a<=100 && a>=90) return 'A';
		else if(a<90 && a>=80) return 'B';
		else if(a<80 && a>=70) return 'C';
		else if(a<70 && a>=60) return 'D';
		else return 'F';
	}
	
	//5.출력용->총점,평균,등급->출력(단순,반복) 매개변수O ,반환값 X
	public void display(int sum,double ave,char grade) {
		System.out.println("합계(sum)=>"+sum);
		System.out.println("평균(ave)=>"+ave);
		System.out.println("등급(grade)=>"+grade);
	}
	
	//자바프로그램이 실행=>메모리에 올려지는 메서드
	public  static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int kor; int eng; int math;
        
        System.out.println("국어점수를 입력하세요?");
        kor=sc.nextInt();
        
        System.out.println("영어점수를 입력하세요?");
        eng=sc.nextInt();
        
        System.out.println("수학점수를 입력하세요?");
        math=sc.nextInt();
        //1.총점
        MethodEx me=new MethodEx();
        //변수=객체명.메서드명(~);
        int tot=MethodEx.calcSum(kor, eng, math);
        //2.평균
        double ave=MethodEx.calcAve(tot);
        //3.등급
        char grade=me.calcGrade(ave);
        //4.display
        me.display(tot, ave, grade);
        
	}
}










