package GenelTekrar;

import java.util.Scanner;

public class C04 {

	public static void main(String[] args) {
		/*
		 * Kullanýcýdan dakika girmesini isteyin, Dakikalarý birkaç yýl ve gün sayýsýna
		 * dönüþtürmek için bir Java programý yazýn.
		 * 
		 * INPUT:
		 * 
		 * Dakika sayýsý: 3456789
		 * 
		 * OUTPUT :
		 * 
		 * 3456789 dakika yaklaþýk 6 yýl 210 gündür
		 */
	
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen dakika giriniz: ");
		
		int dakika=scan.nextInt();
		
		int ylDkSrs=365*24*60;
		
		int gunDk=24*60;
		
				
		int yil=dakika/ylDkSrs;
		
		int gun=(dakika - yil*ylDkSrs)/gunDk;
		
		System.out.println(dakika +" dakika yaklasik " + yil + " yil " + gun +" gundur");
	
	
	
	}

}
