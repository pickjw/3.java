package j1222;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("객체형변환 연습");
		Shape s = new Shape();
		Point p = new Point();
		Line l = new Line();
		Square sq = new Square();

		// 서로 연관이없는 메소드들을 호출(각자 자신의객체,메소드를 생성하였으므로)=>각자 자기것을 출력함.
		s.shapeDraw();
		p.pointDraw();
		l.lineDraw();
		sq.squareDraw();

		System.out.println("==객체 자동형변환==");
		// 부모클래스 자료형<=자식클래스의 객체
		// 배열 ->같은 자료형만 저장이 되는구조
		Shape sh[] = new Shape[4];// 자식은 부모형으로 다들어가진다.는것을 확인가능함.
		sh[0] = s; // 겉으로는 shape 근데 안에는 다 자식들임.
		sh[1] = p;
		sh[2] = l;
		sh[3] = sq;

		// 추가
		// 부모가 자식으로 형변환하려면?  객체 명시적인 형변환 (자식은 자동형변환이 된다)
		/*Point p2 = (Point) new Shape();  =>에러가뜬다. (부모->자식 형변환불가)*/ 

		for (int i = 0; i < sh.length; i++) {
			sh[i].draw(); // 메서드는 같지만 객체로써 구분이가능.
			whoAreYou(sh[i]);
		} // for
	}

	// 자동형변환이 되려면? "상속관계" 이어야한다.
	static void whoAreYou(Shape sh) {
		// 형식) 객체명 instanceof 클래스명 =>
		// 라면 ? =>true

		// Shape
		if (sh instanceof Shape)
			System.out.println("I am Shape");
		else
			System.out.println("I am not Shape");
		// point
		if (sh instanceof Point)
			System.out.println("I am Point");
		else
			System.out.println("I am not Point");
		// Line
		if (sh instanceof Shape)
			System.out.println("I am Line");
		else
			System.out.println("I am not Line");
		// Square
		if (sh instanceof Shape)
			System.out.println("I am Sqaure");
		else
			System.out.println("I am not Sqaure");
		System.out.println("===============");

	}

}

// Shape ->Point(점)->Line(직선) ->Square(다각형)
// 모든 도형에 공통으로 사용하는 메서드 선언
// 다형성=>메서드 호출=>결과가 다르게 출력.

class Shape {
	void draw() {
		System.out.println("Shape");
	}

	// Shape만 가지고있는 메소드를 상징적으로 표현
	void shapeDraw() {
		System.out.println("Shape");
	}

}

// Point
class Point extends Shape {
	void draw() {// 오버라이딩
		System.out.println("Point");
	}

	void pointDraw() {
		System.out.println("Point");
	}

	class point extends Shape {
	}
}

// Line
class Line extends Point {
	void draw() {// 오버라이딩
		System.out.println("Line");
	}

	void lineDraw() {
		System.out.println("Line");
	}
}

// Square
class Square extends Line {
	void draw() {// 오버라이딩
		System.out.println("Square");
	}

	void squareDraw() {
		System.out.println("Square");
	}
}
