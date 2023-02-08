//display the three Student 3 sub marks and total
package constctore;

public class ThreeStudemark {
	public ThreeStudemark(int Math,int Phy,int Chem,String Name) {//using constructore
		System.out.println("Student Name: "+Name);
		System.out.println("Math "+Math);
		System.out.println("Chem "+Chem);
		System.out.println("Phy  "+Phy);
		System.out.println("Taotal Marks: "+(Math+Phy+Chem));
		System.out.println("");
	}
public static void main(String[] args) {
	new ThreeStudemark(85,56,78,"Krushna");//calling constructore
	new ThreeStudemark(65,86,98,"Rajveer");
	new ThreeStudemark(81,56,82,"Devki");
}
}
