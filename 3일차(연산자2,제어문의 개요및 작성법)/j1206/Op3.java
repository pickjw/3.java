//package 최상위패키지명(=폴더).하위폴더명,,,;
package j1206;

public class Op3 {
   
	public static void main(String[] args) {
		//메서드명 ctrl+space->단어에 해당하는 메서드 찾아준다.
		int i1=3, i2=5, i3=7;
		int i4;//선언만->값을 저장=>할당
		boolean b1,b2,b3;
		boolean b4=true;
		//관계->(3>5)
		System.out.println("(i1>i2)=>"+(i1>i2));
		//(5<7)
		System.out.println("(i2<i3)=>"+(i2<i3));
		//&& (조건평가)
		b1=(i1>i2) && (i2<i3);//(3>5) && (5<7)->false && true->false
		System.out.println("(i1>i2) && (i2<i3)=>"+((i1>i2) && (i2<i3)));
		//  ||
		b2=(i1>i2) || (i2<i3);//(3>5) || (5<7)->false || true->true
		System.out.println("(i1>i2) || (i2<i3)=>"+((i1>i2) || (i2<i3)));
		
		//b3의 부정(!)
		b3=!b4;
		System.out.println("!b4=>"+b3);//false
		//& 모두평가
		b1=(i1>i2) & (i2<i3);//(3>5) & (5<7)->false & true->false
		System.out.println("(i1>i2) & (i2<i3)=>"+((i1>i2) & (i2<i3)));
		// |
		b2=(i1>i2) | (i2<i3);//(3>5) | (5<7)->false | true->true
		System.out.println("(i1>i2) | (i2<i3)=>"+((i1>i2) | (i2<i3)));
		
		//^  (서로 값이 다르면 참) TT,FF->F
		b3=(i1>i2) ^ (i2<i3);//(3>5) ^ (5<7)->false ^ true->true
		System.out.println("(i1>i2) ^ (i2<i3)=>"+((i1>i2) ^ (i2<i3)));
		
		
	}
}

