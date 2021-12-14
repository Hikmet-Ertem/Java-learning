package GenelTekrar;

import java.util.Scanner;

public class List3 {

	public static void main(String[] args) {
		/*
		 * Get a sentence from the user. Accept the sentence received from the user as a
		 * parameter, Invert sentence using Array and write a Method that returns the
		 * result as a String to the main method.
		 * 
		 * Note: Upper and lower case letters, spaces and special characters will not be
		 * changed.
		 * 
		 * Input :
		 * 
		 * It is very nice to write code.
		 * 
		 * Output :
		 * 
		 * .edoc etirw ot ecin yrev si tI
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen bir cümle giriniz");
		String str=scan.nextLine();
		String arr[]=str.split("");
				
			String kova="";	
		for (int i =arr.length-1; i >=0; i--) {
			kova+=arr[i];
			
			
			
		}
		System.out.print(kova);
	}

}
