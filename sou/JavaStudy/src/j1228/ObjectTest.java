package j1228;

//직렬화가 가능한 클래스를 작성->객체생성->네트워크,파일로 저장
//형식) 클래스명 implements java.io.Serializable (maker 인터페이스)
import java.io.*;

class Person implements Serializable{
	String name;
	int age;
	String addr;
	transient String tel; //transient 멤버변수명=>파일에 저장X
}


public class ObjectTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
          Person p=new Person();
          p.name="테스트";
          p.age=45;
          p.addr="경기도 광명시 ~";
          p.tel="032-123-3456";
          
          //파일로 ->ObjectOutputStream->FileOutputStream
          FileOutputStream fos=new FileOutputStream("c:/webtest/3.java/object.txt");
          ObjectOutputStream oos=new ObjectOutputStream(fos);
          //~,writeBytes("테스트"); ~writeInt(45),~.writeBytes("경기도~");
          //객체가 Object형으로 저장한 이유->어떠한 클래스 객체라도 저장하기위함
          
          oos.writeObject(p); //writeObject(저장할 객체명)<->readObject()
          oos.close();
          //집에 있는 컴퓨터에서 작업
          FileInputStream fis=new FileInputStream("c:/webtest/3.java/object.txt");
          ObjectInputStream ois=new ObjectInputStream(fis);
          //직렬화된 객체를 다시 원래상태로 되돌리기 위해서 원래 객체형으로 형변환
          Person p2=(Person)ois.readObject();
          System.out.println("이름=>"+p2.name
        		         +",나이=>"+p2.age+",주소="+p2.addr+",전번="+p2.tel);
	}

}





