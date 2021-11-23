package ders1;

import java.util.Scanner;

public class Scanner8 {

	public static void main(String[] args) {
		 /*
   	 * kullanicinin ad soyad yas boy kilosunu  yazdiriniz
   	 */

		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen adýnýzý giriniz: ");
		
		String ad=scan.next();
		System.out.println("Lütfen soyadýnýzý giriniz: ");
		String soyAd=scan.next();
		
			
		System.out.println("Lütfen yaþýnýzý giriniz");
		int yas=scan.nextInt();
		
		
		System.out.println("Lütfen boyunuzu olarak giriniz");
		
		double boy=scan.nextDouble();
		
		System.out.println("Adýnýz: " + ad);
		System.out.println("Soyadýnýz: " + soyAd);
		
		System.out.println("Yaþýnýz: " +yas);
		System.out.println("Boyunuz: " +boy);
		
		
	}

}
