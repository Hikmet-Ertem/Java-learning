package GenelTekrar;

import java.util.Scanner;

public class C05 {

	public static void main(String[] args) {
		/*
		 * Kullanýcýya kilosunu ve boyunu sorun ve kitle indeksini hesaplayan bir
		 * program yazýn (BMI)
		 * 
		 * IPUCU : BMI = Agirlik(kg) / Boy*Boy (m)
		 * 
		 * BMI 18,5'in altýndaysa zayýfsýnýz
		 * 
		 * BMI 18,5 ile 25 arasýnda ise kilonuz idealdir
		 * 
		 * BMI 25-30 arasýndaysa þiþmansýnýz
		 * 
		 * BMI 30'dan büyük veya eþitse, obez
		 * 
		 * Input:
		 * 
		 * Output:
		 * 
		 * Agirlik : 71
		 * 
		 * Boy : 1,72
		 * 
		 * BMI : 23.99945916711736
		 * 
		 * Zayifsiniz.
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Kilonuzu giriniz \nboyunuzu giriniz: ");
		
		double kilo=scan.nextDouble();
		double boy=scan.nextDouble();
		double bmi= kilo/(boy*boy);
		
		System.out.println("Aðýrlýk : "+ kilo +"\nBoy : " +boy);
		System.out.println("BMI : "+bmi );
		
		System.out.println(bmi<18.5 ? "zayifsiniz" : bmi>18.5 && bmi<25 ? "Kilonuz idealdir" : bmi>25 && bmi<30 ? "Þiþmansiniz" : bmi>=30 ? "obezsiniz" : "" );
		
		
	}

}
