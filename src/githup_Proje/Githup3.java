package githup_Proje;

import java.util.Scanner;

public class Githup3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
int faktoriyel = 1;
        
        System.out.println("Bir sayi giriniz: ");
        int sayi = scan.nextInt();
        
        for(int i = 1; i <= sayi; i++)
        {
            faktoriyel = faktoriyel * i;
        }
        System.out.println(sayi + "!= " + faktoriyel);
	}

}
