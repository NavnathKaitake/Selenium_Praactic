package inheritance;

public class Con1call {
	public void m1() {
		System.out.println("print m1");
	}
	public Con1call() {
		this(50);
		System.out.println("print con1");
	}

	public Con1call(int a) {
		this(50,true);
		System.out.println("print con2");
	}
	public Con1call(int b,boolean c){
	System.out.println("print con3");	
	}
	//public  static void main (String [] args)
	//{
	//	Con1call ob =new Con1call();
		//ob.m1();
	//}
}
