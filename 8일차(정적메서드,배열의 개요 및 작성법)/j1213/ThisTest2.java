package j1213;

//this->멤버변수와 매개변수를 구분할때 사용
public class ThisTest2 {
	
	public ThisTest2(){
		System.out.println("객체생성(this)=>"+this);//tt를 가리킨다.
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ThisTest2 tt=new ThisTest2();
        System.out.println("객체생성후(tt)=>"+tt);
        System.out.println("=============");//200
        ThisTest2 tt2=new ThisTest2();
        System.out.println("객체생성후(tt2)=>"+tt2);
	}
}





