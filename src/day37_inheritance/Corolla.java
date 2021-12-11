package day37_inheritance;

public class Corolla extends Toyota {

	String renk;
	int fiyat;
	boolean elektrikliMi;
	int tekerSayisi=4;
	String uretimYeri="Turkiye"; 
	
	public static void main(String[] args) {
		
		
		Corolla                    arb1          =              new         Corolla();
		//Class ismi && Data turu  obje ismi     assigment     keywor		Constructor
		
		// Java da obje olusturdugumuz her class ismi ayni zamanda bir data turu'dur
		// Bu ornegimiz icin Corolla hem class adi, hem de olusturdugumuz arb1 objesinin data type'idir.
		System.out.println(arb1.calisiyorMu);
		System.out.println(arb1.tekerSayisi);
		System.out.println(arb1.uretimYeri);
		
		Toyota arb2= new Corolla();
		System.out.println(arb2.calisiyorMu);
		System.out.println(arb2.tekerSayisi);
		System.out.println(arb2.pahaliMi);
		
		Toyota arb3 = new Corolla();		
		System.out.println(arb3.calisiyorMu);
		
		String str=new String ("Filiz");
		
		

	}

}
