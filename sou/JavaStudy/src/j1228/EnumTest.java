package j1228;

import java.util.*;

//컬렉션에서 공통으로 사용하는 검색방법,Map에 관련된 예제
public class EnumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Vector<String> v=new Vector<String>();
         v.add("test1");  v.add("test2"); v.add("test3");
         System.out.println("HashSet,Hashtable테이블(Map)");//표형태<K,V>
         //Hashtable<K(key),V(value)>
         Hashtable<Integer,String> h=new Hashtable<Integer,String>();
         //형식)put(key번호,저장할객체)->표형태로 저장->검색속도가 제일 빠르다.
         //키값으로 데이터를 빨리 찾기때문.
         h.put(1, "홍길동"); h.put(2, "010-123-0987"); h.put(3, "서울시 강남구");
         String addr=h.get(3);
         System.out.println("addr=>"+addr);
         //1.공통(Enumeration->배열의 값을 출력)->Iterator의 구버전
         Enumeration<String> eu=v.elements();
         while(eu.hasMoreElements()) { //꺼낼데이터가 존재한다면->true
        	 System.out.println(eu.nextElement());//하나씩 꺼내서 출력시켜주세요
         }
         //2.Iterator
         Iterator<String> ih=v.iterator();
         while(ih.hasNext()==true) {
        	 System.out.println(ih.next());
         }
         //3.두번거치는 경우->Collections객체
         /*Collection<String> c=h.values();
         Iterator<String> iv=c.iterator();*/ //도서관=>책꽂이에 있는 책을 다시 꺼낸경우
         Iterator<String> iv=h.values().iterator();
         while(iv.hasNext()) {
        	 System.out.println(iv.next());
         }
	}

}








