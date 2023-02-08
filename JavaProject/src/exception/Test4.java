package exception;

public class Test4 {
	public void totalmark(int marks) {
		if(marks<=40)
			throw new IllegalStateException("fail");
		else
			System.out.println("pass");
	}
public static void main(String[] args) {
	Test4 ob= new Test4();
	ob.totalmark(39);
	ob.totalmark(50);
}
}
