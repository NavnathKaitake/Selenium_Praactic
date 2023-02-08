package argumentsandreturntype;

public class NoArgumentAndWithReturn {

	public int m1() {
		return 55;
	}
	public static Boolean m2() {
		return true;
	}
	public static void main(String[] args)
	{
		NoArgumentAndWithReturn aa = new NoArgumentAndWithReturn();
		System.out.println(aa.m1());
		System.out.println(m2());
	}
	
}
