package j0104;

import java.io.*;//접속->입출력이 필요
//특정사이트에 접속->정보를 가져오는 클래스->URL,URLConnection
import java.net.URL;
import java.util.Scanner;//키보드로 특정사이트를 직접 입력

public class URLTest {

	public URLTest(String s) throws Exception {
		URL url=new URL(s);//도메인이름을 이용해서  url객체를 얻어오기위해서
		System.out.println("url=>"+url);
		//직접 사이트에 접속해서 데이터를 가져오기->url->입출력스트림객체 얻어오기
		InputStream in=url.openStream();
		//사이트접속=>홈페이지의 파일을 가져와서 콘솔에 출력
		BufferedReader br=
				      new BufferedReader(new InputStreamReader(in));
		String ss;//읽어들여서 임시로 저장할 변수 선언
		while((ss=br.readLine())!=null) {//불러올 데이터가 존재하는 한
			System.out.println(ss);//System.our.write(ss);
		}
		in.close(); br.close();
	}
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         System.out.println("접속할 사이트 도메인이름?(http://도메인이름)");
         String domain=sc.next();
         //URL url=new URL(domain)
         new URLTest(domain);
	}
}







