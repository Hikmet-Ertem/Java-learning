package replit;

import java.util.Scanner;

public class C01 {

	public static void main(String[] args) {
		/*
		 * Kullan�c�ya Ad�, Soyad� ve kredi kart� numaralar�n� sorarak verilen formata
		 * ceviren java kodunu yaziniz.
		 * 
		 * Input :
		 * 
		 * John White
		 * 
		 * 1234234534561478
		 * 
		 * Output : Name :
		 * 
		 * J* W**
		 * 
		 * CCN : ** ** **** 1478
		 * 
		 * Ilk Harfler Buyuk harf ile baslamalidir.
		 */
		
		Scanner scan=new Scanner(System.in);
		
				
		System.out.println("L�tfen ad�n�z� giriniz: ");
		String ad=scan.next();
		System.out.println("L�tfen soyad�n�z� giriniz: ");
		String soyad=scan.next();
		
		System.out.println("L�tfen kredi kart� numar�n�z� giriniz: ");
		
		String no=scan.next();
		
		System.out.println(ad.toUpperCase().charAt(0) + ad.substring(1,2).replaceAll("\\w", "*") +" " + 
						soyad.toUpperCase().charAt(0) + soyad.substring(1,3).replaceAll("\\w", "*")  );
		
		System.out.println("** ** **** " +no.substring(no.length()-4));
		
		scan.close();
	}

}
