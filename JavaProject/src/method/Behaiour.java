package method;

public class Behaiour {
	public void m1()
	{
		System.out.println("jvm read 1");
	}
	public static void m2()
	{
		System.out.println("javm read 2");
	}
 public static void main (String[] args)
 {
	 System.out.println("jvm read 3");
	  Behaiour Shri= new Behaiour();
	  Shri.m1();
	 m2();
 }
}
