package ders2;

import java.util.Scanner;

public class FoorLoop7 {

	public static void main(String[] args) {
		//Kullan�cadan bir String isteyin ve Stringi tersten yazd�r�n
		//bir program yaz�n
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen tersten yazd�rmak i�in bir yaz� giriniz.");
		String str=scan.nextLine();
		
		for (int i = str.length()-1; i >=0; i--) {
			
			System.out.print(str.substring(i, i+1));
			
		}
		
		

	}

}
