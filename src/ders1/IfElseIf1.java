package ders1;

import java.util.Scanner;

public class IfElseIf1 {

	public static void main(String[] args) {
		// Soru 5) Kullanicidan gun ismini yazmasini isteyin. Girilen isim gecerli bir gun ise gun
		//isminin 1.,2. ve 3.harflerini ilk harf buyuk diger ikisi kucuk olarak yazdirin, gun ismi
		//gecerli degilse “Gecerli gun ismi giriniz” yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen bir gün ismi giriniz: ");
		
		String gun=scan.next().toLowerCase();
		
		if (gun.equals("pazartesi") || gun.equals("sali") || gun.equals("carsamba")||gun.equals("persembe")|| gun.equals("cuma")|| gun.equals("cumartesi")|| gun.equals("pazar")) {
			System.out.println("Gün ismi: " + gun.toUpperCase().charAt(0) + gun.charAt(1) + gun.charAt(2));
		} else  {
			System.out.println("Gecerli gun ismi giriniz");
			
		}
		
		
		
		
		
		
		

	}

}
