package overriding;

public class StaticoverChild extends Staticoverriding{
	public static void m1() {
		System.out.println("print static child m1");
	}
	public static void main(String[] args) {
		//StaticoverChild ob = new StaticoverChild();
		//ob.m1();
		Staticoverriding obj = new StaticoverChild();
		obj.m1();
	}

}
