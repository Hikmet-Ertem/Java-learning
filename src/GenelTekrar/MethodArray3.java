package GenelTekrar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MethodArray3 {

	public static void main(String[] args) {
		/*
		 * Write a method which accepts a String as parameter and prints the sum of the
		 * digits, present in the given string.
		 * 
		 * input : ade1r4d3
		 * 
		 * output : 8
		 * 
		 * Hint : Use Character.isDigit() Integer.valueOf()
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen þifrenizi giriniz");

		String sfr = scan.next();
		int toplam=0;
		for (int i = 0; i < sfr.length(); i++) {
			if (Character.isDigit(sfr.substring(i, i+1).charAt(0))) {
				toplam+=Integer.valueOf(sfr.substring(i, i+1));
			}
			
		}
		
		System.out.println(toplam);
		
		/*
		 * List<String> list=new ArrayList<>();
		 * 
		 * for (int i = 0; i < sfr.length(); i++) { list.add(sfr.substring(i, i+1));
		 * 
		 * 
		 * } int toplam=0; for (int i = 0; i <list.size(); i++) { if
		 * (Character.isDigit(list.get(i).charAt(0))) {
		 * 
		 * toplam+=Integer.valueOf(list.get(i));
		 * 
		 * 
		 * }
		 * 
		 * }
		 */
		

	

	}

}
