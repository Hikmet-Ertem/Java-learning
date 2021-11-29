package replit;

import java.util.Scanner;

public class C02 {

	public static void main(String[] args) {
		/*
		 * Kullanýcýdan bir isim girmesini isteyin ve son 2 harfinin 3 kopyasýndan
		 * oluþan yeni bir String yazdýrýn
		 * 
		 * Kullanicidan alinan isim uzunluðu en az 2 olacaktýr.
		 * 
		 * INPUT : Mustafa
		 * 
		 * OUTPUT : fafafa
		 */

		Scanner scan = new Scanner(System.in);
		String isim, soyisim;
		System.out.println("isim  giriniz:");
		isim = scan.next();
		

		System.out.println("Ýsmin baþharfi:" + isim.charAt(0));
		
	}

}
