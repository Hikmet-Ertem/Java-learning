package day07;

import java.util.Scanner;

public class C02_BasitCumleler {

	public static void main(String[] args) {
		
		// Soru 1) Kullanicidan bir tamsayi isteyin ve sayinin tek veya cift oldugunu yazdirin
	
				Scanner scan = new Scanner(System.in);
				
				System.out.println("Lutfen bir tamsayi giriniz");
				double sayi0 = scan.nextDouble();
				int sayi = (int)sayi0;
				if (sayi%2==0) {
					System.out.println("Girdiginiz sayi cift bir sayi");
				}
				
				if (sayi%2!=0) {
					System.out.println("Girdiginiz sayi tek bir sayi");
				}
				
				scan.close();
			}
		
	}


