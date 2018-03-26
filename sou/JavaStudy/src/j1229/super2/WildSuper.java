package j1229.super2;
/*
 * <? super T> =>T(자식클래스)를 고정으로 지정해주고 자식클래스와 연관이 있는
 *                         부모클래스는 다 적용이 되게 설정하는 제너릭표시
 *                         ?(부모클래스)  T(자식클래스)
 */

import java.util.*;

class Person{ //부모클래스
	String name;
	Person(){}
	//부모클래스에 소스코드를 추가(생성자 오버로딩)
	Person(String name){
		this.name=name;
	}
	@Override
		public String toString() {
			// TODO Auto-generated method stub
			return name;
		}
}

//Man
class Man extends Person{ // T(Man)->자식클래스
	//String name;
	Man(String name){
		this.name=name;//m.name="임시";
	}
	@Override
		public String toString() {
			// TODO Auto-generated method stub
			return name;
		}
}

//Woman
class Woman extends Person{ // T(자식클래스)
	//String name;
	Woman(String name){
		this.name=name;
	}
	@Override
		public String toString() {
			// TODO Auto-generated method stub
			return name;
		}
}

public class WildSuper {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Man
		List<Man> list=new ArrayList<Man>();
		//1.Man m=new Man("임시");
		list.add(new Man("임시"));
		list.add(new Man("테스트"));
		//printData(list);
		
		//2.Woman
		List<Woman> list2=new ArrayList<Woman>();
		list2.add(new Woman("유관순"));
		list2.add(new Woman("신사임당"));
		printData(list2);
		
		//3.Person
		List<Person> list3=new ArrayList<Person>();
		list3.add(new Person("사장님"));
		list3.add(new Person("이사님"));
		printData(list3);
		
		//4.Double=>상속관계와 전혀 관련이 없는 클래스를 적용
		List<Double> list4=new ArrayList();
		list4.add(12.5); list4.add(45.6);
		//printData(list4); 부모클래스 또는 자식클래스가 아니기때문에 적용X
	}

	 //list값을 출력 <?> ->상속뿐만 아니라 상속과 상관없이 모든 자료형을 다 수용
	//<? extends T>->상속관계에 해당하는 클래스만 자료형을 매개변수로 받는경우
	
	//public static void printData(List<?> list) { (1)
	//public static void printData(List<? extends Person> list) { //(2)
	// public static void printData(List<? super Man>list) { //Man,Person허용 (3)
	   public static void printData(List<? super Woman>list) { //Woman,Person허용
		for(Object obj:list)
			System.out.println(obj);//obj.toString()
	}

}






