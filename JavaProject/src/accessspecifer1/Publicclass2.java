package accessspecifer1;

public class Publicclass2 extends PublicClass {
public void m2() {
	
	System.out.println("print class2 m2 method");
}
public static void main(String[] args) {
	Publicclass2 obj = new Publicclass2();
	obj.m2();
	obj.m1();
}
}
