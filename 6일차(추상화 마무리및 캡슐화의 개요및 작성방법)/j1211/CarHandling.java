package j1211;

public class CarHandling {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Car sonata; //객체선언->변수는 존재하는데 변수안에 아무것도 저장X
		sonata=new Car();//메모리에  객체의 값이 저장할 공간생성->4byte

		//Car sonata=new Car();
		System.out.println("sonata=>"+sonata);
		//치명적인 오류
		/* (1)
		sonata.name="소나타"; ->직접 멤버변수에 접근 저장
		sonata.output=-1500; //양수만 저장
		sonata.year=2020;
		sonata.color="blue";
		*/
		
		sonata.setName("소나타"); //<-->getName()
		sonata.setOutput(-1500); //양수만 저장
		sonata.setYear(2016);
		sonata.setColor("blue");
		//3.자동차를 운전->메서드를 호출->객체명.메서드명() or 객체명.메서드명(~)
		//caller method(main)==>객체명.speedUp(100)
		
		//sonata.startEnginee();
		//for(int i=1;i<=6;i++)
		    sonata.speedUp(70);//120km
		sonata.speedDown(30);
		//저장된 값 그대로 출력하세요->객체이름.멤버변수를 구분
		System.out.println("차의 이름=>"+sonata.getName());
		System.out.println("차의 배기량=>"+sonata.getOutput());
		System.out.println("===================");
		sonata.carInfoDisplay();
		
	}
}







