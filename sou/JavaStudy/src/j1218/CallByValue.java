package j1218;

//caller method--->work method
//매개변수를 전달(기본자료형(8가지)->전달->call by Value(값에 의한 전달방법)
//원본의 값(x=5)------->복사(x)--->전달(x=10)
public class CallByValue {
	//int r=-1,g=-1,b=-1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //r(0~255),g(0~255),b(0~255)=>0,0,0~255,255,255->16만 color
		int r=-1,g=-1,b=-1;
		System.out.println("before:red="+r+",green="+g+",blue->"+b);
		//change_color호출
		change_color(r,g,b);
		System.out.println("after:red="+r+",green="+g+",blue->"+b);
	}
	
	//색깔을 변경시켜주는 메서드(수정 목적)
	static void change_color(int r,int g,int b) { //-1,-1,-1
		r+=10;//r=r+10; //9
		g+=50;//g=g+50;//49
		b+=100;//b=b+100;//99
		System.out.println("메서드 내부의 r="+r+",g="+g+",b="+b);
	}
	
}








