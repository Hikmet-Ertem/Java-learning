package ders1;

import java.util.Scanner;

public class IfElse6 {

	public static void main(String[] args) {
		// Soru 6) Kullanicidan iki sayi isteyin, sayilarin ikisi de pozitif ise sayilarin toplamini yazdirin,

		//sayilarin ikisi de negative ise sayilarin carpimini yazdirin, sayilarin ikisi farkli
		//isaretlere sahipse “farkli isaretlerde sayilarla islem yapamazsin” yazdirin,
		//sayilardan sifira esit olan varsa “sifir carpmaya gore yutan elemandir” yazdirin.
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lütfen iki sayi \nilk sayidan sonra diger sayi için enter'e basiniz");
		
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		
		if (sayi1>0  && sayi2<0) {
			System.out.println("Sayilarin toplami: "  + (sayi1 + sayi2));
		} else if (sayi1<0 && sayi2<0) {
			System.out.println("Sayilarin carpimi: " + sayi1*sayi2);
			
		}else if(sayi1 * sayi2>0){
			
			System.out.println("farkli isaretlerde sayilarla islem yapamazsin: " + sayi1*sayi2);
				
		}else {
		         System.out.println("sifir carpmaya gore yutan elemandir");
		         
		         
	        
		          
		}

	}

	}