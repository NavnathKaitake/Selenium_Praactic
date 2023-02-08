package collection;

import java.util.Iterator;
import java.util.Stack;

public class StackVector {
	public static void main(String[] args) {
		Stack<String> ob = new Stack<String>();
		ob.push("mango");
		ob.push("Banana");
		ob.push("Pinaaple");
		ob.push("Apple");
		ob.push("Chikku");
	//	ob.peek();
		ob.pop();
		Iterator loop=ob.iterator();
		while(loop.hasNext()) {
			System.out.println(loop.next());
		}
	}

}
