//calling static within non ststic
package method;

public class NonStatic {
	public void m1() {//calling static within non ststic
		System.out.println("this is non ststic method");
	}
	public void m2() {
		m1();
	}
	public static void main(String[] args) {
		NonStatic ab = new NonStatic();//this object
		ab.m2();//to allocate memory using calling abject
	}

}
