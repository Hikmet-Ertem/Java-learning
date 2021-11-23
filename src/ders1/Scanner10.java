package ders1;

import java.util.Scanner;

public class Scanner10 {

	public static void main(String[] args) {
		 /*  Problem Tanýmý
        Bir dik üçgenin iki dik kenarýný alarak hipotenüsünü hesaplayan kod yazýnýz.
        Örnek Ekran Çýktýsý
        birinci kenar: 12
        ikinci kenar: 5
        hipotenus: 13      */

		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen dik üçgenin iki kenarýný giriniz");
		
		int kenar1=scan.nextInt();
		int kenar2=scan.nextInt();
		
		System.out.println("Birinci kenar :" + kenar1);
		System.out.println("Ýkinci kenar : "+ kenar2);
		System.out.println("hopotenus :" + ((kenar1 *kenar1) + (kenar2*kenar2)));
		
		
		
	}

}
