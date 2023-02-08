package exception;

public class Test5 {
	public void totalmark(int marks) {
		if(marks<=40)
			throw new IllegalStateException("fail");
		else
			System.out.println("pass");
	}
public static void main(String[] args) {
	Test4 ob= new Test4();
	try {
	ob.totalmark(39);
	}
	catch (IllegalStateException ref) {
		System.out.println(ref.getMessage());
	}
	ob.totalmark(50);
}
}



