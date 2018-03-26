package j1205;
//실수->float,double
public class VasrTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("소수점을 저장");
       float f=3.5f;
       //8byte->4byte->1.형변환 2.처음부터 float으로 저장->숫자 F or f
       double d=5.3;//소수점은 디폴트 d or D
       System.out.println("f=>"+f+",d=>"+d);
     //소수점을 저장=>float? double?
       float m_float=123456.789123f;
       double m_double=123456.789123;
       System.out.println("m_float=>"+m_float+",m_double=>"+m_double);
	}
    
}





