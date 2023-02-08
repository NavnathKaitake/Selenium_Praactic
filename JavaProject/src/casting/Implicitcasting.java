///implicit casting
package casting;

public class Implicitcasting {
public static void main(String[] args) {
	byte a=20;
	short b=a;
	int c=b;
	long d=c;
	float e=d;
	//programer way
	double f=(double) e;
	System.out.println(e);
	System.out.println(f);
}
}
