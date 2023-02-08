package exception;

public class Test1 {
public static void main(String[] args) {
System.out.println(1);
System.out.println(2);
System.out.println(3);
try {
System.out.println(100/0);
}
catch(ArithmeticException refver)
{
	System.out.println("100 can not divide 0");
}
finally {
	System.out.println("");
}
System.out.println(4);
System.out.println(6);
}

}
