package j0108;
//1.테이블을 생성->2.insert->3.select

import java.sql.*;//DB접속

public class DBTest2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con=null;//연결객체
		//추가
		Statement stmt=null;//create table
		PreparedStatement pstmt=null;//insert
		Statement stmt2=null;//select
		ResultSet rs=null;// select한 결과물
		String sql="";//실행시킬 SQL구문을 저장
		
        String url="jdbc:oracle:thin:@localhost:1521:orcl";
        try {
        	//1.접속할 데이터베이스의 드라이버를 메모리에 로드
        	Class.forName("oracle.jdbc.driver.OracleDriver"); 
        	//2.연결객체 얻어온다.(1.접속할 컴퓨터의 위치 2.접속할계정 3.암호)
        	con=DriverManager.getConnection(url, "scott", "tiger");
            System.out.println("접속 con=>"+con);
            //3.테이블을 생성
            stmt=con.createStatement();
            sql="create table MyTest(name varchar2(20),age number)";
            stmt.executeUpdate(sql);
            System.out.println("MyTest 테이블 생성 OK!!!!");
            //4.insert
            pstmt=con.prepareStatement("insert into MyTest values(?,?)");
            //pstmt객체명.setString,setInt,setDouble,setFloat,,,(?의 순서,입력할값)
            pstmt.setString(1, "Lee");
            pstmt.setInt(2, 34);
            pstmt.execute();//pstmt.executeUpdate();
            //5.select->각 필드을 불러와서 화면에 출력
            stmt2=con.createStatement();
            String sql2="select  * from MyTest";
            rs=stmt2.executeQuery(sql2);
            //6.콘솔에 출력
            while(rs.next()) {//테이블에 들어가 있는 데이터를 계속해서 불러올수있다면
            	String name=rs.getString("name");
            	int age=rs.getInt(2);
            	System.out.println("이름=>"+name+",나이=>"+age);
            }
            //메모리를 해제하는 구문
            rs.close();
            stmt2.close(); pstmt.close();stmt.close();
            con.close();
        }catch(Exception e) {
        	System.out.println("DB연결에 실패=>"+e);
        }
	}
}





