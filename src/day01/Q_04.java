package day01;

import java.util.Scanner;

public class Q_04 {

	public static void main(String[] args) {
		
		// kullanýcýdan 2 tam sayýyý alýp bu 2 tam sayýnýn dört iþlem sonucunu yazdýr.
		
		Scanner scan=new Scanner(System.in);
        System.out.print("1. sayiyi giriniz :");
        
        int sayi1=scan.nextInt();
        
        System.out.print("2. sayiyi giriniz :");
        
        int sayi2=scan.nextInt();
        
        System.out.println("girilen sayilarin toplami:"+(sayi1+sayi2));
        System.out.println("girilen sayilarin farki:"+(sayi1-sayi2));
        System.out.println("girilen sayilarin carpimi:"+(sayi1*sayi2));
        System.out.println("girilen sayilarin bolumu:"+(sayi1/sayi2));
        
        


		
		
		
	}

}
