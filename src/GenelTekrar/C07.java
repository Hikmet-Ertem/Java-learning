package GenelTekrar;

import java.util.Scanner;

public class C07 {

	public static void main(String[] args) {
		/*
		 * Verilen iki sayýnýn (sýfýrdan büyük veya sýfýra eþit) toplamýný hesaplayan ve
		 * yazdýran bir Java programý yazýn. Verilen tamsayýlar veya toplam 10'dan fazla
		 * basamakli olursa, "OverFlow" yazdýrýn.
		 * 
		 * Ornek:
		 * 
		 * INPUT :
		 * 
		 * 25
		 * 
		 * 46
		 * 
		 * OUTPUT :
		 * 
		 * Numaralarin Toplami:
		 * 
		 * 71
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen sýfýrdan büyük iki sayi giriniz.");
		
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		int toplam=sayi1 +sayi2;
		String toplam1=Integer.toString(toplam);
		System.out.println(toplam1);
		
		if (toplam1.length()>=10 ) {
			System.out.println("OverFlow");
		} else {
			System.out.println("Numaralarýn Toplamý: "+ (sayi1+sayi2));
		}
		
		
		
	}

}
