package day29_staticBlock_passByValue;

public class C03__pPassByValue {

	public static void main(String[] args) {
		// Main method'dan diger method'lara veya diger method'lardan main method'a 
				// bir variable gonderirseniz Java orjinal variable'lari degil
				// onlarin degerlerini(value) goturur, orjinal variable'in degeri degismez
				
				int fiyat=100;
				
				
				System.out.println(indirimYap25(fiyat)); //  75
				System.out.println("method'dan sonra main method'daki fiyat : " + fiyat); // 100
				
				// indirimi kalici yapmak istiyoprsaniz main method'da atama yapmaniz gerekir
				fiyat = indirimYap10(fiyat);
				
				
				
				System.out.println("method'dan sonra main method'daki fiyat : " + fiyat); // 100
			}

			private static int indirimYap25(int fiyat) {
				 fiyat*=0.75;
				
				return fiyat;
			}

			private static int indirimYap10(int fiyat) {
				
				 fiyat*=0.90;
				 return fiyat;
				
			}

		

		/*
		 * Bunu bir de adres bulma analojisinden izah edebilirim. Ornegin sana bir kagit
		 * verdim, kagitta evimin adresi yaziyor. Sen bu kagidin uzerindeki adresi
		 * silip, yerine baska bir evin adresini yazarsan: - Bu kagida bakarak benim
		 * evin adresini bulmak isteyen tum insanlar artik yeni evin adresini gorurler.
		 * Cunku sen direkt olarak referansi degistirdin. - Benim adresimin bulundugu
		 * kagidin sana sadece bir kopyasini verdim, sen ona istedigini yaz. Sadece
		 * kendi baktigin adresi degistirirsin, diger herkes ayni sekilde benim evimin
		 * adresini okumaya devam ederler. ---> Pass by value budur. Eger sen evin
		 * icerisinde bir sey degistirmek istersen, adresteki evi bulup, icerisinde
		 * istedigin degisikligi yapabilirsin. Ama sana verdigim kagida ne yazarsan yaz,
		 * diger insanlarin referansi uzerinde degisiklik yapamadigin icin senin
		 * disindaki insanlar ( scope disindakiler ) etkilenmezler.
		 */
	}
