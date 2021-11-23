package ders1;

import java.util.Scanner;

public class If2 {

	public static void main(String[] args) {
		/*
         * Soru 2) Kullanicidan gun isimlerinden birinin ilk harfini isteyin 
         * ve o harfle baslayan gun isimlerini yazdirin 
            Ornek:  ilkHarf=P output = “Pazar, Pazartesi veya Persembe”             
            ilkHarf=S output = “Sali”
         *** Buyuk kucuk harf problem olmamasi icin toUpperCase methodunu kullanin
         */
        
		Scanner scan= new Scanner(System.in);
		System.out.println("Lütfen gun isimlerinden birinin ilk harfini yaziniz");
		
		char ilkHarf=scan.next().toUpperCase().charAt(0);
		
		if (ilkHarf=='P') {
			System.out.println("Pazartesi, Persembe veya Pazar");
		}
	
		if (ilkHarf=='S') {
			System.out.println("Sali");
		}
		if (ilkHarf=='C') {
			System.out.println("Carsamba, Cuma veya Cumaresi");
			
			
		}
	}

}
