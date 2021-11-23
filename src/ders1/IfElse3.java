package ders1;

import java.util.Scanner;

public class IfElse3 {

	public static void main(String[] args) {
		// Soru 3) Kullaniciya yasini sorun, eger yas 65’den kucuk ise “emekli olamazsin,

		//calismalisin”, 65’e esit veya buyukse “Emekli olabilirsin” yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Yaþýnýzý giriniz : ");
		
		int yas=scan.nextInt();
		
		if (yas<65) {
			System.out.println("Emekli olamazsin, Çalýþmalýsýn");
		} else {
			System.out.println("Emekli olabilirsin");
		}

	}

}
