//Disply 3 student marks
package constctore;

public class ThreeStude2 {
public ThreeStude2(int math,String name,int Phy,int Chem) {
	System.out.println("Name of Student: "+name);
	System.out.println("Math "+math);
	System.out.println("Phy "+Phy);
	System.out.println("Chem "+Chem);
	System.out.println("Total Marks of student:"+(math+Phy+Chem));
	System.out.println("");
}
public static void main(String[] args) {
	new ThreeStude2(60,"Navnath",40,36);
	new ThreeStude2(90,"Shubham",45,85);
	new ThreeStude2(66,"Krushna",55,85);

}
}
