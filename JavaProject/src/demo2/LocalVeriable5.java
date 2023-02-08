//-	To call only local variable inside same method we can call it directly,
//but in another method we cannot call local variable of another method
package demo2;

public class LocalVeriable5 {
	public void m1(){
		int a=20;//local veriable in non static method
		
		System.out.println(a);
	}
	public static void m2() {
		int a=30;//local veriable in static veriable
		
		System.out.println(a);
	}
	public static void main(String[] args) {
		m2();//o\p-30
		
		LocalVeriable5 aa = new LocalVeriable5();
		
		aa.m1();//o\p-20
	}
	

}
