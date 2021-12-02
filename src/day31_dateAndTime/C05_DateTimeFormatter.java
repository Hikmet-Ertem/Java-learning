package day31_dateAndTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C05_DateTimeFormatter {

	public static void main(String[] args) {


		LocalDateTime tarihSaat=LocalDateTime.now();
		
		System.out.println(tarihSaat);
		
		DateTimeFormatter duzenle=DateTimeFormatter.ofPattern("dd /MM /YYYY HH : mm");

		System.out.println(duzenle.format(tarihSaat));
		
		
	}

}
