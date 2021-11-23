package Alistirmalar;

import java.util.Scanner;

public class A02_Deneme {

	public static void main(String[] args) {


		Scanner scan= new Scanner(System.in);
		

		System.out.println("Notunuzu giriniz: ");
		
		int note = scan.nextInt();
		
		if (note > 70) {
			System.out.println("Dersten geçtiniz...");
			
		}
		else {
			
			System.out.println("Dersten kaldýnýz...");
		}
		

	}

}
