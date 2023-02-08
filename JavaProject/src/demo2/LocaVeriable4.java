//-	If name of Local Variable is same as Static Variable then to 
//access static variable in any method ClassName.VariableName (Only for static variable)

package demo2;

public class LocaVeriable4 {
	static int a=100;
	       int b=50;
public static void m1() {
	int a=200;
//System.out.println(a);// using this ststment o\p- 200
	System.out.println(LocaVeriable4.a);//o\p-100
	//using classname.veriable name to access static global veriable valu 
}
public static void main(String[] args) {
	m1();
}
}
