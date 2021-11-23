package day04;

public class C03_AutoWidening {

	public static void main(String[] args) {

		byte sayi1=44;
		
		short sayi2= sayi1;
		
		// esitligin sol tarafı short, sag tarafı byte
		// iki data turu farkli oldugu halde java itiraz etmiyor
		// cunku atama yapilan variable ni data turu (short) 
		// atanan deger veri turundan buyuk oldugundan sorun olusmaz
		
		System.out.println("sayi2 : + sayi2");
		
		
		
		int sayi3= 55;
		double sayi4= sayi3;
		
		
		System.out.println("sayi4 : + sayi4");
		
		// atanan degerin data turu deger atanan varible nin data turundan kucukse 
		// java casting i otomatik yapar
		// bu isleme auto widening denir
		
		

	}

}
