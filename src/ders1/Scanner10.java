package ders1;

import java.util.Scanner;

public class Scanner10 {

	public static void main(String[] args) {
		 /*  Problem Tan�m�
        Bir dik ��genin iki dik kenar�n� alarak hipoten�s�n� hesaplayan kod yaz�n�z.
        �rnek Ekran ��kt�s�
        birinci kenar: 12
        ikinci kenar: 5
        hipotenus: 13      */

		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen dik ��genin iki kenar�n� giriniz");
		
		int kenar1=scan.nextInt();
		int kenar2=scan.nextInt();
		
		System.out.println("Birinci kenar :" + kenar1);
		System.out.println("�kinci kenar : "+ kenar2);
		System.out.println("hopotenus :" + ((kenar1 *kenar1) + (kenar2*kenar2)));
		
		
		
	}

}
