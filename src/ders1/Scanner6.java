package ders1;

import java.util.Scanner;

public class Scanner6 {

	public static void main(String[] args) {
		// Soru 6) Kullanicidan ismini ve soyismini alip aralarinda bir bosluk olusturarak asagidaki

		//sekilde yazdirin

		//Isim � soyisim : Mehmet Bulutluoz
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("L�tfen isminizi ve soyisminiz giriniz");
		
		String isim= scan.next();
		String soyisim= scan.next();
		
		System.out.println("�sim - soyisim: "  +isim + " "+ soyisim );
		
		
		

	}

}
