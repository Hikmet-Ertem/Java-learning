package ders1;

import java.util.Scanner;

public class Scanner3 {

	private static final double Scanner = 0;

	public static void main(String[] args) {
		// Soru 3) Kullanicidan yaricap isteyip cemberin cevresini ve dairenin alanini hesaplayip yazdirin
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("L�tfen �emberin Yar��ap�n� Giriniz");
		
		double sayi= scan.nextDouble();
	
		
		System.out.println("�emberin �evresi: " + (sayi * 3.14 *2));
		System.out.println("�emberin Alan�: " + (sayi * 3.14 * sayi));
		

	}

}
