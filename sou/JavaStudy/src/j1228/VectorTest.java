package j1228;

//List인터페이스를 상속->자식클래스(Vector,ArrayList,,,)
import java.util.*;//Scanner ,Collection

public class VectorTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Vector<String> v=new Vector<String>();//new Vector(1,1);
         v.add("테스트");//0->Object
         v.addElement("임시테스트2");//1
         v.add("테스트2");//2
         System.out.println("v의 크기(size())->"+v.size());
         //값을 출력
         for(int i=0;i<v.size();i++) {
        	 /*String temp=(String)v.elementAt(i); //Object->String
        	 System.out.println("temp=>"+temp);*/
        	 System.out.println("temp=>"+v.elementAt(i));//자동형변환
         }
         //다양한 값을 저장
         //Vector<Integer> v2=new Vector<Integer>();
         Vector v2=new Vector();
         /*Character c=new Character('a');//'a'
         v2.add(c);*/// v2.add(new Character('a')); <-//v2.add('a');
         v2.add('a');//0
         //3.141592-->1
         v2.add(100);//v2.add(new Integer(100)); //1->2
         //중간에 값을 추가(insert)
         v2.insertElementAt(3.141592, 1);//저장할객체명,삽입할 인덱스번호
         //수정->setElementAt(수정할 객체명,수정할 인덱스번호)
         v2.setElementAt("Set", 2);//2인덱스번호->100
         //출력
         for(int i=0;i<v2.size();i++)
        	 System.out.println("v2의 값=>"+v2.elementAt(i)+",인덱스번호"+i);
         
	}

}
