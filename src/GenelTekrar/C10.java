package GenelTekrar;

import java.util.Scanner;

public class C10 {

	public static void main(String[] args) {
		/*
		 * Kullanýcýdan bir isim yazmasýný isteyin, adýn uzunluðu 3 olmalýdýr. Ardýndan,
		 * adýn ayný karakterlere sahip olup olmadýðýný kontrol edin.
		 * 
		 * Eger ayný karakterlere sahipse
		 * 
		 * "isim ayni karakterlere sahiptir." yazdirin.
		 * 
		 * Eger ayni kaakterlere sahip degilse
		 * 
		 * "Dizenin benzersiz karakterleri var" yazdirin.
		 * 
		 * Ternary kullanin.
		 */
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen üc harfli bir isim giriniz: ");
		
		String isim=scan.next();
		
		System.out.println(isim.length() == 3 ? isim.charAt(0) == isim.charAt(1) || isim.charAt(0) == isim.charAt(2) ?  "isim ayni karakterlere sahiptir : "  :  "Dizenin benzersiz karakterleri var" : "girdiðiniz isim hatalidir" );
		
		

	}

}
