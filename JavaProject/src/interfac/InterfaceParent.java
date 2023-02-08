package interfac;

public interface InterfaceParent {
public abstract void m1();
public void m2();
void m3();
void m4();
public static void m5() {//use static method within its body must be use
	System.out.println("prnt static method m5");
}
}
