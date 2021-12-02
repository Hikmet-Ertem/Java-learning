package GenelTekrar;

import java.util.Scanner;

public class ForWhle7 {

	public static void main(String[] args) {
		/*
		 * Sayinin Mükemmel sayý olup olmadýðýný kontrol eden Java kodunu yazýn.
		 * 
		 * Sayýnýn kendisi hariç pozitif bölenlerinin toplamý o sayýya eþitse, herhangi
		 * bir sayý Mükemmel Sayý olarak bilinir. Input :
		 * 
		 * 6
		 * 
		 * Output:
		 * 
		 * 6 Mukemmel Sayidir.
		 * 
		 * ======================
		 * 
		 * Input
		 * 
		 * 7
		 * 
		 * Output:
		 * 
		 * 7 Mukemmel Sayidir degildir.
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
		
		int sayi=scan.nextInt();
		
		int toplam=0;
		for (int i = 1; i <= sayi/2; i++) {
			
			if (sayi%i == 0 ) {
				toplam+=i;
			}
		}
				if (sayi==toplam) {
					System.out.println(sayi+" "+ "mükemmel sayidir");
				}
				
			 else  {
				System.out.println(sayi+" "+ "mükemmel sayi degildir");
			}

			
			
		}

	}


