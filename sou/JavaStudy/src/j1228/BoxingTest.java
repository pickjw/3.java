package j1228;

public class BoxingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("자동 unboxing");
        //unboxing=>자바의 객체형(Wrapper)=> 기본자료형으로 변환
        //int obj=10;
        Integer obj=new Integer(10);//Double obj=new Double(23.5);
        int sum=obj+20;  //객체(Integer)+int=>int+int=int
        
        System.out.println("sum=>"+sum);
        
        System.out.println("자동 Boxing");
        //boxing=>자바의 기본자료형->자바의 객체형으로 변환
        /*Double d=new Double(123.45);//double d=123.45;
        printDouble(d);*/
        printDouble(new Double(123.45));
        printDouble(143.67);
	}
	
	  static  void printDouble(Double obj2) {//Double obj2=new Double(143.67)
		  System.out.println(obj2.toString());//소수점을 문자로 출력하기위해서 toString()
	  }
}






