package j1219;

import java.util.Scanner; //ctrl+shift+o

public class OpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int a,b;//첫수,두번째수를 저장
        char op;//"+"->'+' =>charAt(0)
        System.out.println("첫수를 입력?");
        //a=sc.nextInt(); (1)//nextDouble(소수점)=>50.3
        a=Integer.parseInt(sc.nextLine()); //(2)//"5"
        System.out.println("연산자[+,-,*,/]");//"+,-,*,/"
        //String s=sc.next() (1);//"+"(문자열을 equals()를 이용)->'+'
                                    //next()->단어중심,공백인식X  
                                    //nextLine()->한문장(한라인)  공백인식 O
        String s=sc.nextLine();//(2)
        op=s.charAt(0);
        
        System.out.println("두번째수를 입력?");
        //b=sc.nextInt(); (1)
        b=Integer.parseInt(sc.nextLine());
        
        switch (op) {//'+'
        //+
		case '+':
			         System.out.println(a+"+"+b+"="+(a+b));
			break;

		case '-':
	         System.out.println(a+"-"+b+"="+(a-b));
	        break;
	    
		case '*':
	         System.out.println(a+"*"+b+"="+(a*b));
	         break;
	
		case '/':
	         System.out.println(a+"/"+b+"="+(a/b));
	          break;
		}//switch
	}
}











