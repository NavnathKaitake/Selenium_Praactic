package string;

public class tocharArraymethod {

	public static void main(String[] args) throws InterruptedException
	{
		String a="KRUSHNA";
		System.out.println(a);
		Thread.sleep(2000);
		char[] b=a.toCharArray();
		for(int i=0;i<a.length();i++)
			System.out.println(b[i]);
	}
}
