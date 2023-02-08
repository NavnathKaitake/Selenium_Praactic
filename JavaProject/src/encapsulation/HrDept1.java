package encapsulation;

import java.util.Scanner;

public class HrDept1 {
	private int Salary=10000;
	public int getsalry() {
		Scanner sec= new Scanner(System.in);
		System.out.println("enter password");
		String password = sec.nextLine();
		if(password.equals("Shubham123"))
			return Salary;
		else
 
		return (Integer)null;
	}

}
