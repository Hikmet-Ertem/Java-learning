package ders1;

import java.util.Scanner;

public class If4 {

	public static void main(String[] args) {
		 /*
         * Soru 3) Kullanicidan gun ismini alin ve 
         * haftaici veya hafta sonu oldugunu yazdirin 
            Ornek:      gun=Pazar output = “Hafta sonu”
                        gun=Sali output = “Hafta ici”
         *** String icin equals method’unu kullanin
         */
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen gün ismini giriniz" );
		
		String gun=scan.next().toLowerCase();
		
		if (gun.equals("pazar")  || gun.equals("cumartesi")) {
			System.out.println("Hafta sonu");
			
			}
		
		if (gun.equals("pazartesi")  || gun.equals("sali") ||  gun.equals("carsamba") || 
				gun.equals("persembe") ||  gun.equals("cuma")) {
			System.out.println("Hafta ici");
		
		
		}
			
		}
		
			
	}

   
