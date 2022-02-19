package extra_study;

import java.util.Scanner;

public class While_Loop_TamBolenler {

	public static void main(String[] args) {
		// Soru 6 ) Kullanicidan bir sayi alin 
	//          ve bu sayiyi tam bolen sayilari 
	//          ve toplam kac tane olduklarini ekranda yazdirin
		
		 Scanner scan=new Scanner(System.in);
	     System.out.println("Lutfen pozitif bir tam sayi giriniz");
	     int sayi=scan.nextInt();
	     
	     int bolen = 1 ;
	     int count = 0 ;
	     
	     while (bolen<=sayi ) {
	    	 
	    	 if(sayi%bolen==0) {
	    		 System.out.print(bolen+" ");
	    		 count++ ;
	    		 
	    	 }
	    	 
	    	bolen++; 
	    	 
			
		}
	        System.out.println("");
			System.out.println(sayi + " sayisinin " + count+ " adet tam boleni vardir");

			scan.close();
	}

}
