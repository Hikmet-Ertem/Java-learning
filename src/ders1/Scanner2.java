package ders1;

import java.util.Scanner;

public class Scanner2 {

	public static void main(String[] args) {
		// Soru 2) Kullanicidan karenin bir kenar uzunlugunu alin ve karenin cevresini ve alanini

		//hesaplayip yazdirin
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Lütfen karenin bir kenar uzunluðunu giriniz");
		
		double sayi= scan.nextDouble();
		
		System.out.println("Karenin Çevresi: " + (4 *sayi));
				
		System.out.println("Karenin Alaný: " + (sayi *sayi));
		
		

	}

}
