package j1229;

public class GenericMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String->T로 전달
        GenericEx<String> ge=new GenericEx<String>();
        GenericEx<Integer> ge2=new GenericEx<Integer>();
        GenericEx<Double> ge3=new GenericEx<Double>();
        
        String ss[]= {"제너릭","제너릭의 종류","제너릭 연습"};
        Integer ss2[]= {1,2,3};//int ss2={1,2,3}
        Double ss3[]= {3.4,5.6,9.8};
        
        ge.set(ss);
        ge.print();
        
        ge2.set(ss2);
        ge2.print();
        
        ge3.set(ss3);
        ge3.print();
	}
}
