/**
 * Recursive and non-recursive methods to calculate
 * multiplication sum of two arrays 
 * Arrays t and u have n > 0
 */
package algos03;

/**
 * @author Antiik.dev
 * @version 20 April 2022
 *
 */
public class MultiplicationSum {

	
	/**
	 * Recursively calculate sum of two arrays indexes
	 * multiplication
	 * @param t first array
	 * @param u second array
	 * @param n lenght of array(s)
	 * @return sum of arrays indexes multiplication
	 */
	public static int laskeYR(int[] t,int[] u, int n) {
		if (n == 1) return t[0]*u[0];
		else return (laskeYR(t,u,n-1) + t[n-1]*u[n-1]);
	}
	
	
	/**
	 * Non-recursively calculate sum of two arrays indexes
	 * multiplication
	 * @param t first array
	 * @param u second array
	 * @param n lenght of array(s)
	 * @return sum of arrays indexes multiplication
	 */
	public static int laskeY(int[] t,int[] u, int n) {
		  int x = 0;
		  for (int i = n-1; i >= 0; i--) {
			  x += t[i]*u[i];
		  }
		  return x;
	}
	
	
	/**
	 * Main for testing
	 * @param args not in use
	 */
	public static void main(String[] args) {
		// Array and n
		int[] t = { 1, 2, 3 };
		int[] u = { 1, 2, 3 };
		int n = 3;
		
		// Recursive:
		int x = laskeYR(t, u, n);
		System.out.println("Recursive:     " + x);
		
		// Non-recursive:
		x = laskeY(t, u, n);
		System.out.println("Non-recursive: " + x);
	}

}
