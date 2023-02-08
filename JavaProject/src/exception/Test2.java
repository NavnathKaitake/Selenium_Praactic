package exception;

public class Test2 {
	public static void main(String[] args) throws InterruptedException  {
		int a=20;
		int b=30;
		int c=a+b;
		Thread.sleep(2000);
		System.out.println(c);
		b=c+a;
		Thread.sleep(2000);
		System.out.println(b);
		Thread.sleep(2000);
		System.out.println(a);
	}

}
