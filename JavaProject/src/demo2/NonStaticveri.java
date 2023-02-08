package demo2;

public class NonStaticveri {
	int a=10;
	int b=20; // non static veriable
	public static void main(String[] args)
	{
		NonStaticveri	aa	= new NonStaticveri();
		int c = aa.a+aa.b;
		System.out.println(c);
	}

}
