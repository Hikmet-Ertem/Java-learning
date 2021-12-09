package GenelTekrar;

import java.util.Arrays;
import java.util.Scanner;

public class MethodArrays4 {

	public static void main(String[] args) {
		/*
		 * Create a custom return type method accepts a name as parameter and prints the
		 * name as a char array.
		 * 
		 * (do not use toCharArray() method)
		 * 
		 * Input : John
		 * 
		 * Output :[J, o, h, n]
		 */
		 Scanner scan=new Scanner(System.in);
	        System.out.println("Parcalamak istediginiz isim giriniz");
	        String str=scan.nextLine();
	        String arr[]=str.split("");
	        System.out.println(Arrays.toString(arr));
	}

}
