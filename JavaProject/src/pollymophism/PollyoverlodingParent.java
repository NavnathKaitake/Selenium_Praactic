package pollymophism;

public class PollyoverlodingParent {
	int a=20;
	
public void m1() {
	System.out.println("print parent m1");
}
public void m1(int a) {
	System.out.println("print parent orloding int ");
}
public void m1(boolean b)
{
	System.out.println("print parent orloding m1 boolean");
}
public static void main(String[] args) {
	PollyoverlodingParent ob = new PollyoverlodingParent();
	ob.m1();
	ob.m1(false);
	ob.m1(50);
}
	
}
