package j1229;

import java.util.*;

//<?> 와일드 카드를 이용한 제너릭 방법->메서드 호출시 매개변수값을 전달
public class WildTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //ArrayList<String>list = new ArrayList<String>();
		//1.문자열을 저장
		List<String> list=new ArrayList();//List<String>list =new List();
		list.add("테스트1"); list.add("테스트2"); list.add("테스트3"); 
		printData(list);
		
		//2.정수형 저장
		List<Integer> list2=new ArrayList();
		//int(100)->Integer(100)->자동 boxing 기능
		list2.add(100); list2.add(200); list2.add(new Integer(300)); 
		printData(list2);
		
		//3.소수점값 저장
		List<Double> list3=new ArrayList();//List<String>list =new List();
		list3.add(12.5); list3.add(45.6); list3.add(78.9); 
		printData(list3);
	}
    //값을 입력->출력
	//제너릭클래스 <T>->Object대용
	//(2) 제너릭 메서드 -><?> ->매개변수의 자료형을 제너릭
	public static void printData(List<?> list) { //(ArrayList<String> list)
		for(Object obj:list)
			System.out.println(obj);//obj.toString()->문자 출력
	}
	/* (1)
	public static void printData(List<String> list) { //(ArrayList<String> list)
		for(String obj:list)
			System.out.println(obj);//obj.toString()->문자 출력
	}
	//Integer
	public static void printData2(List<Integer> list) { //(ArrayList<String> list)
		for(Integer obj:list)
			System.out.println(obj);//obj.toString()->문자 출력
	}
	
	//Double
	public static void printData3(List<Double> list) { 
		for(Double obj:list)
			System.out.println(obj);//obj.toString()->문자 출력
	}*/
}




