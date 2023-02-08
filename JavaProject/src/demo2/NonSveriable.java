package demo2;

public class NonSveriable {
	int a = 12;
	int b = 10;
public static void main(String[] args)
{
	NonSveriable aa = new NonSveriable();
	int c = aa.a+aa.b;
	System.out.println(c);
}
}
