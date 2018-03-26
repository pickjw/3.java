package j1229;

//회원가입->회원 로그인->관리자->회원리스트를 관리
import java.io.*; //입력->직렬화
import java.util.*;//Scanner,ArrayList~

class Person implements Serializable{ //표시 인터페이스(객체직렬화가 가능)
	
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}

public class ArrayListTest2 {

	//회원리스트를 출력시켜주는 메서드 작성?->웹(매개변수 O, 반환값 X)->Table
    public void getPersonList(ArrayList<Person> list) {  //getPersonList(String name,int age,,,,,)
    	                                          //getPersonList(Person p)   
    	//for(int i=0;i<list.size();i++){ Person st=list.get(i);st.getName()~}
    	for(Person st:list) { //for(객체자료형 객체명:컬렉션객체명)
    		System.out.println("이름은 "+st.getName());
    		System.out.println("나이는 "+st.getAge());
    		System.out.println("==============");
    	}
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("회원가입할 사람이름?");
        String name=sc.next();//단어
        System.out.println("나이는?");
        int age=sc.nextInt();
        
        Person p=new Person();//new Person(name,age) 생성자를 통해서 입력
        p.setName(name);//웹에서는 Setter Method로 값을 입력받는다.
        p.setAge(age);
        
        Person p2=new Person();
        p2.setName("임시2");
        p2.setAge(34);
        
        Person p3=new Person();
        p3.setName("테스트3");
        p3.setAge(32);
        
        //ArrayList 에 저장 ArrayList<String,Integer,,,>
        //ArrayList<Object> list=new ArrayList<Object>();
        ArrayList<Person> list=new ArrayList<Person>();
        list.add(p); list.add(p2); list.add(p3);
        ArrayListTest2 alt=new ArrayListTest2();
        alt.getPersonList(list);//관리자만 조회가능
	}

}





