package GenelTekrar;

import java.util.Scanner;

public class Faktoriyel {

	public static void main(String[] args) {
		/*
		 * Girdi olarak bir tamsay� kabul eden ve fakt�riyel hesaplayan programi
		 * yaz�niz.
		 * 
		 * Input : 6
		 * 
		 * Output: 6!=65432*1=720
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir tam say� giriniz");
		
		int sayi=scan.nextInt();
		
		int faktoriyel=1;
		System.out.print(sayi+ "!=");
		
		for (int i =sayi; i > 1; i--) {
			
			faktoriyel*=i;
			
			System.out.print(i + "");
					
		}
		
		System.out.print("*1="+ faktoriyel );
	}

}
