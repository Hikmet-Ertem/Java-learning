package ders1;

import java.util.Scanner;

public class Scanner8 {

	public static void main(String[] args) {
		 /*
   	 * kullanicinin ad soyad yas boy kilosunu  yazdiriniz
   	 */

		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen ad�n�z� giriniz: ");
		
		String ad=scan.next();
		System.out.println("L�tfen soyad�n�z� giriniz: ");
		String soyAd=scan.next();
		
			
		System.out.println("L�tfen ya��n�z� giriniz");
		int yas=scan.nextInt();
		
		
		System.out.println("L�tfen boyunuzu olarak giriniz");
		
		double boy=scan.nextDouble();
		
		System.out.println("Ad�n�z: " + ad);
		System.out.println("Soyad�n�z: " + soyAd);
		
		System.out.println("Ya��n�z: " +yas);
		System.out.println("Boyunuz: " +boy);
		
		
	}

}
