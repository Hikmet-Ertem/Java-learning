package day04;

public class C06_PreincrementPostincrement {

	public static void main(String[] args) {
		// precincrement ve post increment sadece sayi++ veya sayi-- yazimi icin gecerlidir.
		int sayi=10;
		
		sayi++;
		sayi++;
		sayi++;
		
		System.out.println(sayi);
		
		
		System.out.println(sayi++); // bu satirda iki islem var
									// bir artirma, bir de yazdirma
		System.out.println(sayi);
		
		// once artirmak sonra yazdirmak isterseniz ++sayi
		// once yazdirmak sonra artirmak isterseniz sayi++
		
		System.out.println(++sayi); //15
	}

}
