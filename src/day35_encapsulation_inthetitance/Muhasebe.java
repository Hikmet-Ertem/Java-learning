package day35_encapsulation_inthetitance;

public class Muhasebe extends Personel {
	protected int saatUcreti;
	protected String statu;
	protected int maas;
	
	public Muhasebe(){
		System.out.println("Muhasebe parametresiz constructor calisti");
	}

	public static void main(String[] args) {
		
		Muhasebe clsn1=new Muhasebe ();
		
		clsn1.isim="Ali";
		System.out.println(clsn1.soyisim);
		
		//Javada her class olu�turuldu�unda otomatik olarak
		//default constructor olu�tu�u gibi
		//Child class da olu�turulan herbir constroctorun ilk sat�r�nda
		//gizli super() olu�turur.
		
	
		
		
		
		
		
		
		
	}

	public int maasHesapla() {
		
		int maas=8*25*15;
		
		return maas;
	}
	
}
