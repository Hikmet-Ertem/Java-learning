package ders2;

import java.util.Scanner;

public class FoorLoop5 {

	public static void main(String[] args) {
		//Kullan�c�dan 100 den k���k bir tam say� isteyin. 1 den ba�layarak
		//girilen sayiya kadar 3 �n veya 5 in kat� olan sayilar� yazd�r�n
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen 100 den k���k bir sayi giriniz.");

		int sayi=scan.nextInt();
		
		for (int i = 1; i < sayi; i++) {
			if (i%3==0 || i%5==0) {
				
				System.out.print(i + " ");
				
			}
			
			
			
			
		}
	}

}
