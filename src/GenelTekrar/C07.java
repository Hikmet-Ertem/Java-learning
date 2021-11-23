package GenelTekrar;

import java.util.Scanner;

public class C07 {

	public static void main(String[] args) {
		/*
		 * Verilen iki say�n�n (s�f�rdan b�y�k veya s�f�ra e�it) toplam�n� hesaplayan ve
		 * yazd�ran bir Java program� yaz�n. Verilen tamsay�lar veya toplam 10'dan fazla
		 * basamakli olursa, "OverFlow" yazd�r�n.
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
		System.out.println("L�tfen s�f�rdan b�y�k iki sayi giriniz.");
		
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		int toplam=sayi1 +sayi2;
		String toplam1=Integer.toString(toplam);
		System.out.println(toplam1);
		
		if (toplam1.length()>=10 ) {
			System.out.println("OverFlow");
		} else {
			System.out.println("Numaralar�n Toplam�: "+ (sayi1+sayi2));
		}
		
		
		
	}

}
