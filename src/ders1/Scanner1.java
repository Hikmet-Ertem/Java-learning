package ders1;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
		// Soru 1) Kullanicidan iki tamsayi alip bu sayilarin toplam,fark ve carpimlarini yazdirin
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("L�tfen iki tam say� giriniz");
		
		int sayi1= scan.nextInt();
		int sayi2= scan.nextInt();
		
		System.out.println("Girmi� oldu�unuz say�lar�n toplam�:  " +(sayi1 + sayi2));
		
		System.out.println("Girmi� oldu�unuz say�lar�n fark�:  " +(sayi1 - sayi2));
		
		System.out.println("Girmi� oldu�unuz say�lar�n �arp�m�:  " +(sayi1 * sayi2));
		

	}

}
