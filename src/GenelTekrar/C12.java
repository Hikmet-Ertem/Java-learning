package GenelTekrar;

import java.util.Scanner;

import javax.swing.Spring;

public class C12 {

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
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen bir isim giriniz: ");
		
		String isim=scan.next();
		
		if (isim.length()>=2 ) {
			System.out.println(isim.substring(isim.length()-2, isim.length()) +isim.substring(isim.length()-2, isim.length())+ isim.substring(isim.length()-2, isim.length()));
		} else {
			
			System.out.println("Uzun isim giriniz");

		}
			
			
		}
		
		
	}


