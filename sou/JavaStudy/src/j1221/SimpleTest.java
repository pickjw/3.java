package j1221;

import java.text.SimpleDateFormat;//출력양식을 지정->출력
import java.util.Calendar;
import java.util.Date;//일반적인 날짜정보를 얻어오는 클래스
//java.sql.Date->DB에 해당되는 날짜정보를 얻어오는 클래스

//날짜양식을 맞춰서->2017-12-21, 2017/12/21
public class SimpleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /* (1)
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date d=new Date();
        Calendar cal=Calendar.getInstance();//Calendar->날짜출력->객체
        //Thu Dec 21 11:22:23 KST 2017
        System.out.println("오늘의 날짜(d)=>"+d);//d.toString()->날짜->문자출력
        System.out.println("==============");
        System.out.println("오늘의 날짜형식=>"+sdf.format(d));*/
		//SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		SimpleDateFormat sdf=getSimple();
		SimpleTest st=new SimpleTest();
		st.setSimple(sdf);
	}
	//(2)SimpleDateFormat객체를 얻어오는 메서드->getXXX
	public static SimpleDateFormat getSimple() {
		return new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	}
	
	//(3)SimpleDateFormat객체를 전달해주는 메서드->setXXX(자료형 객체명)
	public void setSimple(SimpleDateFormat sdf) {
		Date d=new Date();
        System.out.println("오늘의 날짜형식=>"+sdf.format(d));
	}
}





