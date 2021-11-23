package GenelTekrar;

import java.util.Scanner;

public class Wariable3 {

	public static void main(String[] args) {
		// Kullanıcı tarafından girilen DOUBLE sayıyı tam sayıya çeviren bir program yazınız.
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lütfen karenin bir kenar uzunluğunu giriniz: ");
		double sayi=scan.nextDouble();
		
		
		System.out.println("Karenin alani: "  + sayi*sayi);
		System.out.println("Karenin cevresi: "  + sayi*4);

	}

}
