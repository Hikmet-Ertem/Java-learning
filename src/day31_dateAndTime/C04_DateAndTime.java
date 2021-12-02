package day31_dateAndTime;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class C04_DateAndTime {

	public static void main(String[] args) {
		// Bir string ve bir int variable oluþturalým
		// bir loop içerisinde bu variablelari 1000 kere deðiþtirelim.
		// ve iþlem sürelerini kýyalayalým.
		
			LocalTime saat = LocalTime.now();
				System.out.println("baslangic saati : " + saat); // 23:04:21.305897100
				int sayi = 10;
				for (int i = 0; i < 10000; i++) {
					sayi++;
				}
		LocalTime saatBitis = LocalTime.now();
				System.out.println("bitis saati : " + saatBitis);
				
				double nano1= saat.getNano(); 
				double nanoBitis = saatBitis.getNano();
				
				System.out.println("For Loop " + (nanoBitis-nano1) + " nano saniyede tamamlandi");
				
				
				
				LocalTime saatS = LocalTime.now();
				System.out.println("\nbaslangic saati : " + saat); // 23:04:21.305897100
			String str = "Celil";
				for (int i = 0; i < 10000; i++) {
					str += " ";
				}
				LocalTime saatBitisS = LocalTime.now();
				System.out.println("bitis saati : " + saatBitis);
				
				double nano1S= saat.getNano(); 
				double nanoBitisS = saatBitis.getNano();
				
				System.out.println("For Loop " + (nanoBitisS-nano1S) + " nano saniyede tamamlandi");
		
		
		}

}
