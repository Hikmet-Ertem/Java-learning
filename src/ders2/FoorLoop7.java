package ders2;

import java.util.Scanner;

public class FoorLoop7 {

	public static void main(String[] args) {
		//Kullanýcadan bir String isteyin ve Stringi tersten yazdýrýn
		//bir program yazýn
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen tersten yazdýrmak için bir yazý giriniz.");
		String str=scan.nextLine();
		
		for (int i = str.length()-1; i >=0; i--) {
			
			System.out.print(str.substring(i, i+1));
			
		}
		
		

	}

}
