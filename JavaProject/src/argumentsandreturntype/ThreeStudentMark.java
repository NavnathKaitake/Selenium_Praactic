//•	Write a program to display marks of 3 Student appearing for the following subject Maths, Physics, Chemistry


package argumentsandreturntype;

public class ThreeStudentMark {
	public void m1(String Name,int Math,int Phy,int Chem)////using with argument no return type use
	{
		System.out.println("Marks of Student : " +Name );
		System.out.println("Math: " +Math);
		System.out.println("Phy: " +Phy);
		System.out.println("Chem: " +Chem);
		System.out.println ("Total Marks: "+(Math+Phy+Chem));
		System.out.println("Parcentage: "+(Math+Phy+Chem)/3 );
		System.out.println("");
	}
	public static void main(String[] args) {
		ThreeStudentMark aa = new ThreeStudentMark();
		aa.m1("Navnath", 56, 75, 82);
		aa.m1("Shreya", 35, 99, 67);//this is non static calling method
		aa.m1("Krishna", 66, 85, 92);
		
	}

}
