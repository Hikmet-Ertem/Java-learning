package ders1;

import java.util.Scanner;

public class NestedIfElse1 {

	public static void main(String[] args) {
		 // Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir, 
        // calisan erkekse 65 yasindan buyukse emekli olabilir
        
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen yasinizi giriniz");
		
		
		int yas=scan.nextInt();
				
		if (yas>=60) {
			System.out.println("Kadin emekli olabilir");
		} else {
			System.out.println("Kadin calismalisin");
		}

		if (yas>=65) {
			System.out.println("Erkek emekli olabilir");
		} else {
			System.out.println("Erkek calismalisin");
		}
	}

}
