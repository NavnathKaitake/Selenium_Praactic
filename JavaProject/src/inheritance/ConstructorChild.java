package inheritance;

public class ConstructorChild extends ConstructorParent {
public ConstructorChild() {
	System.out.println("Child constructore");
}
public static void main(String[] args) {
	new ConstructorChild();
}
}
