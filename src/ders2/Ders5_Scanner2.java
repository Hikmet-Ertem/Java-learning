package ders2;

import java.util.Scanner;

public class Ders5_Scanner2 {

	public static void main(String[] args) {
		// 4 - ) Kullanici tarafindan girilen bir sayinin mutlak degerini
		//	   yazdirmak icin bir program yazin.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen bir sayi giriniz");
		
		int sayi=scan.nextInt();
		
		if (sayi<0) {
			System.out.println("|" +sayi+"|= " +(sayi*(-1)));
		}else {
			
			System.out.println("|" +sayi+"|= " +sayi);
		}
		

	}

}
