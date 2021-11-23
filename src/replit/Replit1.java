package replit;

import java.util.Scanner;

public class Replit1 {

	public static void main(String[] args) {
		/*int veri türünün Maximum ve Minimum değerlerini gösteren kodu konsola yazınız.
*/
	
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen günde ne kadar çay içtiğinizi ve ne kadar şeker kullandığınız giriniz: ");
		
		double cay=scan.nextDouble();
		double seker=scan.nextDouble();
		
		System.out.println("Yilda " +cay *seker*1.7*365/1000 + " kg seker kullaniyor");
		
		
	
	scan.close();
	
	}

}
