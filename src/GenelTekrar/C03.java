package GenelTekrar;

import java.util.Scanner;

public class C03 {

	public static void main(String[] args) {
		//Girilen zamanı saniyeye çeviren bir program yazınız.

		//Örnek Çıktı:

		//1 saat 10 dakika 50 saniye ==>

		//4250 saniye
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lütfen saat giriniz: ");
		
		int saat=scan.nextInt();
		System.out.println("Lütfen dakika  giriniz: ");
		int dakika=scan.nextInt();
		System.out.println("Lütfen saniye  giriniz: ");
		int saniye=scan.nextInt();
		
		int toplam=(saat * 3600 ) + (dakika * 60) + (saniye);
		
		System.out.println(saat + " saat " + dakika + " dakika " + saniye + " saniye ==>") ;
		System.out.println(toplam +" saniye ");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*Scanner girdi=new Scanner(System.in);
		System.out.println("Kaç saniye üzerinden işlem yapalım?");
		
		int saniye = girdi.nextInt(); 
		int dakika = saniye*60;
		int saat = dakika*60;
		 
		dakika=dakika%60;
		saniye=saniye%60;
		 
		*/
		
		
	}

}
