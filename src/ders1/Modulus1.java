package ders1;

import java.util.Scanner;

public class Modulus1 {

	public static void main(String[] args) {
		// 4 basamaklı bir sayının rakamlar toplamını bulunuz.
		
		Scanner scan=  new Scanner(System.in);
		System.out.println("Lütfen4 basamaklı bir sayı giriniz :");
		int sayi=scan.nextInt();
		
		int rakamlarToplamı=0;
		int rakam=sayi%10;
		rakamlarToplamı+=rakam;
		sayi/=10;
		
		 rakam=sayi%10;
		 rakamlarToplamı+=rakam;
		 sayi/=10;
		 
		 rakam=sayi%10;
		 rakamlarToplamı+=rakam;
		 sayi/=10;
				
		  rakam=sayi%10;
		 rakamlarToplamı+=rakam;
		 sayi/=10;
		
		
		System.out.println("Girdiğiniz sayının rakamlar toplamı: " + rakamlarToplamı);
		
		
		
				
		

	}

}
