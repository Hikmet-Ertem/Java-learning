package day31_dateAndTime;

import java.time.LocalTime;
import java.time.ZoneId;

public class C02_LocalTime {

	public static void main(String[] args) {


		LocalTime saat=LocalTime.now();
		
		System.out.println("Balangic saati:" +saat);
		
		int sayi=10;
		
		for (int i = 0; i < 10000; i++) {
			sayi++;
			
			
		}
		LocalTime saatBitisi=LocalTime.now();
		System.out.println("Bitis saati:" +saatBitisi);
		
		//E�er bir i�lemin ba�lang�� ve biti� saatlerini kaydetmek istiyorsak
		//hem bas�nda hem de sonunda LocalTime objesini olu�turmal�y�z.
		
		
		
		double nano1=saat.getNano();
		double nanobitis=saatBitisi.getNano();
		
		System.out.println("For loop "+ (nanobitis-nano1 + " nano saniye"));
		
		System.out.println(saat.getMinute());
		System.out.println(saat.plusMinutes(10000));
		
		System.out.println(saat.minusHours(20));
		
		LocalTime yerelSaat=LocalTime.now(ZoneId.of("Turkey"));
		System.out.println(yerelSaat);
		
		
	}

}
