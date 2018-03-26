package j1220;

//String->StringBuffer를 사용하라(권장)
public class StringBuffTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String str="abcdef";
      //StringBuffer str=new StringBuffer("abcdef");=>축약형
      String str2="test";
      String str3=str+str2;
      //StringBuffer->String으로 변환시켜주는 메서드(toString())
      //String str3=new StringBuffer("abcdef").append("test").toString();
      System.out.println("str3=>"+str3);
      StringBuffer sb=new StringBuffer("abcdef");
      //1.append
      sb.append("test");//문자열 뒤에 추가할때 사용
      System.out.println("sb(변경후)=>"+sb);
      //2.중간에 문자열을 삽입(공백)->insert(위치,"삽입할 문자열");
      sb.insert(1,"imsi    ");
      System.out.println("sb(문자열을 삽입후)=>"+sb);
      //3.delete(시작인덱스번호, 종료인덱스번호(바로 앞번호까지))
      sb.delete(0, 5);//범위
      System.out.println("sb(문자열 삭제후)=>"+sb);
      String str4=sb.toString();
      System.out.println("str4=>"+str4);
	}
}






