package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSettttt {
	public static void main(String[] args) {
		HashSet<String> aa= new HashSet<String>();//duplicate value not add and insertion order not maintain
		aa.add("Ram");
		aa.add("Arjun");
		aa.add("Krushna");
		aa.add("Hari");
		aa.add("Krushna");
		aa.add("Ram");
	//	Iterator a=aa.iterator();
		//while(a.hasNext())
		//{
			//System.out.println(a.next());
		//}
	for(String i:aa)
		System.out.println(i);
	}

}
