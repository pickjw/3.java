package Pac1;


public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		A u = new A();
		u.d_imsi++;
		System.out.println("u.d_imsi=>"+u.d_imsi);
		A s = new A();
		System.out.println("s.d_imsi=>"+s.d_imsi);
		u.d++;
		s.d++;
		System.out.println("u.d의 값은 =>"+u.d);
		
		System.out.println("s.d의 값은 =>"+s.d);
		
		System.out.println(A.company);
		A.d++; 
		
		
	}

}
