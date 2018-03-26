package j1219;
//자바의 특징,객체를 얻어오는 3번째 방법->사용되는 메모리양확인
//Runtime

public class GCCollector {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        byte test[]=new byte[1024];
        test[1]=20;test[2]=34;//,,,,
        System.out.println("test=>"+test);//배열도 객체
        //Runtime r=new Runtime();
        Runtime r=Runtime.getRuntime();
        System.out.println("사용메모리양:"
                           +(r.totalMemory()-r.freeMemory())/1024+"K");
        test=null;//주소값이 지워진다.->쓸데없는 데이터가 존재
        //수동으로 메모리를 제거->gc()
        System.gc(); //System.exit(0);
        System.out.println("사용메모리양:"
                +(r.totalMemory()-r.freeMemory())/1024+"K");
	}

}





