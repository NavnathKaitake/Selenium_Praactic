package argumentsandreturntype;

public class ThreeStudentMark1 {
	
	public static void m1(String Name,int Math,int Phy,int Chem)
	{
		System.out.println("Mark of Student " +Name);
		System.out.println("Math  " +Math);
		System.out.println("Phy   "  +Phy);
		System.out.println("Chem  "  +Chem);
		System.out.println("Total Marks: "+(Math+Phy+Chem));
		System.out.println(" ");
	}
	public static void main(String[] args) {
m1("Navnath",89,46,78);
m1("Anant",85,96,45);
m1("Amol",65,66,76);
}
}