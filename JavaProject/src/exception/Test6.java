package exception;

public class Test6 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println(1);
		System.out.println(2);
		Thread.sleep(3000);
		System.out.println(3);
		try {
		System.out.println(4/0);
		}
		catch (ArithmeticException ref) {
			System.out.println("Zero cannot divide any value");
		}
		finally {
			System.out.println("-	No matter what exception occured or may not accured finally will always get execute ");
		}
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
        System.out.println(8);
	
	
	
	}

}
	