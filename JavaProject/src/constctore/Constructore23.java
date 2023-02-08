package constctore;

public class Constructore23 {
public Constructore23() {
	this(25,true);
	System.out.println("this is constouctore1");
}
public Constructore23(int c,boolean a) {
	this(20,"Navnath");
	System.out.println("this is constructore2");
}
public Constructore23(int b,String d) {
	
	System.out.println("this is constructore3");
}
public static void main(String[] args) {
	new Constructore23();
}
}
