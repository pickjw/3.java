package j1220;

//원,직사각형
public abstract class Shape {
   public double res=0;//면적(모든 도형)
   //공통
   //원
   public abstract double area(int r);//r*r*3.1415~
   //직사각형
   abstract public double area(int w,int h);
   
   //일반메서드를 활용
   public void printArea() {
	   System.out.println("도형의 면적은"+res+"입니다.");
   }
}
