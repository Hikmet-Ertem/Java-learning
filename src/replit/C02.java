package replit;

import java.util.Scanner;

public class C02 {

	public static void main(String[] args) {
		/*
		 * Kullan�c�dan bir isim girmesini isteyin ve son 2 harfinin 3 kopyas�ndan
		 * olu�an yeni bir String yazd�r�n
		 * 
		 * Kullanicidan alinan isim uzunlu�u en az 2 olacakt�r.
		 * 
		 * INPUT : Mustafa
		 * 
		 * OUTPUT : fafafa
		 */

		Scanner scan = new Scanner(System.in);
		String isim, soyisim;
		System.out.println("isim  giriniz:");
		isim = scan.next();
		

		System.out.println("�smin ba�harfi:" + isim.charAt(0));
		
	}

}
