package j1221;

//정적메서드 또는 정적멤버변수 불러오기
import static java.lang.Math.PI;

import java.util.Scanner;
//외부 패키지의 클래스 불러오기
import j1220.Drawable;
import j1220.Shape;

//원의 면적
public class ShapeTest2 extends Shape implements Drawable{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("원,직사각형을 그리는 프로그램 작성");
	}
	@Override
	public double area(int r) {
		// TODO Auto-generated method stub
		return (r*r*PI);
	}
	
	@Override
	public double area(int w, int h) {
		// TODO Auto-generated method stub
		return (w*h);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
        Scanner sc=new Scanner(System.in);
        System.out.println("원하는 도형선택? 1.원 2.직사각형 3.종료");
        int choice=sc.nextInt();
        switch (choice) {
		case 1:
			System.out.println("1.원의 반지름을 입력?");
	        int r=sc.nextInt();
	        ShapeTest2 st=new ShapeTest2();
	        st.res=st.area(r);
	        st.printArea();
			break;
			
        //직사각형
		case 2:
			System.out.println("1.사각형의 넓이(가로) 입력?");
	        int w=sc.nextInt();
	        System.out.println("2.사각형의 높이(세로) 입력?");
	        int h=sc.nextInt();
	        
	        ShapeTest2 st2=new ShapeTest2();
	        st2.res=st2.area(w,h);
	        st2.printArea();
			break;	
			
		case 3://종료
			System.out.println("프로그램이 정상종료됩니다.!!!");
			System.exit(0);  //System.exit(-1);//비정상 종료
			break;
		  }//switch
		}//while
	}
}





