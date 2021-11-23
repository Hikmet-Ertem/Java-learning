package ders1;

import java.util.Scanner;

public class If5 {

	public static void main(String[] args) {
		// Soru 4) Kullanicidan dikdortgenin kenar uzunluklarini isteyin 
        //         ve dikdortgenin kare olup olmadigini yazdirin
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Lutfen dikdorgenin bir kenar uzunlugunu girin");
        
        double kenar1= scan.nextDouble();
       


        double kenar2= scan.nextDouble();
        
        if (kenar1==kenar2) {
        	System.out.println("girilen dikdorgen kare");
		}
        
        if (kenar1!=kenar2) {
        	System.out.println("girilen dikdorgen kare deðil");
		}
        
        scan.close();
	}

}
