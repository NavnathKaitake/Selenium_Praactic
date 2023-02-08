package inheritance;

public class GobleveriableinInheritanceChild extends GobleveriableinInheritance{
//int a=50;
//static int b=60;
public void m2() {
	System.out.println("this non static method parent class");
	
}
public static void main(String[] args) {
	GobleveriableinInheritanceChild obj = new GobleveriableinInheritanceChild();
	obj.m1();
	System.out.println(b);
	System.out.println(obj.a);
	
}
}
