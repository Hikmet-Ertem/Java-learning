package GenelTekrar;

import java.util.Scanner;

public class ForWhile2 {

	public static void main(String[] args) {
		/*
		 * Kullanýcýdan 2 tamsayý girmesini ve ardýndan GCD (En Büyük Ortak Bölen) ve
		 * LCM'yi (En Küçük Ortak Kat) bulmasýný isteyin.
		 * 
		 * Input :
		 * 
		 * 30
		 * 
		 * 40
		 * 
		 * Beklenen Cikti: Beklenen Cikti: 30 ve 40 icin GCD = 10
		 * 
		 * 30 ve 40 icin LCM = 120
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen 2 tam sayi giriniz: ");
		
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		
		int buyuk =0;
		int kucuk=0;
		int gdc=1;
		int lcm=1;
		
		if (sayi1> sayi2 ) {
			buyuk=sayi1;
			kucuk=sayi2;
			
		} else if(sayi2>sayi1) {
			
			buyuk=sayi2;
			kucuk=sayi1;
			

		}else {
			buyuk=sayi1;
			kucuk=sayi1;
			
			
		}
		for (int i =1; i <=kucuk; i++) {
			if (buyuk%i==0 && kucuk%i==0) {
				gdc*=i;
				kucuk=kucuk/i;
				buyuk=buyuk/i;
				
			}
			
		}
		
		lcm=kucuk*buyuk*gdc;
		System.out.println("GDC : " + gdc +"\nLCM : " + lcm);
	}

}
