package ders2;

import java.util.Scanner;

public class Ders4_Scanner {

	public static void main(String[] args) {
		// 2 - ) Kullanicidan boyunu cm olarak, kilosunu kilogram olarak alin ve vucut kutle     
        //	 	endeksini bulun. Sonucu tamsayi ve ondalikli sayi olarak yazdirin
        //		VKE= kilo/(boy*boy)             Kilo : kilogram , Boy : metre olmalidir
        //		
		//		Ornek Ekran Ciktisi:
		//		Input : boy :180 kilo : 80
		//		Output : Vucut kutle endeksiniz : 24
		//		Vucut kutle endeksiniz : 24.691...
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lütfen boyunuzu cm olarak olarak giriniz.");
		
		double boy=scan.nextDouble();
		boy=boy/100;
		
		System.out.println("Lütfen kilonuzu giriniz");
		double kilo=scan.nextDouble();
		
		int VKI=(int) (kilo/(boy*boy));
		
		System.out.println("vucut kutle endeksi:" + VKI);
		System.out.println("vucut kutle endeksiniz:" + (kilo/(boy*boy)));
		
		

	}

}
