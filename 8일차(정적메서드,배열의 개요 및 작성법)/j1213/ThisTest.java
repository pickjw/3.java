package j1213;

//this->멤버변수와 매개변수를 구분할때 사용
public class ThisTest {
	private int a=100;//멤버변수(=인스턴스 변수)
	//public ThisTest(){}
	public void setA(int a) {
		this.a=a;//a=200
	}
	public int getA() { return a;}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ThisTest tt=new ThisTest();
        tt.setA(200);
        System.out.println("tt.getA()=>"+tt.getA());//200
	}
}





