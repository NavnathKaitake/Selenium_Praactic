package demo;

public class FinalClassexample2 {
	public void m1() {
		System.out.println("print m1");
	}
	public static void main(String[] args) {
		FinalClassexample ob  = new FinalClassexample();
		ob.m1();
		System.out.println(ob.a);//
		System.out.println(FinalClassexample.b);//final veriable can be access anyther class using asiciation
		//i.e using classname.veriable and non static finl non static veriable call anyther class using asociation
		//i.e using previous class object objectname.veriblenm,also call static &non static method use 
	}

}
