/**
 * Recursive counting
 */
package algos04;

/**
 * @author Antiik.dev
 * @version 29 Apr 2022
 */
public class RecursionCount {
	
	public static int k = 1;
	public static int x = 0;
	
	
	/**
	 * Counts recursively
	 * @return counted result
	 */
	public static int laske(int n) {
		if (n <= 1)
	      return 0;
		
	    for (int i = 0; i < k; i++) {
		      x = 2*laske(n/4);
	    }

	    for (int j = 1; j <= n; j++) {
		      x = x + j;
	    }

	    return x;
    }

	
	/**
	 * Main for testing
	 * @param args not in use
	 */
	public static void main(String[] args) {
		
		int tulos = 0;
		for (int i = 0; i < 20; i++) {
			tulos = laske(i);
			System.out.println("Numerolla " + i + " tulos on " + tulos);
		}


	}

}
