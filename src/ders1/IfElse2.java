package ders1;

import java.util.Scanner;

public class IfElse2 {

	public static void main(String[] args) {
		// Soru 2) Kullanicidan bir karakter girmesini isteyin ve girilen karakterin harf olup

		//olmadigini yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen bir karakter giriniz");
		
		char karakter=scan.next().charAt(0);
		
		if ('a'<=karakter && 'z'>=karakter || 'A'<=karakter && 'Z'>=karakter) {
			System.out.println("Karakter harftir");
		} else {
			System.out.println("Karakter harf deðildir");
		}
		

	}

}
