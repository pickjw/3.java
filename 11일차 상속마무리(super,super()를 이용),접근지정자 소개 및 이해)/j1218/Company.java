package j1218;

//신입->부서에 배치->팀장의 정보
//      팀장(p)자식클래스        직원(q) 부모클래스
class Manager extends Employee{
	
	/* (1) 상속표시
	String name;
	int age;
	String sung;
	String addr;
	long salary;*/
	//추가
	String department;//부서명
	//객체배열->기본자료형 배열->객체(Employee)만 따로 저장하는 배열
	Employee sub[];//신입사원들만->has a 관계
	//생성자는 상속이 안되기에 그대로 따로 작성
	public Manager() {}
	public Manager(String name,int age,String sung,long salary,
			                 String addr,String department) {
	     super(name,age,sung,addr,salary);//부모생성자 자식클래스 대신에
	                                                          //데이터를 저장하는 구문
		/*
		this.name=name;
		this.age=age;
		this.sung=sung;
		this.salary=salary;
		this.addr=addr;*/
		//추가
		this.department=department;
	}
	//추가코딩->private <default <protected < public
	//private는 오버라이딩 부여할 수가 없다.
	public double bonus() {
		return salary*3.0;   //팀장->return salary*3.0
	}
	
	public void display() {
		 super.display();
		/*
		System.out.println("==직원의 정보 출력==");
		System.out.println("이름="+this.name);//m1.name
		System.out.println("나이="+age);
		System.out.println("성별="+sung);
		System.out.println("주소="+addr);
		System.out.println("급여="+salary);
		System.out.println("보너스="+this.bonus());*/
		//추가
		System.out.println("부서명=>"+department);
	}
	//--------------------------------------------------------
}

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //1.직원3명(최종 합격자)
		Employee e1=new Employee("홍길동",23,"남","서울시 강북구",1500);
		Employee e2=new Employee("이길수",35,"남","대전시 중구",1700);
		Employee e3=new Employee("임시",30,"여","부산시",1800);
		//2.적합도 검사->영업부에 3명에 배치
		Manager m1=new Manager("테스트",42,"남",2500,"서울시 강남구","영업부");
		m1.sub=new Employee[3];//0,1,2
		m1.sub[0]=e1; //e1.name=>m1.sub[0].name
		m1.sub[1]=e2;//e2.name=>m1.sub[1].name
		m1.sub[2]=e3;//e3.name=>m1.sub[2].name
		//신입사원 정보,팀장정보 출력
		for(int i=0;i<m1.sub.length;i++) {
			System.out.println("직원이름="+m1.sub[i].name);
			System.out.println("직원나이="+m1.sub[i].age);
			System.out.println("==================");
			m1.sub[i].display();
		}
		//팀장
		m1.display();
		//System.out.println("팀장의 부서명=>"+m1.department);
	}
}






