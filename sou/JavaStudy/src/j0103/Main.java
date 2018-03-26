package j0103;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //외부에서 접근이 불가->객체생성X->생성자 호출X
		//Singleton ob1=new Singleton();
		Singleton ob1=Singleton.getInstance();
		Singleton ob2=Singleton.getInstance();
		Singleton ob3=Singleton.getInstance();
		//객체명은 다르지만 주소값은 하나 ->하나의 객체를 가지고 이름만 변경->대여
		System.out.println("ob1=>"+ob1);
		System.out.println("ob2=>"+ob2);
		System.out.println("ob3=>"+ob3);
		if(ob1==ob2)
			System.out.println("ob1==ob2");
		else
			System.out.println("ob1!=ob2");
	}

}



