package GenelTekrar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List1 {

	public static void main(String[] args) {
		/*Write a Java program to get a String from user as input and find the maximum occurring character in that string. (Ignore case sensitivity)
        input :
        Learning java is easy
        output:
        maximum occurring character is : a
        */
        
        Scanner scan =new Scanner(System.in);
        System.out.println("bir metin giriniz");
        String str=scan.nextLine();
        String arr[]=str.split("");
        
        List<String> list=new ArrayList<>();
        int sayac=0;
        int maxSayac=0;
        String encokTekrar="";
         for (int i = 0; i < arr.length; i++) {
             list.add(arr[i]);
             
        }
        
        for (int i = 0; i < list.size(); i++) {// karsýlastýrdýgýmýz karakter
            for (int j = i+1; j < list.size(); j++) { //karsýlastýrýlan karakterler
                
                if (list.get(i).equalsIgnoreCase(list.get(j))) {
                     sayac++;
                } 
            }
             if (sayac > maxSayac) {
                maxSayac=sayac;
                encokTekrar=list.get(i);
                 
            } else if (sayac==maxSayac) {
                encokTekrar += " " + list.get(i);
            } 
             sayac=0;
        }
        
        
        System.out.println(encokTekrar);
        
        }

	}


