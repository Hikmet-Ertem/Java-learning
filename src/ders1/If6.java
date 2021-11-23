package ders1;

import java.util.Scanner;

public class If6 {

	public static void main(String[] args) {
		// Soru 5) Kullanicidan bir gun alin eger gun “Cuma” ise ekrana “Muslumanlar icin kutsal
		//		   gun” yazdirin. “Cumartesi” ise ekrana “Yahudiler icin kutsal gun” yazdirin. “Pazar”
		//		   ise ekrana “Hiristiyanlar icin kutsal gun” yazdirin
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lütfen bir gün ismi giriniz");
		
		String gun=scan.next().toLowerCase();
		
		if (gun.equals("cuma")) {
			System.out.println("Muslumanlar icin kutsal gun");
		}

		if (gun.equals("cumartesi")) {
			System.out.println("Yahudiler icin kutsal gun");
		}
		if (gun.equals("pazar")) {
			System.out.println("Hiristiyanlar icin kutsal gun");
		}
	}

}
