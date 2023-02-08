//If name of static variable is same as local variable then in any method to call static variable 
//className.VariableName


package demo2;

public class LocalVeVeriable6 {
	int a=20;
	static int b=30;
public static void main(String[] args) {
	int a=22;
	int b=33;
	//System.out.println(this.a);// using this command give error
	System.out.println(LocalVeVeriable6.b);// o\p-20
	
}
}
