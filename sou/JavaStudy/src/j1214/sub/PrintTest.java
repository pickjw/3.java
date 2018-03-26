package j1214.sub;

public class PrintTest {
 
	//메서드를 작성할때 앞에 접근지정자 public을 주지 않으면
	//외부에서 호출x->
	//default권한->내부용(내부 패키지에서만 사용이 가능한 메서드)
	public void charPrint(int n,char ch) {
		 for(int i=1;i<=n;i++)
	           System.out.print(ch);
	}
}
