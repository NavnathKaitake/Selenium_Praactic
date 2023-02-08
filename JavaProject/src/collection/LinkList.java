package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkList {
public static void main(String[] args) {
	LinkedList<String> ob = new	LinkedList<String>();
	ob.add("Ram");
	ob.add("Krushna");
	ob.add("Hari");
	ob.add("Krushna");
	ob.add("Ram");
Iterator loops= ob.iterator();
while(loops.hasNext()) {
	System.out.println(loops.next());
}
	
}
}
