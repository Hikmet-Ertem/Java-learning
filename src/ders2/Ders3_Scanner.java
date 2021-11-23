package ders2;

import java.util.Scanner;

public class Ders3_Scanner {

	public static void main(String[] args) {
		// Kullanicidan yaricap isteyip cemberin cevresini ve dairenin alanini hesaplayip yazdirin
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen cemberin yaricapini giriniz");
		
		double yaricap=scan.nextDouble();
		
		double cevre= 2*3.14 * yaricap;
		double alan= 3.14 * yaricap *yaricap ;
		
		System.out.println("Cemberin Cevresi: " + cevre);
		System.out.println("Dairenin Alani: " + alan);

	}

}
