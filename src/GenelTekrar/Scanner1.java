package GenelTekrar;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
		// kullanicinin ad soyad yas boy kilosunu  yazdiriniz
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen ad ve soyadınızı giriniz: ");
		String ad=scan.next();
		String soyad=scan.next();
		
		System.out.println("Yaşınızı giriniz");
		int yas=scan.nextInt();
		System.out.println("Boyunuzu giriniz");
		int boy=scan.nextInt();
		System.out.println("Kilonuzu giriniz");
		int kilo=scan.nextInt();
		
		System.out.println("İsminiz: " + ad + "\nSoyadınız: " + soyad + "\nYaşınız: " +yas + "\nBoyunuz: " + boy +  "\nKilonuz: " + kilo );
		

	}

}
