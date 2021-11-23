package ders1;

import java.util.Scanner;

public class Modulus2 {

	public static void main(String[] args) {
		// beþ basamaklý bir sayýnýn rakamlarýný toplayýn
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Beþ basamaklý bir sayý giriniz");
		
		int sayi= scan.nextInt(); // 68542
		
		int rakamlarToplamý=0;
		
		int birler=sayi%10; // bu iþlem bana 2 yi verecek
		System.out.println(birler);
		int onlar=sayi/10%10; // bu iþlem bana 4 ü verir
		System.out.println(onlar);
		int yuzler=sayi/100%10; // bu iþlem bana 5 i verir
		System.out.println(yuzler);
		int binler=sayi/1000%10; // bu iþlem bana 8 i verir
		System.out.println(binler);
		int onBinler=sayi/10000%10; // bu iþlem bana 6 yý verir
		System.out.println(onBinler);
		
		System.out.println("Rakamlar Toplami: " +(birler +onlar +yuzler +binler+onBinler));
		
	}

}
