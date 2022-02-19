package extra_study;

import java.util.Scanner;

public class basamakdegeriyazdirma {

	public static void main(String[] args) {
		//Kullanıcıdan üç basamaklı bir sayı girmesini ve bu sayının basamaklarının toplamını bulmasını isteyin.

        // Örnek Çıktı:

       // Verilen tamsayının rakamları toplamı 10'dur.
    Scanner scan = new Scanner(System.in);
    System.out.println("lutfen 3 basamakli bir sayi giriniz...");
    int sayi=scan.nextInt();
    if ((sayi<100)||(sayi>999) ) {
    	System.out.println("Lutfen 3 basamakli bir sayi giriniz...");
    }else {
    	int rakamlartoplami = 0 ;
        int rakam=sayi%10;
        rakamlartoplami+=rakam;    
        
        sayi/=10 ;
        rakam = sayi%10;
        rakamlartoplami+=rakam;
        
        sayi/=10;
        rakam = sayi ;
        rakamlartoplami+=rakam;
        System.out.println("Basamak degerleri toplami:"+rakamlartoplami);
    }
    scan.close();
    
    
	}

}
