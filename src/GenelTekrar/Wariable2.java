package GenelTekrar;

import java.util.Scanner;

public class Wariable2 {

	public static void main(String[] args) {
		// Kullanicidan iki tamsayi alip bu sayilarin toplam,fark ve carpimlarini yazdirin
		
		/*
		int sayi1=10;
		int sayi2=20;
		
		System.out.println("Sayilarin toplami: " + (sayi1 + sayi2));
		System.out.println("Sayilarin farki: " + (sayi1 -sayi2));
		System.out.println("Sayilarin carpimi: " + (sayi1 * sayi2));
		
		*/
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lütfen iki tam sayi giriniz: ");
		
		int sayi1=scan.nextInt();
		int sayi2= scan.nextInt();
		
		System.out.println("Sayilarin toplami: " + (sayi1 + sayi2));
		System.out.println("Sayilarin farki: " + (sayi1 -sayi2));
		System.out.println("Sayilarin carpimi: " + (sayi1 * sayi2));
		
		
		
	}

}
