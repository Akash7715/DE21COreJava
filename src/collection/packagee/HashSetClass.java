package collection.packagee;

import java.util.Collections;
import java.util.HashSet;

public class HashSetClass {

	public static void main(String[] args) {

		HashSet<Integer> dd = new HashSet<>();
		
		Integer a = new Integer(444);
		dd.add(new Integer(30));
		dd.add(34);
		dd.add(a);
		dd.add(56);
		dd.add(88);
		dd.add(new Integer(560));
		dd.add(34);
		System.out.println(dd);
		dd.remove(a);
		dd.add(null);
		dd.add(null);
		System.out.println(dd.size());		
		for (Integer each:dd)
		{
			System.out.println(each);
		}
		
		

	}

}
