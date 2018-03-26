package j1222;

public class ShapeTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("객체형변환 연습");
        Shape s=new Shape();
        Point p=new Point();
        Line l=new Line();
        Square sq=new Square();
        
        s.shapeDraw();
        p.pointDraw();
        l.lineDraw();
        sq.squareDraw();
        
        System.out.println("==객체 자동형변환==");
        //부모클래스 자료형<=자식클래스의 객체
        //배열=>같은 자료형만 저장이 되는 구조
        Shape sh[]=new Shape[4];
        sh[0]=s;
        sh[1]=p;
        sh[2]=l;
        sh[3]=sq;
        //추가
        //Point p2=(Point)new Shape();//객체 명시적인 형변환
       
        for(int i=0;i<sh.length;i++) {
        	sh[i].draw();//메서드는 같지만 객체로써 구분이 가능
        	whoAreYou(sh[i]);
        }//for
	}
	//자동 형변환이 일어나기 위한 전제조건->상속관계가 있어야 된다.
	static void whoAreYou(Shape sh) {
		//형식) 객체명 instanceof 클래스명=>객체가 클래스형을 통해서 만들어진 객체
		//라면 ->true
		//Shape
		if(sh instanceof Shape)
			System.out.println("I am Shape");
		else
			System.out.println("I am not Shape");
		//Point
		if(sh instanceof Point)
			System.out.println("I am Point");
		else
			System.out.println("I am not Point");
		//Line
		if(sh instanceof Line)
			System.out.println("I am Line");
		else
			System.out.println("I am not Line");
		//Square
		if(sh instanceof Square)
			System.out.println("I am Square");
		else
			System.out.println("I am not Square");
		System.out.println("===================");
	}
	
	
}
//Shape->Point(점)->Line(직선)->Square(다각형)
//모든 도형에 공통으로 사용하는 메서드 선언
//다형성=>메서드호출=>결과가 다르게 출력

class Shape{  
	void draw() {
		System.out.println("Shape");
	}
	//Shape만 가지고 있는 메서드
	void shapeDraw() {
		System.out.println("Shape");
	}
}
//Point
class Point extends Shape{
	void draw() {  //오버라이딩
		System.out.println("Point");
	}
	
	void pointDraw() {
		System.out.println("Point");
	}
}

//Line
class Line extends Point{
	void draw() {  //오버라이딩
		System.out.println("Line");
	}
	
	void lineDraw() {
		System.out.println("Line");
	}
}

//Square
class Square extends Line{  //shapeDraw(),pointDraw(),lineDraw(),squareDraw()
	void draw() {  //오버라이딩
		System.out.println("Square");
	}
	
	void squareDraw() {
		System.out.println("Square");
	}
}














