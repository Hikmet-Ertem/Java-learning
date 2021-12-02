package GenelTekrar;

import java.util.Scanner;

public class ForWhile6 {

	public static void main(String[] args) {
		//Konsolda Alfabeyi Yazdýran programi yaziniz.

		//OUTPUT :

		//a b c .. .. .. .. y z
		
		
		
		
		for (int i = 1; i < 300; i++) {
			char karakter=(char) i;
			
			if (karakter>='a'  && karakter<='z') {
				
				System.out.print(karakter + " ");
			}
			
		}


	}

}
