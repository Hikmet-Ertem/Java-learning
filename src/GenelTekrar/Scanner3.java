package GenelTekrar;

import java.util.Scanner;

public class Scanner3 {

	public static void main(String[] args) {
		// Kullanicidan alacaginiz vize1 vize2 ve final notlarini
		 //vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen vize1, vize2 ve final notlarını giriniz: ");
		
		double vize1=scan.nextDouble();
		double vize2=scan.nextDouble();
		double fnl=scan.nextDouble();
		
		double gecmeNotu=(vize1+vize2)/2*30/100 + fnl*70/100;
		
		System.out.println(gecmeNotu);
		

	}

}
