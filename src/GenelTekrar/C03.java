package GenelTekrar;

import java.util.Scanner;

public class C03 {

	public static void main(String[] args) {
		//Girilen zaman� saniyeye �eviren bir program yaz�n�z.

		//�rnek ��kt�:

		//1 saat 10 dakika 50 saniye ==>

		//4250 saniye
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("L�tfen saat giriniz: ");
		
		int saat=scan.nextInt();
		System.out.println("L�tfen dakika  giriniz: ");
		int dakika=scan.nextInt();
		System.out.println("L�tfen saniye  giriniz: ");
		int saniye=scan.nextInt();
		
		int toplam=(saat * 3600 ) + (dakika * 60) + (saniye);
		
		System.out.println(saat + " saat " + dakika + " dakika " + saniye + " saniye ==>") ;
		System.out.println(toplam +" saniye ");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*Scanner girdi=new Scanner(System.in);
		System.out.println("Ka� saniye �zerinden i�lem yapal�m?");
		
		int saniye = girdi.nextInt(); 
		int dakika = saniye*60;
		int saat = dakika*60;
		 
		dakika=dakika%60;
		saniye=saniye%60;
		 
		*/
		
		
	}

}
