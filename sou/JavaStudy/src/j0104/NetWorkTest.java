package j0104;

import java.net.*;//네트워크 패키지(InetAddress,Socket,ServerSocket)
//Checked Exception계열->반드시 예외처리해야 한다.
//입출력,DB연동,네트워크통신,쓰레드

public class NetWorkTest {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
        InetAddress ia=null;
        InetAddress ia2[];//컴퓨터가 한대 이상
        //원격컴퓨터에 접속->도메인
        ia=InetAddress.getByName("www.naver.com");//도메인이름
        System.out.println("서버주소->"+ia.getHostAddress());//ip주소
        //서버가 한대이상->getAllByName
        ia2=InetAddress.getAllByName("www.naver.com");
        //확장 for문
        for(InetAddress aa:ia2)
        	System.out.println("서버들주소->"+aa.getHostAddress());
        System.out.println("==자기 컴퓨터의 정보==");
        InetAddress host=InetAddress.getLocalHost();//자기 컴퓨터의 정보
        System.out.println("컴퓨터명=>"+host.getHostName());//컴퓨터명
        System.out.println("ip주소=>"+host.getHostAddress());//ip주소
	}
}







