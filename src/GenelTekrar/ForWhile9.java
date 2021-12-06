package GenelTekrar;

import java.util.Scanner;

public class ForWhile9 {

	public static void main(String[] args) {
		/*
		 * Kullanýcýnýn girdiði sayýyý tersine çeviren bir java programý yazýnýz.
		 * (Mulakat Sorusu)
		 * 
		 * Input :1238
		 * 
		 * Output :Girilen Numananin Tersi: 8321
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir sayi giriniz");
		
		String str=scan.nextLine();

			
		StringBuilder sb=new StringBuilder(str);
		System.out.println(sb.reverse());
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * int sayi=scan.nextInt();
		 * 
		 * String str=String.valueOf(sayi);
		 * 
		 * for (int i = str.length()-1 ; i >= 0; i--) {
		 * 
		 * System.out.print(str.substring(i, i+1));
		 * 
		 * }
		 */

	}

}
