///StaticVeriable 
//-	If we do not assign any value to static variable then JVM will assign default value to this variable 
package demo2;

public class StaticVeriable2 {
	 static int a;
	 static int b;
	 public static void main(String[] args)
	 {
		 int c = a+b;
		 System.out.println(c);
	 }

}
