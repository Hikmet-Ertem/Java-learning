package ders1;

import java.util.Scanner;

public class IfElse1 {

	public static void main(String[] args) {
		
		// Soru 1) Kullanicidan dikdortgenin kenar uzunluklarini isteyin
		// ve dikdortgenin kare olup olmadigini yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen dikdörtgenin kenar uzuluklarýný giriniz");
		
		int kenar1=scan.nextInt();
		int kenar2=scan.nextInt();
		
		if (kenar1==kenar2) {
			System.out.println("Dikdörtgen karedir");
		}else {
			System.out.println("Dikdörtgen kare deðildir");
		}

	}

}
