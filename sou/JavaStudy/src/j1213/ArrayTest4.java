package j1213;

public class ArrayTest4 {

	public static void main(String x[]) {
		// TODO Auto-generated method stub
		int sum=0;
        String str=x[0];//"10"->10
        String str2=x[1];//"20"->20
        String str3=x[2];//"30"->30
       
		/*
		int str=x[0];//"10"->10
        int str2=x[1];//"20"->20
        int str3=x[2];
        */
        //10=Ineger.parseInt("10");
        sum=Integer.parseInt(str)+Integer.parseInt(str2)+Integer.parseInt(str3);
        String convert=String.valueOf(sum);
        //String convert("60")=String.valueOf(60);
        
        System.out.println("str=>"+str);
        System.out.println("str2=>"+str2);
        System.out.println("str3=>"+str3);
        System.out.println("sum=>"+sum);
        System.out.println("convert=>"+convert);
	}
}




