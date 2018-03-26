package j1227;
//사원정보를 입력->파일로 저장(String)
//자바의 자료형에 맞게 저장->DataOutputStream,DataInputStream

import java.io.*;

public class Sawon {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
         String mem_name=null;//이름
         String mem_id=null;//사번
         String mem_pwd=null;//암호
         String mem_gender=null;//성별
         String mem_age=null;//나이->int mem_age=23=>"23"
         String mem_phone=null;//전번
         
         //Scanner sc=new Scanner(System.in);
         BufferedReader br=new BufferedReader
        		                                 (new InputStreamReader(System.in));
         //한글보존 FileWriter<->FileReader
         File f=new File("c:/webtest/3.java/sawon.txt");
         FileWriter fw=new FileWriter(f,true);//추가모드를 설정
         System.out.println("======회원 정보 입력하기======");
         //이름
         System.out.println("이름=>");
         mem_name=br.readLine();
         //ID
         System.out.println("ID=>");
         mem_id=br.readLine();
         //pwd
         System.out.println("비번=>");
         mem_pwd=br.readLine();
         //성별
         System.out.println("성별=>");
         mem_gender=br.readLine();
         //나이
         System.out.println("나이=>");
         mem_age=br.readLine();
         //전번
         System.out.println("전번=>");
         mem_phone=br.readLine();
         //파일에 저장
         fw.write(mem_name);fw.write("\r\n");//파일 내부에서 줄바꿈
         fw.write(mem_id);fw.write("\r\n");
         fw.write(mem_pwd);fw.write("\r\n");
         fw.write(mem_gender);fw.write("\r\n");
         fw.write(mem_age);fw.write("\r\n");
         fw.write(mem_phone);fw.write("\r\n");
         fw.write("===================");fw.write("\r\n");
         //더이상 입력X, 출력X ->메모리 해제
         fw.close(); br.close();
	}
}





