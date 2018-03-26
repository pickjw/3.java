package j1229;

import static java.lang.System.out; //정적메서드,정적멤버변수->클래스생략
//추상화에 제너릭을 적용시킨 클래스를 작성
//배열의 값을 출력
public class GenericEx<T> {  //클래스명<T>==>제너릭클래스
  
	T [] v;//String [] v;//배열을 선언
	//Integer [] v2;
	//Double [] v3;
	
	//1.v배열에 값을 저장시켜주는 메서드(Setter)
	public void set(T [] n) { //set(String|Integer|Double [] n)
		v=n; //this.v=v;
	}
	
	//2.v배열의 값을 꺼내서 화면에 출력(단순,반복)
	public void print() {
		for(T s:v)//for(String s:v)
			 out.println(s);
	}
}




