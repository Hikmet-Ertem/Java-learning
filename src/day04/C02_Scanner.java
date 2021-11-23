package day04;

import java.util.Scanner;

public class C02_Scanner {

	public static void main(String[] args) {
		
		// Soru 7 kullaniciden ismini alip isminin bas harfini yazdirin
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen isiminizi yaziniz");
		
		char ilkHarf=scan.next().charAt(0);
		
		// isminizin ilk harfi : M
		
		System.out.println(" isminizin ilk harfi : " + ilkHarf);
		
		
		
		
		
		

	}

}
