package j0105;

import java.sql.*;//DB연결->1.url(접속컴퓨터 경로),2.계정O,3.암호O

public class DBTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Connection con=null;//연결객체
        String url="jdbc:oracle:thin:@localhost:1521:orcl";
        try {
        	//1.접속할 데이터베이스의 드라이버를 메모리에 로드
        	//상위패키지명.하위패키지명..OracleDriver(드라이버클래스명)
        	Class.forName("oracle.jdbc.driver.OracleDriver"); 
        	//2.연결객체 얻어온다.(1.접속할 컴퓨터의 위치 2.접속할계정 3.암호)
        	con=DriverManager.getConnection(url, "scott", "tiger");
            System.out.println("접속 con=>"+con);
        }catch(Exception e) {
        	System.out.println("DB연결에 실패=>"+e);
        }
	}
}





