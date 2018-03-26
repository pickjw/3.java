package j1215;
//회사->신입사원->정보
public class Employee {

	String name;//사원명
	int age;//나이
	String sung;//성별
	String addr;//주소
	long salary;//급여->보너스(공기업)->직원(150%),팀장(300%) 반영
	
	//상속X->생성자 호출 매카니즘
	public Employee() {}
	public Employee(String name, int age, String sung, String addr, long salary) {
		this.name = name;
		this.age = age;
		this.sung = sung;
		this.addr = addr;
		this.salary = salary;
	}
	//보너스를 구해주는 메서드->급여*1.5
	double bonus() {
		return salary*1.5;   //팀장->return salary*3.0
	}
	
	//직원의 정보를 출력
	public void display() {
		System.out.println("==직원의 정보 출력==");
		System.out.println("이름="+name);
		System.out.println("나이="+age);
		System.out.println("성별="+sung);
		System.out.println("주소="+addr);
		System.out.println("급여="+salary);
		System.out.println("보너스="+this.bonus());
	}
}






