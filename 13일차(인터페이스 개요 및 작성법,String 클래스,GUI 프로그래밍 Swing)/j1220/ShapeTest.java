package j1220;

//정적메서드 또는 정적멤버변수 불러오기
import static java.lang.Math.PI;

import java.util.Scanner;

//원의 면적
public class ShapeTest extends Shape implements Drawable{

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
        Scanner sc=new Scanner(System.in);
        System.out.println("원의 반지름을 입력?");
        int r=sc.nextInt();
        ShapeTest st=new ShapeTest();
        st.res=st.area(r);
        st.printArea();
	}
}





