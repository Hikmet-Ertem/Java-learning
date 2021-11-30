package GenelTekrar;

import java.util.Scanner;

import javax.swing.Spring;

public class C12 {

	public static void main(String[] args) {
		/*
		 * Kullanýcýdan bir isim girmesini isteyin ve son 2 harfinin 3 kopyasýndan
		 * oluþan yeni bir String yazdýrýn
		 * 
		 * Kullanicidan alinan isim uzunluðu en az 2 olacaktýr.
		 * 
		 * INPUT : Mustafa
		 * 
		 * OUTPUT : fafafa
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen bir isim giriniz: ");
		
		String isim=scan.next();
		
		if (isim.length()>=2 ) {
			System.out.println(isim.substring(isim.length()-2, isim.length()) +isim.substring(isim.length()-2, isim.length())+ isim.substring(isim.length()-2, isim.length()));
		} else {
			
			System.out.println("Uzun isim giriniz");

		}
			
			
		}
		
		
	}


