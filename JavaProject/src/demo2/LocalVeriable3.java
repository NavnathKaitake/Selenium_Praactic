//-	If name of local variable is same as Non static variable then to access 
//Non static variable  inside Non static Method we will use “this” keyword
//(Only for Non static Method)
//
//access Non static variable  inside Non static Method we will use “this” keyword

package demo2;

public class LocalVeriable3 {
int a=10;//non static veriable
public void m1() //non static method
{
	
	int a=20;//local veriable
	//System.out.println(a);//use this sentence o\p is print i.e 20
	System.out.println(this.a);//use thise line o\p- print non ststic veriable i.e 10
}
public static void main(String[] args) {
	LocalVeriable3 jj= new LocalVeriable3();
	jj.m1();
	
}
}
//o/p-10