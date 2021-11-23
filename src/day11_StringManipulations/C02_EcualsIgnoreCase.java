package day11_StringManipulations;

public class C02_EcualsIgnoreCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		 String str1= "ali";
	        String str2= "can";
	        String str3= "Ali Can";
	        String str4= str1 + " " + str2; 
	        
	        System.out.println(str4); // ali can
	        System.out.println(str3==str4); // False hem degerler hem de referans farkli
	        System.out.println(str3.equals(str4));// false degerler farkli
	        
	        System.out.println(str3.equalsIgnoreCase(str4)); // true icerik ayni, case sensitive degil
	    }
	}