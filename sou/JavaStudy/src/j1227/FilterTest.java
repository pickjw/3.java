package j1227;

import java.io.*;

//이름,국어,영어->이름,합계
public class FilterTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        //키보드(System.in)를 통해서 한글데이터를 입력하라->InputStreamReader
		/*InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);*/
		//키보드로 한글데이터가 깨지지않도록 데이터를 읽어들일때 사용구문
		BufferedReader br=new BufferedReader
				                         (new InputStreamReader(System.in));
		//Scanner sc=new Scanner(System.in);
		String name;
		int kor,eng,tot;
		
		System.out.println("이름은?");
		name=br.readLine();//sc.nextLine() or sc.next()
		System.out.println("국어점수?");
		kor=Integer.parseInt(br.readLine());
		
		System.out.println("영어점수?");
		eng=Integer.parseInt(br.readLine());//sc.nextInt()
		tot=kor+eng;
		System.out.println("이름="+name+",총점=>"+tot);
	}

}




