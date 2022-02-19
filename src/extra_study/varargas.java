package extra_study;

import java.util.Scanner;

public class varargas {

	public static void main(String[] args) {
		
		 Scanner scan= new Scanner(System.in);
	        System.out.print("Gireceğiniz isim kaç harften oluşuyor : ");
	        int harf=scan.nextInt();
	        System.out.print("Satır sayısı giriniz : ");
	        int satır=scan.nextInt();
	        String[] dizi=new String[harf];
	        int sayac=0;
	        
	        System.out.println("Bir İsim Giriniz (Her Harften Sonra Boşluğa Ya da Enter Tuşuna Basmayı Unutmayınız)");
	        for(int i=0;i<dizi.length;i++){
	            dizi[i]=scan.next();
	        }
	        
	        for(int i=0;i<satır;i++){
	            for(int j=1;j<(satır-i);j++){
	                System.out.print(" "); 
	            }
	            
	            for(int k=1;k<=(2*i+1);k++){
	                
	                if(sayac==harf){
	                    sayac-=harf;
	                    System.out.print(dizi[sayac]);
	                    sayac+=1;
	                }else{
	                    System.out.print(dizi[sayac]);
	                    sayac+=1;
	                }
	            }
	            System.out.println();
	        }
		
		
		
		
		/*add(5,7);
		add(5,7,-15);
		add(5,7,-15,20);
		add(5,7,-15,20,30);
		
	}

	private static void add(int... sayi) {
		int toplam = 0;
		for(int i: sayi) {
			toplam+=i ;
		}
		System.out.println(toplam);
	}
*/
	
	
	}
}
