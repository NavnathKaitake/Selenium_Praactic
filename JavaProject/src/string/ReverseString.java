//use tochararray method use reverse string
package string;

public class ReverseString {
	public static void main(String[] args) {
		String a=("Navnath");
		char [] ar=a.toCharArray();
		for(int i=a.length()-1;i>0;i--)
			System.out.print(ar[i]);
	}

}
