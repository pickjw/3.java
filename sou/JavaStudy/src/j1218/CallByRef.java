package j1218;

//caller method--->work method
//매개변수를 전달(객체(=주소)->전달->call by Reference(주소에 의한 전달방법)
//원본의 값(x=10  d)------->원본전달--->전달(x=10)

class RGBColor{
	int r,g,b;//0=>-1로 변경
	
	RGBColor(int r,int g,int b){
		this.r=r;//color.r=-1
		this.g=g;//color.g=-1;
		this.b=b;//color.b=-1;
	}
}

public class CallByRef {
	//int r=-1,g=-1,b=-1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        RGBColor color=new RGBColor(-1,-1,-1);//color.r=-1;
        System.out.println("color=>"+color);
		System.out.println("before:red="+color.r
				                                  +",green="+color.g+",blue->"+color.b);
		//change_color호출
		change_color(color);
		System.out.println("after:red="+color.r
                                                   +",green="+color.g+",blue->"+color.b);
	}
	
	//색깔을 변경시켜주는 메서드(수정 목적)=>color와 color1은 주소값이 같다.
	static void change_color(RGBColor color1) { //-1,-1,-1
		System.out.println("메서드내부로 전달받은 객체 color1=>"+color1);
		color1.r+=10;//r=r+10; //9
		color1.g+=50;//g=g+50;//49
		color1.b+=100;//b=b+100;//99
		System.out.println("메서드 내부의 r="+color1.r
				                                         +",g="+color1.g+",b="+color1.b);
	}
}








