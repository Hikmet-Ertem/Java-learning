package ders1;

import java.util.Scanner;

public class Modulus1 {

	public static void main(String[] args) {
		// 4 basamaklý bir sayýnýn rakamlar toplamýný bulunuz.
		
		Scanner scan=  new Scanner(System.in);
		System.out.println("Lütfen4 basamaklý bir sayý giriniz :");
		int sayi=scan.nextInt();
		
		int rakamlarToplamý=0;
		int rakam=sayi%10;
		rakamlarToplamý+=rakam;
		sayi/=10;
		
		 rakam=sayi%10;
		 rakamlarToplamý+=rakam;
		 sayi/=10;
		 
		 rakam=sayi%10;
		 rakamlarToplamý+=rakam;
		 sayi/=10;
				
		  rakam=sayi%10;
		 rakamlarToplamý+=rakam;
		 sayi/=10;
		
		
		System.out.println("Girdiðiniz sayýnýn rakamlar toplamý: " + rakamlarToplamý);
		
		
		
				
		

	}

}
