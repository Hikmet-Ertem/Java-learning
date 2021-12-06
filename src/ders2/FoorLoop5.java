package ders2;

import java.util.Scanner;

public class FoorLoop5 {

	public static void main(String[] args) {
		//Kullanýcýdan 100 den küçük bir tam sayý isteyin. 1 den baþlayarak
		//girilen sayiya kadar 3 ün veya 5 in katý olan sayilarý yazdýrýn
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen 100 den küçük bir sayi giriniz.");

		int sayi=scan.nextInt();
		
		for (int i = 1; i < sayi; i++) {
			if (i%3==0 || i%5==0) {
				
				System.out.print(i + " ");
				
			}
			
			
			
			
		}
	}

}
