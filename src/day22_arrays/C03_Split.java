package day22_arrays;

import java.util.Arrays;

public class C03_Split {

	public static void main(String[] args) {
		// "Java ogrendim,  #cok para ?kazandim.,"
		//c�mlesinin kelimelerini, �zel karakterler
		//ve noktalam i�aretleri olmadan harf s�ras�na
		//g�re yazd�ral�m.
		
		String cumle="Java ogrendim,  #cok para ?kazandim.,";

        
        String kelimeler[]=cumle.split(" ");
        
        System.out.println(Arrays.toString(kelimeler)); //[Java, ogrendim,, , #cok, para, ?kazandim.,]

        for (int i = 0; i < kelimeler.length; i++) {
        	kelimeler[i]=kelimeler[i].replaceAll("\\W", "");
		
			Arrays.sort(kelimeler);
			String yeniCumle="";
			
			for (int i1 = 0; i1 < kelimeler.length; i1++) {
			
				System.out.println(kelimeler[i] + " ");
			}
			
		}
     
	}

}
