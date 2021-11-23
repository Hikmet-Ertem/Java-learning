package ders2;

import java.util.Scanner;

public class Ders1_Scanner {

	public static void main(String[] args) {
		// kullanýcýdan iki farklý sayý isteyin
		// bu sayýlarýn dört iþlem sonuçlarýný yazdýrýn.
		
		Scanner scan= new Scanner(System.in);
		
		System.out.print("Lütfen sayi biri giriniz: ");
		
		double sayi1=scan.nextDouble();
		
		System.out.print("Lütfen sayi ikiyi giriniz: ");
		
		double sayi2=scan.nextDouble();
		
		double toplama= sayi1 + sayi2;
		System.out.println("Toplama: " +toplama);
		
		double cýkarma= sayi1 - sayi2;
		System.out.println("Cýkarma: " +cýkarma);
		
		double carpma= sayi1 * sayi2;
		System.out.println("Carpma: " +carpma);
		
		double bolme= sayi1 / sayi2;
		System.out.println("Bolme: "+ bolme);
		
		
		
			

	}

}
