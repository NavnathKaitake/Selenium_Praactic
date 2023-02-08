package inheritance;

public class GlobleSameinChildclassuseSuper extends GlobleBothClassParentchild{

	int a=100;
	static int b=120;
	public void m3() {
		System.out.println(a);//100
		
		System.out.println(super.a);//50
	}
	public static void m4()
	{
		System.out.println(b);
		System.out.println(GlobleBothClassParentchild.b);
	}
	public static void main(String[] args) {
		GlobleSameinChildclassuseSuper ob= new GlobleSameinChildclassuseSuper();
		ob.m3();
		m4();
		ob.m1();
		
		
		
	}
}
