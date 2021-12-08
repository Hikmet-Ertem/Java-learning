package ders2;

import java.util.Scanner;

public class FoorLoop8 {

	public static void main(String[] args) {
		// Kullanıcadan bir String isteyin ve Stringi terse çeviren bir method yazın

		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen tersinden yazdıracak bir yazı giriniz.");
		
		String str=scan.next();
		
		System.out.println(tersineCevir(str));;
		
			
	}

	public static String tersineCevir(String str) {
		String tersStr="";
		
		for ( int i = str.length()-1; i >0; i--)  {
			
			tersStr+=str;
			
			
			
		}
		
			
			
			
			return tersStr;
		}
		
		
	

	
		
		
	}
	


