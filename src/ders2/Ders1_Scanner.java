package ders2;

import java.util.Scanner;

public class Ders1_Scanner {

	public static void main(String[] args) {
		// kullan�c�dan iki farkl� say� isteyin
		// bu say�lar�n d�rt i�lem sonu�lar�n� yazd�r�n.
		
		Scanner scan= new Scanner(System.in);
		
		System.out.print("L�tfen sayi biri giriniz: ");
		
		double sayi1=scan.nextDouble();
		
		System.out.print("L�tfen sayi ikiyi giriniz: ");
		
		double sayi2=scan.nextDouble();
		
		double toplama= sayi1 + sayi2;
		System.out.println("Toplama: " +toplama);
		
		double c�karma= sayi1 - sayi2;
		System.out.println("C�karma: " +c�karma);
		
		double carpma= sayi1 * sayi2;
		System.out.println("Carpma: " +carpma);
		
		double bolme= sayi1 / sayi2;
		System.out.println("Bolme: "+ bolme);
		
		
		
			

	}

}
