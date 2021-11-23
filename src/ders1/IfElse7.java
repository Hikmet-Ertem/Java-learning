package ders1;

import java.util.Scanner;

public class IfElse7 {

	public static void main(String[] args) {
		// Soru 7) Kullanicidan 100 uzerinden notunu isteyin. Not’u harf sistemine cevirip yazdirin.
		//50’den kucukse “D”, 50-60 arasi “C”, 60-80 arasi “B”, 80’nin uzerinde ise “A”
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Lütfen 100 üzerinden notunuzu giriniz:");
		
		double not=scan.nextDouble();
		
		if (not<0 && not>100) {
			System.out.println("lütfen geçerli bir not giriniz");
			
		} else if (not<50) {
			System.out.println("Geçerli notunuz: " + "D");
		} else if (not>50 && not>60) {
			System.out.println("Geçerli notunuz: " + "C");
		
		} else if (not>60 && not>80) {
			System.out.println("Geçerli notunuz: " + "B");
		} else if (not>80) {
			System.out.println("Geçerli notunuz: " + "A");
		} else {
			System.out.println("Lütfen sayi giriniz");
		
	

					}

	}

}
