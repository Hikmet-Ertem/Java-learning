package ders1;

import java.util.Scanner;

public class Scanner4 {

	public static void main(String[] args) {
		// Soru 4) Kullanicidan dikdortgenler prizmasinin uzun, kisa kenarlarini ve yuksekligini isteyip

		//prizmanin hacmini hesaplayip yazdirin
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("L�tfen dikdortgenler prizmasinin uzun, kisa kenarlarini ve yuksekligini giriniz");
		
		int uzun= scan.nextInt();
		int k�sa= scan.nextInt();
		int yukseklik= scan.nextInt();
		
		
		
		System.out.println("Uzun kenar: " + uzun );
		System.out.println("K�sa kenar: " + k�sa );
		System.out.println("Y�kseklik: " + yukseklik );
		
		System.out.println("Prizman�n Hacmi: " + uzun *k�sa*yukseklik);
}
}
