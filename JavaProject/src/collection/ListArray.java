package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ListArray {
	public static void main(String[] args) {
	ArrayList	ob = new ArrayList<String>();

	ob.add("mango");
	ob.add("Banana");
	ob.add("Chikku");
	ob.add("Banana");
	Iterator loops=ob.iterator();
	while(loops.hasNext())
		System.out.println(loops.next());
	}

}
