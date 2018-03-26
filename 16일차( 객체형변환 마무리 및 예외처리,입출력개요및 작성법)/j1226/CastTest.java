package j1226;

//각 직원별로 -> 세금율을 계산->출력(taxRate())
class Employee {// 직원(추상적) ->범위가 넓다.s

	public void taxRate(Employee e) { //객체 자동형변환
		//내부에서 각각의 객체를 구분하는 코딩 ->객체 명시적인 형변환
		if (e instanceof Manager) {// Manager라면
			Manager m = (Manager) e;
			System.out.println("Manager에 맞는 세금 계산율(.5%적용)");
		} else if (e instanceof Engineer) {
			Engineer en = (Engineer) e;
			System.out.println("Engineer에 맞는 세금 계산율(.7%적용)");
		} else if (e instanceof Employee) { // if(e instanceof Employee) 생략가능.
			System.out.println("Employee에 맞는 세금 계산율(.2%적용)");
		}
	}
	
	/*
	 * 단점1)업무별로 세금율이 다 다르기에, 직원의 수가 많고, 업무가 복잡해진다. 
	 * 단점2)중복된 코딩이 반복적으로 사용될 수 밖에 없다.
	 * =>공식은 동일 상속관계=>가장 최상위 부모클래스형으로 형변환->메서드 내부에 따로 계산.
	 *
	 * public void taxRate(Manager e) {} 
	 * public void taxRate(Engineer e) {}
	 */
}

// 팀장의 역할 + 일반직원으로서의 역할(->Tv,Computer)
class Manager extends Employee {
	// public void taxRate(Manager e){} 원래는 오버라이딩으로 각각 구현해야한다.
}

// 엔지니어로의 역할 + 일반직원으로서의 역할(Audio)
class Engineer extends Employee {
	// public void taxRate(Engineer e){}
}

public class CastTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		Manager man = new Manager();
		Engineer eng = new Engineer();
		// 세금율을 계산 -> taxRate() //책에서는 ->368p buy()
		emp.taxRate(emp); // = emp.taxRate(new Employee()); 이렇게 써도됨.
		man.taxRate(man);
		eng.taxRate(eng);
	}
}
