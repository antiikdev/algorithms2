/**
 * Knapsack problem (Finn. kapsakkiongelma):
 * Choose goods (stuff) in such way that their overall usefull value (p)
 * is highest possible and the stuff weight (w) max. limit (W) is not exceeded.
 * Algorithm source: Algoritmit 1 Jyu
 * Example values and weights Wikipedia
 */
package algos04;

import java.util.Arrays;

/**
 * @author Antiik.dev
 * @version 29 Apr 2022
 */
public class Knapsack {
	
	public static int n = 4; // stuff amount to choose (tavaroiden lkm.)
	public static int[] p = { 4, 2, 1, 10, 2 }; // value (tavaran hyotyarvo)
	public static int[] w = { 12, 2, 1, 4, 1 }; // weight (tavaran paino)
	public static final int W = 15; // max. weight (maximi kokonaispainoraja)
	public static int[][] s = new int[n*W][n*W]; // calculated solutions (ratkaisut)

	
	/**
	 * Knapsack goods chosen
	 * @return sum of the usefull values (hyotyarvojen summa)
	 */
	public static int fillKnapsack() {
		// 1. 
		for (int r = 0; r <= W; r++) {
			s[0][r] = 0;
			}
		// 2.
		for (int k = 0; k <= n; k++) {
		     s[k][0] = 0;
		   }
		// 3. 
		for (int k = 1; k <= n; k++) {
		     for (int r = 1; r <= W; r++) {
		       if (w[k] > r) s[k][r] = s[k-1][r];
		       else s[k][r] = max(s[k-1][r], p[k] + s[k-1][r-w[k]]);
		       }
		     }
		// 5.sum of the usefull values (hyotyarvojen summa)
		return s[n][W];
	}
	
	
	/**
	 * @return max value
	 */
	public static int max(int a, int b) {
		if ( a > b ) return a;
		else return b;
	}
	
	
	/**
	 * Prints two dimensional array of the knapsack problem
	 * @param array printed
	 */
	public static void printArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if ( array[i][j] == 0 ) continue;	// skip empty ones
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
			if (i >= n) break;	// break if combinations checked
		}
	}
	
	
	/**
	 * Main for testing
	 * @param args not in use
	 */
	public static void main(String[] args) {
		
		System.out.println("There are " + n + " goods and weight limit is "
				+ W);
		System.out.print("Orig values:  ");
		System.out.print(Arrays.toString(p));
		System.out.println();
		System.out.print("Orig weights: ");
		System.out.print(Arrays.toString(w));
		System.out.println();
		
		int result = fillKnapsack();
		
		System.out.print("Trial of goods combinations: ");
		printArray(s);
		
		System.out.println("Sum of the goods usefull values "
				+ "in the knapsack: " + result);
	}

}
