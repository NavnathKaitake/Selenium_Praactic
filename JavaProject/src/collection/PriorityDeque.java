package collection;

import java.util.ArrayDeque;

public class PriorityDeque {
	public static void main(String[] args) {
		ArrayDeque<String>	obj=new ArrayDeque<String>();
		obj.add("Apple");
		obj.add("Pinaaple");
		obj.add("Mango");
		obj.add("Apple");
		for(String i:obj)
			System.out.println(i);
	}

}
