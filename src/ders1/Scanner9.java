package ders1;

import java.util.Scanner;

public class Scanner9 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan uc basamakli bir sayi alin 
		 * ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin
		 * 
		 * 
		 * Ornek : Inputs : 853 
		 * Output : Girdiginiz sayinin birler basamagi : 3
		 *          Girdiginiz sayinin onlar basamagi : 5 
		 *          Girdiginiz sayinin yuzler basamagi : 8
		 * 
		 * 
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen �� basamakl� bir say� giriniz");
		
		int sayi=scan.nextInt();
		
		System.out.println("Sayinin birler basamagi: " + sayi%10);
		System.out.println("Sayinin onlar basamagi: " + sayi/10%10);
		System.out.println("Sayinin y�zler basamagi: " + sayi/100);

	}

}
