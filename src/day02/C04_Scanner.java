package day02;

import java.util.Scanner;

public class C04_Scanner {

	public static void main(String[] args) {
		// kullanicidan deger almak icin 3 adim takip edilir
		// 1. adim Scanner objesi olusturmak
		
		Scanner scan=new Scanner(System.in);
		
		
		// ikinci adim kullaniciya ne istediginizi soylemek
		
		System.out.println("lutfen isminizi yaziniz");
		
		String isim=scan.next();
		
		System.out.println("ismini...:"+isim);
		
		
		
		// scan bir scanner objesidir
		// isim olarak farkli bir isim yazsak da calisir ama biz scan demeyi tercih ederiz
		// scan bir obje oldugu icin data turu non-primitive'dir
		// primitive data turlari sadece deger icerir
		// non-primitive data turleri degerin yaninda method'lar barindirir
		// scan. dedigimizde kullanabilecegimiz bu method'larý gorebilriz
		
		


	}

}
