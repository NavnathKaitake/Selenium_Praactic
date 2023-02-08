package array;

import java.util.Arrays;

public class ArraysortDecending {
	public static void main(String[] args) {
		int [] a= {1,23,12,523,87,63,2,4,86,3,554,42,0,253,1,54,53,333};
		Arrays.sort(a);
		for(int i=a.length-1;i>0;i--)
			System.out.print(a[i]+" ");
	}

}
