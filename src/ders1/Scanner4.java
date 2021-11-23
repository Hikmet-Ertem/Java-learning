package ders1;

import java.util.Scanner;

public class Scanner4 {

	public static void main(String[] args) {
		// Soru 4) Kullanicidan dikdortgenler prizmasinin uzun, kisa kenarlarini ve yuksekligini isteyip

		//prizmanin hacmini hesaplayip yazdirin
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Lütfen dikdortgenler prizmasinin uzun, kisa kenarlarini ve yuksekligini giriniz");
		
		int uzun= scan.nextInt();
		int kýsa= scan.nextInt();
		int yukseklik= scan.nextInt();
		
		
		
		System.out.println("Uzun kenar: " + uzun );
		System.out.println("Kýsa kenar: " + kýsa );
		System.out.println("Yükseklik: " + yukseklik );
		
		System.out.println("Prizmanýn Hacmi: " + uzun *kýsa*yukseklik);
}
}
