package ders1;

import java.util.Scanner;

public class Modulus1 {

	public static void main(String[] args) {
		// 4 basamakl� bir say�n�n rakamlar toplam�n� bulunuz.
		
		Scanner scan=  new Scanner(System.in);
		System.out.println("L�tfen4 basamakl� bir say� giriniz :");
		int sayi=scan.nextInt();
		
		int rakamlarToplam�=0;
		int rakam=sayi%10;
		rakamlarToplam�+=rakam;
		sayi/=10;
		
		 rakam=sayi%10;
		 rakamlarToplam�+=rakam;
		 sayi/=10;
		 
		 rakam=sayi%10;
		 rakamlarToplam�+=rakam;
		 sayi/=10;
				
		  rakam=sayi%10;
		 rakamlarToplam�+=rakam;
		 sayi/=10;
		
		
		System.out.println("Girdi�iniz say�n�n rakamlar toplam�: " + rakamlarToplam�);
		
		
		
				
		

	}

}
