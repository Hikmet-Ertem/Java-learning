package GenelTekrar;

import java.util.Scanner;

public class FoWhile1 {

	public static void main(String[] args) {
		/*
		 * Kullan�c�dan bir isim ve bir karakter girmesini isteyin, ard�ndan d�ng�leri
		 * kullanarak karakterin isimde ka� kez tekrarland���n� kontrol edin.
		 * 
		 * char ch1= 'a' ;
		 * 
		 * String name =�John came late"
		 * 
		 * Expected Output:
		 * 
		 * 
		 * Number of a = 2
		 */
		
		 Scanner scan = new Scanner(System.in);
         System.out.println("isim giriniz");
     
     String isim=scan.nextLine();
     System.out.println("karakter giriniz");
     char karakter=scan.next().charAt(0);
     int sayac=0;
     
     for (int i = 0; i <isim.length(); i++) {
         
         if (karakter==isim.charAt(i)) {
             sayac++;
             
         }
         
     }System.out.println("number of  " +karakter+" = "+sayac);
     
	}

}
