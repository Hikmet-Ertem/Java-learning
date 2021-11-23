package ders1;

import java.util.Scanner;

public class IfElseEf2 {

	public static void main(String[] args) {
		// Soru 8) Kullanicidan maas icin bir teklif isteyin ve asagidaki degerlere gore cevap azdirin.
		//Teklif 80.000'in uzerinde ise “Kabul ediyorum” ,
		//60 – 80.000 arasinda ise “Konusabiliriz”,
		//60.000’nin altinda ise “Maalesef Kabul edemem” yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Maaş teklifi:...");
		
		double maasTeklifi=scan.nextDouble();
		
		if (maasTeklifi==80.000) {
			System.out.println("Kabul ediyorum");
		} else if (maasTeklifi>=60.000 && maasTeklifi<80.000 ){
			System.out.println("Konusabiliriz");
		}else {
		System.out.println("Maalesef Kabul edemem");

	}
	}
}
