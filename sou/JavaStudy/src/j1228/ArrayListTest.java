package j1228;

import java.util.*;

//리스트 구조에 배열이 추가된 모양->Vector->메모리를 많이 차지->ArrayList
public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //ArrayList<String> list=new ArrayList<String>();//<E> element(요소 자료형)
        LinkedList<String> list=new LinkedList<String>();
        list.add("포도");//0->"포도"->"오렌지"
        list.add("딸기");//1
        //키위->2
        list.add("복숭아");//2->3
        //2.중간에 삽입->add(삽입위치,삽입할 객체명)
        list.add(2,"키위");
        //3.수정->set(수정할위치,수정할값)
        list.set(0, "오렌지");
        //4.삭제->remove(삭제할 데이터명) or remove(인덱스번호)->중복 데이터삭제
        list.remove("키위");
        //5.완전 삭제->clear()
        //if(list.size()==0) or if(list.isEmpty())
        System.out.println("크기(size)=>"+list.size());
        System.out.println("데이터 저장유무(isEmpty)=>"+list.isEmpty());
        //6.검색방법->배열
        for(int i=0;i<list.size();i++) {
        	String temp=list.get(i); //형변환 X elementAt(i)
        	System.out.println("temp=>"+temp);
        }
        //7.검색방법2->확장 for문->배열 또는 컬렉션객체의 값을 꺼낼때
        System.out.println("===확장 for문==="); //String [] list
        for(String s:list)  //for(자료형 출력변수명:배열 또는 컬렉션객체명)
        	System.out.println(s);
        System.out.println(list.contains("포도"));//false(없으면)
	}
}





