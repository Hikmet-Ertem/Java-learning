package ders1;

import java.util.Scanner;

public class IfElse4 {

	public static void main(String[] args) {
		// Soru 4) Kullanicidan bir ucgenin uc kenar uzunlugunu alin eger uc kenar uzunlugu
		//birbirine esit ise ekrana �Eskenar ucgen� yazdirin. Diger durumlarda ekrana
		//�Eskenar degil� yazdirin.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen ucgenin uc kenar uzunlugunu giriniz");
		
		int kenar1=scan.nextInt();
		int kenar2=scan.nextInt();
		int kenar3=scan.nextInt();
		
		if (kenar1==kenar2 && kenar2==kenar3) {
			System.out.println("E�kenar ��gen");
		} else {
			System.out.println("E�kenar ��gen de�il");
		}

		

	}

}
