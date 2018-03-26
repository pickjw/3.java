package Pac2;
class C1 {
	void sound() {
		System.out.println("동물울음");
	}
}

class C2 {
	void grow() {
		System.out.println("쑥쑥~");
	}
}

interface I{
	abstract void grow();
}

class Cow extends C1{
	void sound() {
		System.out.println("음메~~~");
	}	
	void taste() {
		System.out.println("냠냠");
	}
}
abstract class Cat extends C1{
	void sound() {
		System.out.println(" 야옹");
	}
}
public class C0 extends C1 implements I {
	C2 p=new C2();
	
	@Override
	public void grow() {
		// TODO Auto-generated method stub
		p.grow();
	}
	
	public static void main(String[] args) {
	
		C0 z=new C0();
		
		z.sound();
		z.grow();
		
		/*Animal arr[] = new Animal[2];
		arr[0] = new Cow();
		arr[1]= new Cat();
		
		for(int i=0;i<arr.length;i++) {
			arr[i].sound();
		}
		Cow arrc = (Cow) arr[0];
		arrc.taste();
		
		Cow arrd = (Cow)new Animal();
		
		
		Animal any = new Animal();
		Cow cowboy = new Cow();		
		
		any.sound();			//��������
		cowboy.sound();			//����~~
		cowboy.taste();			//�ȳ�
		
		Animal a = cowboy; 		// up-casting  
		a.sound();				//����~~~
		a.sound();
		
		Cow c = (Cow) a;		// down-casting
	//	Cow cd = (Cow) new Animal();
		
	//	cd.taste();
		c.sound();				//����~~~
		c.taste();				//�ȳ�
*/	}

	
}

