package githup_Proje;

import java.util.Scanner;

public class Githup_2 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		/*
		 * 3 tane pozitif String verildiðinde sayýsal olmayan tüm karakterleri kaldýrýn.
		 * Stringleri int e çevirin ve total print edin
		 * 
		 * Ornek: String num1 = "$15"; String num2 = "$20"; String num3 = "$30"; output
		 * ----> 65; olmali
		 * 
		 * NOT : Eðer output 0 dan küçük ise outputu -1 e cevir
		 */

		Scanner scan=new Scanner(System.in);
		
		System.out.println("üç tane pozitif string sayi giriniz: ");
		
		String num1=scan.nextLine();
		String num2=scan.nextLine();
		String num3=scan.nextLine();
		
		int sayi1=Integer.valueOf(num1.replace("$", ""));
		int sayi2=Integer.valueOf(num2.replace("$", ""));
		int sayi3=Integer.valueOf(num3.replace("$", ""));
		
		
		int toplam=sayi1 + sayi2 + sayi3;
		
		if (toplam>=0) {
			System.out.println("Üç sayinin toplami:" + toplam);
		} else {

			System.out.println(-1);
		}
		
		
		
		
		

	}

}
