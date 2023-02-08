package array;

import java.util.Arrays;

public class CompareTwoArray {
	public static void main(String[] args) {
		
		int[] a = {10,11,12,13,14};
		int[] b = {10,11,12,13,14};
		int[] c = {10,20,30,40,50};
			System.out.println(Arrays.equals(a,b));
			System.out.println(Arrays.equals(a,c));
			System.out.println(Arrays.equals(b,c));

	}

}
