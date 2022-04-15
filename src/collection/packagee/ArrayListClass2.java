package collection.packagee;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListClass2 {

	public static void main(String[] args) {		

		ArrayList<String> data = new ArrayList<>();

		String str1 = "Welcome";
		String str2 = "Hi";
		
		data.add(str1);
		data.add(str2);
		data.add("KTCTC");
		data.add(new String("GTRT"));
		String dd = data.get(2);
       
		System.out.println(data);
	}
	
	
	

}
