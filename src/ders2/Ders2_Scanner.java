package ders2;

import java.util.Scanner;

public class Ders2_Scanner {

	public static void main(String[] args) {
		// Kullanicidan karenin bir kenar uzunlugunu alin ve karenin cevresini ve alanini 
		// hesaplayip yazdirin
		
		Scanner scan= new Scanner(System.in);
			System.out.print("Lütfen karenin bir kenar uzunluðunu giriniz: ");	
			
			double kenarUzunlugu= scan.nextDouble();
			double alan= kenarUzunlugu * kenarUzunlugu;
			double cevre= kenarUzunlugu * 4;
			
			System.out.println("Karenin Alaný: " +alan);
			System.out.println("Karenin Çevresi: " +cevre);
			
	}

}
