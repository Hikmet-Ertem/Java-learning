package ders2;

import java.util.Scanner;

public class FoorLoop4 {

	public static void main(String[] args) {
		//kullanýcýdan 100 den küçük bir sayi isteyin.
		// 1 den baþlayarak girilen sayiya kadar 3 ün kati  olan sayilari yazdýrýn
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen 100'den küçük bir sayi giriniz");
		
		int sayi=scan.nextInt();
	
		for (int i = 1; i <=sayi; i++) {
			
			if (i%3==0) {
				System.out.print(i + " ");
			} 

			}
		
	
		}
		

}
