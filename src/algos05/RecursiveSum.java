/**
 * Recursive sum with division
 */
package algos05;

import java.util.Arrays;

/**
 * @author Antiik.dev
 * @version 5 May 2022
 */
public class RecursiveSum {

	
	/**
	 * Simple recursively calcualted sum of integer array
	 * @return sum of array numbers
	 */
	public static int recursiveSum(int[] t, int n) {
		if (n == 0) return 0;
		else if (n == 1) return t[0];
		
		return recursiveSum(t, n-1) + t[n-1];
	}
	
	/**
	 * Calculates sum of integer array recursively 
	 * using division (divide and conquere)
	 * @param t array with integer numbers
	 * @return sum of array integer
	 * @example
	 * 1 2 3 4
	 * 1 2 | 3 4
	 * 1+2 | 3+4
	 * 3   |  7
	 * = 10
	 */
	public static int recursiveSumDiv(int[] t, int low, int high) {	
		if (low == high) return t[low];
		
		int middle = (low+high) / 2;
		// left + 
		// right
		return recursiveSumDiv(t, low, middle) + 
				recursiveSumDiv(t, middle+1, high);
	}
	
	
	/**
	 * Main for testing
	 * @param args not in use
	 */
	public static void main(String[] args) {
		int[] t = { 1, 2, 3, 4, 5, 6, 7 }; // SUM: 28
		int n = t.length;
		int low = 0;
		int high = t.length-1; // last index
		System.out.println("Array: " + Arrays.toString(t));
		
		int result = recursiveSum(t, n);
		System.out.println("Recursive sum is " + result);
		
		result = recursiveSumDiv(t, low, high);
		System.out.println("Recursive divide and conquere"
				+ " sum of array is " + result);
		
		
	}

}
