package GenelTekrar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List_5 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a check number");
		int check=scan.nextInt();
		List<Integer> primeNumber = new ArrayList<>();
		
		tenNum(primeNumber,check);
		System.out.println(primeNumber);
		scan.close();
		
	
	}

	public static List<Integer> tenNum(List<Integer> primeNumber, int check) {
		int sayac=0;
		int flag=0;
		for (int i = check+1 ; i > 0; i++) {
			flag=0;
			for (int j = 2; j  < i ; j++) {
				if (i % j == 0) {
					flag++;
					}				
			}
			if (flag > 0) {
				continue;
			} else {
				primeNumber.add(i);
				sayac++;
			}
			
			if (sayac == 10) {
				break;		
			}						
		
		}
		
		
	return primeNumber ;}
	


	}
	
	
	


