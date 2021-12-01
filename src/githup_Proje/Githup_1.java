package githup_Proje;

import java.util.Scanner;

public class Githup_1 {

	public static void main(String[] args) {
		/*
		 * Scanner class aracýlýðýyla girilen herhangi bir sayýnýn faktöriyel deðerini
		 * bulmak için bir program yazýn.
		 * 
		 * number:6 factorial:1*2*3*4*5*6=720 output ---> 720
		 */

		Scanner reader = new Scanner(System.in);
		System.out.print("Bir Sayý Girin:");

		int num = reader.nextInt();
		long faktoriyel = 1;
		for (int i = 1; i <= num; ++i) {
			faktoriyel *= i;
		}
		System.out.printf("%d Sayýsýnýn Faktöriyeli = %d \n", num, faktoriyel);

		/*
		 * Scanner scan=new Scanner(System.in);
		 * System.out.println("Lütfen bir sayi giriniz");
		 * 
		 * int sayi=scan.nextInt();
		 * 
		 * if (sayi<0) { System.out.println("|" +sayi+"|= " +(sayi*(-1))); }else {
		 * 
		 * System.out.println("|" +sayi+"|= " +sayi); }
		 */
	}

}
