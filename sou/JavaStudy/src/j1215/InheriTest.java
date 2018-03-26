package j1215;

//import java.lang.Object; 가장 기본이 되는 패키지->자동적으로 컴파일러 추가
//최상위 클래스

//상속의 특징2
class Father extends Object {  //Object(){}
   Father(){
	   super();//부모클래스의 생성자를 호출 (3)
	   System.out.println("난 Father클래스 생성자 호출됨!");//(4)
   }
   @Override
	public String toString() {
		// TODO Auto-generated method stub
		return "중간에 주소를 변경가능연습";
	}
}
//class Child extends Object
class Child extends Father{
	Child(){
		super();//(2)
		System.out.println("난 Child클래스 생성자 호출됨!");//(5)
	}
}
//public class InheriTest extends Object
public class InheriTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Father f=new Father();//1)
        System.out.println("f=>"+f);//4)객체를 출력-=>객체명.toString() 호출
        System.out.println("f.toString()=>"+f.toString());
        Child c=new Child();//1)
        System.out.println("c=>"+c);//6)
        System.out.println("c.toString()=>"+c.toString());
	}
}





