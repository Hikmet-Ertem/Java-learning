package ders1;

import java.util.Scanner;

public class Modulus2 {

	public static void main(String[] args) {
		// be� basamakl� bir say�n�n rakamlar�n� toplay�n
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Be� basamakl� bir say� giriniz");
		
		int sayi= scan.nextInt(); // 68542
		
		int rakamlarToplam�=0;
		
		int birler=sayi%10; // bu i�lem bana 2 yi verecek
		System.out.println(birler);
		int onlar=sayi/10%10; // bu i�lem bana 4 � verir
		System.out.println(onlar);
		int yuzler=sayi/100%10; // bu i�lem bana 5 i verir
		System.out.println(yuzler);
		int binler=sayi/1000%10; // bu i�lem bana 8 i verir
		System.out.println(binler);
		int onBinler=sayi/10000%10; // bu i�lem bana 6 y� verir
		System.out.println(onBinler);
		
		System.out.println("Rakamlar Toplami: " +(birler +onlar +yuzler +binler+onBinler));
		
	}

}
