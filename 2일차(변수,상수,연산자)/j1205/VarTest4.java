package j1205;

//변수의 종류(사용범위)=>{ 블럭처리   },상수
public class VarTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 들여쓰기=>정렬
		int su = 4;// 4byte =>일단 저장이 되면 중간에 값을 변경X->상수화
		su = 7;
		{
			// 특정 정해진 범위에서만 사용이 되는 변수->지역변수
			int su2 = 90;
			System.out.println("su2=>" + su2);
			System.out.println("첫번째su->" + su);
		}
		//안쪽범위의 su2변수는 범위밖에서는 사용불가능
		//System.out.println("범위밖의 su2=>" + su2);
		//ctrl+s(저장)->컴파일=>ctrl+F11(실행)
		System.out.println("su=>" + su);
		//final 자료형 변수명=>상수 =>상수화된 변수->전부 대문자로 작성(관례)
		final int SU3=67; 
		//su3=90;
		System.out.println("su3=>"+SU3);
	}
}



