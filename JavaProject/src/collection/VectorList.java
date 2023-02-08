package collection;

import java.util.Iterator;
import java.util.Vector;

public class VectorList {
	public static void main(String[] args) {
	Vector<String>	ob = new Vector<String>();
	ob.add("Mango");
	ob.add("Banana");
	ob.add("Chikku");
	ob.add("Apple");
	ob.add("Mango");
	Iterator loop=ob.iterator();
	while(loop.hasNext()) {
		System.out.println(loop.next());
	}
	}

}
