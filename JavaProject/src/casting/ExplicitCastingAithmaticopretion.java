package casting;

public class ExplicitCastingAithmaticopretion {
	public static void main(String[] args) {
	byte a=20;
	short b=30;
	//short c=a+b;//this not happen
	int c=a+b;
	byte d= (byte)c;
	System.out.println(d);
	}
	

}
