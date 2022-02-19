package extra_study;

import java.util.Scanner;

public class method_study {

	public static void main(String[] args) {
		//Kullanicidan ismini, soyismini ve bosluk birakmadan 16 hane olarak kredi karti
		//numarasini alin. Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak
		//sekilde, KK numarasini ise 4 rakamlik 4 blok ve aralarinda bosluk olacak sekilde
		//duzelten 2 method yazin, ve programda kullanabilmek icin duzenlenmis hallerini
		//geri dondurun.
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen isminizi giriniz...");
		String isim = scan.nextLine();
		System.out.println("Lutfen soyisminizi giriniz...");
		String soyisim = scan.nextLine();
		System.out.println("16 haneli kredi karti numaranizi bosluk birakmadan giriniz...");
		int kartno = scan.nextInt();
		
		name(isim,soyisim);
		
		
		
		
		

	}

	private static String name(String isim, String soyisim) {
		isim =  isim.substring(0,1).toUpperCase()+ isim.substring(1).toLowerCase();
		soyisim = soyisim.substring(0,1).toUpperCase()+ soyisim.substring(1).toLowerCase();
		
		
		
		
		
		return isim+" "+soyisim;
		
		
	}

	

	

}
