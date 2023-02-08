package argumentsandreturntype;

public class WithArgAndWithReturn {

	public int m1(double a) //in brcket is data type and its veriable or value call as argument
	{                         //int ,void other some is a return type	
		return 55;
		}
	public static char m2(boolean b)
	{
		return 'S';
	}
	public static void main(String[] args) {
		WithArgAndWithReturn aa = new WithArgAndWithReturn();
		int d=aa.m1(5.5);
		System.out.println(d);
		System.out.println(m2(true));
		//m2(true); using calling m2 & m1 program is run but out not display
	}
}
