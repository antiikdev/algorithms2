/**
 * Recursive and non-recursive methods to calculate
 * sum of arrays remainders with number 2.
 * Arrays t and u have n > 0
 */
package algos03;

/**
 * @author Antiik.dev
 * @version 20 April 2022
 *
 */
public class Remainder {
	
	
	/**
	 * Recursively calculate sum of array indexes
	 * remainder (%) with number 2
	 * @param t array
	 * @param n lenght of array
	 * @return array index numbers remainders of number 2
	 */
	public static int laskeXR(int[] t, int n) {
		if (n == 1) return t[0]%2;
		else return (laskeXR(t,n-1) + t[n-1]%2);
	}
	
	
	/**
	 * Non-recursively calculate sum of array indexes 
	 * remainder (%) with number 2
	 * @param t array
	 * @param n length of array
	 * @return array index numbers remainders of number 2
	 */
	public static int laskeX(int[] t, int n) {
		  int x = 0;
		  for (int i = n-1; i >= 0; i--) {
			  x += t[i]%2;
		  }
		  return x;
	}
	

	/**
	 * Main for testing
	 * @param args not in use
	 */
	public static void main(String[] args) {
		
		// Array and n
		int[] t = { 1, 2, 3, 4, 5, 6 };
		int n = 6;
		
		// Recursive
		int x = laskeXR(t, n);
		System.out.println("Recursive:     " + x);
		
		// Non-recursive
		x = laskeX(t, n);
		System.out.println("Non-recursive: " + x);
		
	}

}
