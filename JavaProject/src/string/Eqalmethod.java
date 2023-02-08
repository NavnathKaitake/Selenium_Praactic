package string;

public class Eqalmethod {
	public static void main(String[] args) {
		String a="Krushna";
		String b=new String("Krushna");
		System.out.println(a==b);//compair bet memory addres i.e object add
		System.out.println(a.equals(b));//compair between content of 2 object
	}

}
