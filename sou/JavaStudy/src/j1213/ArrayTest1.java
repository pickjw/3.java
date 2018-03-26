package j1213;
//1.배열의 선언,사용
public class ArrayTest1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //int su=10,su2=20,su3=30;
		int su2;//일반 변수는 반드시 초기값을 줘야 사용이 가능
		           //배열내부에 속해있는 변수=>자동적으로 그 자료형에 맞게 초기값O
		//System.out.println("su2=>"+su2);
        //1.배열선언=>자료형 배열명[]=new 자료형[갯수];//0~
        int su[]=new int[3];//0,1,2 int(0),boolean(false),double(0.0),char c=''
		//char su[]=new char[3];
        System.out.println("su=>"+su);//배열은 객체형(참조형)으로 취급
        su[0]=10; su[1]=20; su[2]=30;
        System.out.println("su[1]->"+su[1]);
        System.out.println("su[2]->"+su[2]);
        System.out.println("2.두번째 배열을 만드는 방법");
        //자료형 배열명[]={값1,값2,값3,,,,값n} //생성과 초기화를 동시에 적용
        //             0(인덱스=>배열의 첨자)
        int c[]= {10,20,30,40,50,60,70,80,90,100};//많은 공간뿐만 아니라 데이터를 저장
        /* int num=30
         * System.out.println(num)
         * int c[]=new int[6];
         * c[0]=10;c[1]=20; c[2]=30; c[3]=40;c[4]=50;c[5]=60
         */
        //배열명.length를 사용하는 경우->장점
        for(int i=0;i<c.length;i++)
        	System.out.println("c["+i+"]=>"+c[i]);
        //확장 for문(=향상된 for문)=>객체 위주=>배열의 내용을 확인(첨자 사용 X)
        //형식) for(배열의 자료형 출력변수:배열명 or 켈렉션 객체(출력대상자)
        for(int num:c)
        	System.out.println("num=>"+num);
	}
}









