package day06_wraper;

public class C04_If {

	public static void main(String[] args) {

		int a=10;
        int b=20;
        
        if (a>5) {
            System.out.println("a sayisi besden buyuk");
        }
        
        if (a>b) {
            System.out.println("a sayisi b den buyuk");
        }
        
        if (b>100) {
            System.out.println("b sayisi 100'den buyuk");
        }
        
        // basit if c�mleleri ba��ms�z �al���r, t�mif lerin body si �al��abilir, baz�lar� �al��abilir.
        // hatta hi�birinin body si �al��mayabilir.
        // basit if cumleleri bagimsiz calisir
        // her bir if cumlesi kendi sartina bakar, sart true ise body calisir, 
        //      sart false ise body calismaz
    }
}


