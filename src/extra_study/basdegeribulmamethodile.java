package extra_study;

import java.util.Scanner;

public class basdegeribulmamethodile {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("lutfen dort basamakli bir sayi giriniz...");
	int sayi = scan.nextInt();
	
	basamakdegeritoplami(sayi);
	
	
	
	
	}

	private static void basamakdegeritoplami(int sayi) {
		if ((sayi>=1000)&&(sayi<10000)) {
		int	toplam = ((sayi%10)+((sayi/10)%10)+((sayi/100)%10)+(sayi/1000));
		System.out.println(toplam);
		}else {
			System.out.println("girilen sayi yanlistir");
		}
		
	}
}

