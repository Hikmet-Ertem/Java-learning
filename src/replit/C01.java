package replit;

import java.util.Scanner;

public class C01 {

	public static void main(String[] args) {
		/*
		 * Kullanýcýya Adý, Soyadý ve kredi kartý numaralarýný sorarak verilen formata
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
		
				
		System.out.println("Lütfen adýnýzý giriniz: ");
		String ad=scan.next();
		System.out.println("Lütfen soyadýnýzý giriniz: ");
		String soyad=scan.next();
		
		System.out.println("Lütfen kredi kartý numarýnýzý giriniz: ");
		
		String no=scan.next();
		
		System.out.println(ad.toUpperCase().charAt(0) + ad.substring(1,2).replaceAll("\\w", "*") +" " + 
						soyad.toUpperCase().charAt(0) + soyad.substring(1,3).replaceAll("\\w", "*")  );
		
		System.out.println("** ** **** " +no.substring(no.length()-4));
		
		scan.close();
	}

}
