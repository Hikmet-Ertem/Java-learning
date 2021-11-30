package GenelTekrar;

import java.util.Scanner;

public class FoWhile1 {

	public static void main(String[] args) {
		/*
		 * Kullanýcýdan bir isim ve bir karakter girmesini isteyin, ardýndan döngüleri
		 * kullanarak karakterin isimde kaç kez tekrarlandýðýný kontrol edin.
		 * 
		 * char ch1= 'a' ;
		 * 
		 * String name =“John came late"
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
