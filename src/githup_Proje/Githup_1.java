package githup_Proje;

import java.util.Scanner;

public class Githup_1 {

	public static void main(String[] args) {
		/*
		 * Scanner class arac�l���yla girilen herhangi bir say�n�n fakt�riyel de�erini
		 * bulmak i�in bir program yaz�n.
		 * 
		 * number:6 factorial:1*2*3*4*5*6=720 output ---> 720
		 */

		Scanner reader = new Scanner(System.in);
		System.out.print("Bir Say� Girin:");

		int num = reader.nextInt();
		long faktoriyel = 1;
		for (int i = 1; i <= num; ++i) {
			faktoriyel *= i;
		}
		System.out.printf("%d Say�s�n�n Fakt�riyeli = %d \n", num, faktoriyel);

		/*
		 * Scanner scan=new Scanner(System.in);
		 * System.out.println("L�tfen bir sayi giriniz");
		 * 
		 * int sayi=scan.nextInt();
		 * 
		 * if (sayi<0) { System.out.println("|" +sayi+"|= " +(sayi*(-1))); }else {
		 * 
		 * System.out.println("|" +sayi+"|= " +sayi); }
		 */
	}

}
