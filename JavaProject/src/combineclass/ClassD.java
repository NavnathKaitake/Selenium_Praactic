package combineclass;

import demo2.StaticMethod3;

public class ClassD {
	
	public static void main (String[] args)
	{
		ClassC ob = new ClassC();
		ob.m1();//print ClassC non static method
		
		
		System.out.println(ob.a);//print classC non static veriable

		StaticMethod3 obj1 =new StaticMethod3();//using this object call 
		//another packge ,in class i.e StaticMethod3 and call m1() method
		obj1.m1();
	}

}
