/**
 * Recursive algorithms to find biggest integer number
 * by diving an array half
 */
package algos03;

/**
 * @author Antiik.dev
 * @version 21 April 2022
 */
public class RecursionBiggestHalf {

	
	/**
	 * Recursively finds biggest int number from an array
	 * @param t array
	 * @param n length of an array
	 * @return biggest number
	 * @example
	 * <pre name="test">
	 * 	int[] t = { 1, 0, 0 }; int n = 3;
	 * 	haeSuurin(t, n)		=== 1;
	 *  int[] t1 = { 0, 0, 9 };
	 *  haeSuurin(t1, n)	=== 9;
	 *  int[] t2 = { 1, 3, 2 }; 
	 *  haeSuurin(t2, n)	=== 3;
	 *  int[] t3 = { 0 }; n = 1;
	 *  haeSuurin(t3, n)	=== 0;
	 *  int[] t4 = { 2, 5, 2, 3, 5, 7, 7 }; n = 7;
	 *  haeSuurin(t4, n)	=== 7;
	 * </pre>
	 */
	public static int haeSuurin(int[] t, int n) {
		if ( n == 1) {
			return t[0];
		}
		else {
			return suurin(haeSuurin(t,n-1), t[n-1]);
		}		
	}
	
	
	/**
	 * Evaluates biggest number
	 * @param x number
	 * @param z number
	 * @return biggest integer of two numbers
	 */
	public static int suurin(int x, int z) {
		if (x > z) return x;
		else return z;
	}
	
	
	/**
	 * Main for testing
	 * @param args not in use
	 */
	public static void main(String[] args) {
		int[] t = { 4, 8, 3, 6, 7, 1 };
		int n = t.length;
		int biggest = haeSuurin(t, n);
		System.out.println("Biggest number is " + biggest);
	}

}
