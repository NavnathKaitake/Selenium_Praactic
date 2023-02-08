package exception;

public class Test7 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println(1);
		System.out.println(2);
		Thread.sleep(3000);
		System.out.println(3);
		try {
		System.out.println(4/0);
		}
		catch (Exception ref) {
			System.out.println(ref.getMessage());
		}
		
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
        System.out.println(8);
	
	
	
	}

}
