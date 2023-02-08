package collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueuePriority {
	public static void main(String[] args) {
PriorityQueue<String> obj= new PriorityQueue<String>();
obj.add("Mango");
obj.add("Apple");
obj.add("JackFrute");
obj.add("Mango");
System.out.println("Head :"+obj.element());
System.out.println("Head :"+obj.peek());
//Iterator a=obj.iterator();
//while(a.hasNext()) {
	//System.out.println(a.next());
//}
obj.remove();
System.out.println("Head :"+obj.element());
obj.poll();
Iterator a2=obj.iterator();
while(a2.hasNext()) {
	System.out.println(a2.next());
}
	}
}
