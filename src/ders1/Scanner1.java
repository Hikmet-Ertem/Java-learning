package ders1;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
		// Soru 1) Kullanicidan iki tamsayi alip bu sayilarin toplam,fark ve carpimlarini yazdirin
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Lütfen iki tam sayý giriniz");
		
		int sayi1= scan.nextInt();
		int sayi2= scan.nextInt();
		
		System.out.println("Girmiþ olduðunuz sayýlarýn toplamý:  " +(sayi1 + sayi2));
		
		System.out.println("Girmiþ olduðunuz sayýlarýn farký:  " +(sayi1 - sayi2));
		
		System.out.println("Girmiþ olduðunuz sayýlarýn çarpýmý:  " +(sayi1 * sayi2));
		

	}

}
