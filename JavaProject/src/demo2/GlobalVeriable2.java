//-	JVM does not provide default value to the local variable if not assigned
//but jav notststic veriable default valu assign
package demo2;

public class GlobalVeriable2 {
	int a;
	public static void main(String[] args) {
		int a=20;
		System.out.println(a);
		GlobalVeriable2	aa= new GlobalVeriable2();
		System.out.println(aa.a);
	}

}
