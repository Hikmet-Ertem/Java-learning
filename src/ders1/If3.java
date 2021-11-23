package ders1;

import java.util.Scanner;

public class If3 {

	public static void main(String[] args) {
		//  Soru 1) Kullanicidan bir tamsayi isteyin ve sayinin tek veya cift oldugunu yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Lutfen bir tamsayi giriniz: ");
		
	
		
		int sayi=scan.nextInt();
		
		if (sayi%2==0) {
			System.out.println("Girdiðiniz sayi cift sayidir");
		}

		if (sayi%2==1) {
			System.out.println("Girdiðiniz sayi tek sayidir");
			
		}
	}

}
