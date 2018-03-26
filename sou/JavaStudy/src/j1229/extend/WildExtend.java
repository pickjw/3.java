package j1229.extend;
/*
 * <? extends T>->상속관계로 이루어진 클래스만 자료형으로 매개변수 전달받음
 *   ->자식클래스는 임의의 자료형만 입력을 받고, 부모클래스는 T만 매개변수로
 *       받는다. 
 */

import java.util.*;

class Person{ //부모클래스 ->T
	String name;
	//Person(){}
}

//Man
class Man extends Person{ //<? extends T>
	//String name;
	Man(String name){
		this.name=name;//m.name="임시";
		//getName();
	}
	//getName()을 만드는 대신에 toString() 자동 호출
	@Override
		public String toString() {
			// TODO Auto-generated method stub
			return name;
		}
}

//Woman
class Woman extends Person{ //<? extends T>
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

public class WildExtend {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Man
		List<Man> list=new ArrayList<Man>();
		//1.Man m=new Man("임시");
		list.add(new Man("임시"));
		list.add(new Man("테스트"));
		printData(list);
		
		//2.Woman
		List<Woman> list2=new ArrayList<Woman>();
		
		list2.add(new Woman("유관순"));
		list2.add(new Woman("신사임당"));
		printData(list2);
		
		//3.Person
		List<Person> list3=new ArrayList<Person>();
		list3.add(new Person());
		printData(list3);
		
		//4.Double=>상속관계와 전혀 관련이 없는 클래스를 적용
		List<Double> list4=new ArrayList();
		list4.add(12.5); list4.add(45.6);
		//printData(list4); 부모클래스 또는 자식클래스가 아니기때문에 적용X
	}

	 //list값을 출력 <?> ->상속뿐만 아니라 상속과 상관없이 모든 자료형을 다 수용
	//<? extends T>->상속관계에 해당하는 클래스만 자료형을 매개변수로 받는경우
	
	//public static void printData(List<?> list) { (1)
	public static void printData(List<? extends Person> list) { //(2)
		for(Object obj:list)
			System.out.println(obj);//obj.toString()
	}

}






