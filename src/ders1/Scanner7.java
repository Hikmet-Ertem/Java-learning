package ders1;

import java.util.Scanner;

public class Scanner7 {

	public static void main(String[] args) {
		// Soru 7) Kullanicidan ismini alip isminin bas harfini yazdirin.
		

		Scanner scan= new Scanner(System.in);
		
		System.out.println("Lütfen isminizi giriniz");
		
		String isim= scan.next();
		
		System.out.println(isim.charAt(0) );
		
	
		

	}

}
