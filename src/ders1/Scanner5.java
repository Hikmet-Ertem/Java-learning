package ders1;

import java.util.Scanner;

public class Scanner5 {

	public static void main(String[] args) {
		// Soru 5) Kullanicidan ismini ve soyismini isteyip asagidaki sekilde yazdirin

		//Isminiz : Mehmet
		//Soyisminiz : Bulut
		//Kursumuza katiliminiz alinmistir,tesekkur ederiz
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("L�tfen isminizi ve soy isminizi giriniz");
		
		String isim= scan.next();
		String soy�sim= scan.next();
		
		System.out.println("�sminiz : " +isim);
				
		System.out.println("Soyisim : " +soy�sim  );
	
		System.out.println("Kursumuza katiliminiz alinmistir,tesekkur ederiz");	
	
	}

}
