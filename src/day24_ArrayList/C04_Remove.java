package day24_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C04_Remove {

	public static void main(String[] args) {


		List<String> harfler=new ArrayList<>();
		
		harfler.add("A");
		harfler.add("Z");
		harfler.add("F");
		harfler.add("D");
		
		System.out.println(harfler);
		
		harfler.remove(1);
		
		
		System.out.println(harfler);
		
		System.out.println(harfler.remove(2));
		System.out.println(harfler);
		System.out.println(harfler.remove("F"));
		System.out.println(harfler.remove("B"));
		
		harfler.add("A");
		harfler.add("Z");
		harfler.add("F");
		System.out.println(harfler);
				
		System.out.println(harfler.remove("A"));
		System.out.println(harfler);
		harfler.add("A");
		

	}

}
