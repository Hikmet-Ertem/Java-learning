package ders1;

import java.util.Scanner;

public class Scanner5 {

	public static void main(String[] args) {
		// Soru 5) Kullanicidan ismini ve soyismini isteyip asagidaki sekilde yazdirin

		//Isminiz : Mehmet
		//Soyisminiz : Bulut
		//Kursumuza katiliminiz alinmistir,tesekkur ederiz
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Lütfen isminizi ve soy isminizi giriniz");
		
		String isim= scan.next();
		String soyÝsim= scan.next();
		
		System.out.println("Ýsminiz : " +isim);
				
		System.out.println("Soyisim : " +soyÝsim  );
	
		System.out.println("Kursumuza katiliminiz alinmistir,tesekkur ederiz");	
	
	}

}
