package constctore;

public class Constructore1 {
	public Constructore1() {
		this(20,true);
		System.out.println("Constructore 1");
		
	}
	
	public Constructore1(int a,boolean t) {
		this(55);
		System.out.println("Constructore with int and boolean");
		
	}
	public Constructore1(int c) {
		System.out.println("Constructore with int");
		
	}
	public static void main(String[] args) {
		new Constructore1();

	}
}
