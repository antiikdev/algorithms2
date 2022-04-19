/**
 * Set theory: Bit vector
 */
package algos03;

import java.util.Arrays;

/**
 * @author Antiik.dev
 * @version 19 April 2022
 */
public class BitVector {
	


	
	
	/**
	 * Adds x to set A
	 * @param A bit vector array
	 * @param x number, i.e. index added to the binary vector set
	 */
	public static void add(int[] A, int x) {
		int n = A.length;
		if ( n <= 0 || x > n-1 ) return;
		A[x] = 1;
	}
	
	
	/**
	 * Delete's x from set A
	 * @param A bit vector array
	 * @param x number, i.e. index deleted from the binary vector set
	 */
	public static void delete(int[] A, int x) {
		int n = A.length;
		if ( n <= 0 || x > n-1 ) return;
		A[x] = 0;
	}
	
	
	/**
	 * Does item belong to the set
	 * @param A bit vector array
	 * @param x number, i.e. index of the binary vector set
	 * @return true if belongs, false if not
	 */
	public static boolean itemBelong(int[] A, int x) {
		int n = A.length;
		if ( n <= 0 || x > n-1 ) return false;
		
		if ( A[x] == 1 ) return true;
		return false;
	}
	
	
	/**
	 * Interserction (Finn. leikkaus) A and B, i.e. A nn B:
	 * items that belong to both A and B
	 * @param A bit vector array
	 * @param B bit vector array
	 * @return new A nn B bit vector array
	 */
	public static int[] intersection(int[] A, int[] B) {
		int n1 = A.length;
		int n2 = B.length;
		if ( n1 <= 0 || n2 <= 0 ) return null;
		
		// if sets have length difference, select shortest n
		int n = n1;
		if (n2 < n1) n = n2;
		// new bit vector array with length n
		int[] C = new int[n];
		
		for (int i = 0; i < n; i++) {
			if ( A[i] == 1 &&  B[i] == 1 ) {
				C[i] = 1;
			}
		}
		return C;
	}
	
	
	/**
	 * Union (Finn. yhdiste) of A uu B bit vector arrays:
	 * items that belong to A and B or both
	 * @param A bit vector array
	 * @param B bit vector array
	 * @return new A uu B bit vector array
	 */
	public static int[] union(int[] A, int[] B) {
		int n1 = A.length;
		int n2 = B.length;
		if ( n1 <= 0 || n2 <= 0 ) return null;
		
		// if sets have length difference, select shortest n
		int n = n1;
		if (n2 < n1) n = n2;
		// new bit vector array with length n
		int[] C = new int[n];
		
		for (int i = 0; i < n; i++) {
			if ( A[i] == 1 ||  B[i] == 1 ) {
				C[i] = 1;
			}
		}
		return C;
	}
	
	
	/**
	 * Set difference (Finn. erotus) of A \ B:
	 * items that belong to A but not B
	 * @param A bit vector array
	 * @param B bit vector array
	 * @return new A uu B bit vector array
	 */
	public static int[] setDifference(int[] A, int[] B) {
		int n1 = A.length;
		int n2 = B.length;
		if ( n1 <= 0 || n2 <= 0 ) return null;
		
		// if sets have length difference, select shortest n
		int n = n1;
		if (n2 < n1) n = n2;
		// new bit vector array with length n
		int[] C = new int[n];
		
		for (int i = 0; i < n; i++) {
			if ( A[i] == 1 &&  B[i] != 1 ) {
				C[i] = 1;
			}
		}
		return C;
	}
	

	
// -----------------------------------------------------------------
	
	/**
	 * Main for testing
	 * @param args not in use
	 */
	public static void main(String[] args) {
		// numbers in the set (n = 5):
		int[] numbers = { 0, 2, 4, 6, 10 };
		// equal bit vector array as numbers (items) represented in the set:
		int[] A = { 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1 };
		System.out.print("Numbers: ");
		System.out.println(Arrays.toString(numbers));
		System.out.println();
		System.out.print("First:    ");
		System.out.println(Arrays.toString(A));
		
		// add x to set A
		int x = 1;
		add(A, x);
		System.out.print("Added 1 : ");
		System.out.println(Arrays.toString(A));
		System.out.println();
		
		// Delete number x from set A
		x = 2;
		delete(A, x);
		System.out.print("Delete 2: ");
		System.out.println(Arrays.toString(A));
		System.out.println();
		
		// Does item x belong to set A
		x = 4;
		boolean exists = itemBelong(A, x);
		System.out.println("Include " + x + "? " + exists);
		System.out.println();
		
		// Intersection A nn B (Finn. leikkaus): items that belong to both A and B
		int[] B = { 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1 };
		int[] C = intersection(A, B);
		System.out.print("Set A :   ");
		System.out.println(Arrays.toString(A));
		System.out.print("Set B :   ");
		System.out.println(Arrays.toString(B));
		System.out.print("C (AnnB): ");
		System.out.println(Arrays.toString(C));
		System.out.println();
		
		// Union A uu B (Finn. yhdiste): items that belong to A and B or both
		C = union(A, B);
		System.out.print("Set A :   ");
		System.out.println(Arrays.toString(A));
		System.out.print("Set B :   ");
		System.out.println(Arrays.toString(B));
		System.out.print("C (AuuB): ");
		System.out.println(Arrays.toString(C));
		System.out.println();
		
		// Set difference (Finn. erotus) A \ B: items that belong to A but not B
		C = setDifference(A, B);
		System.out.print("Set A :   ");
		System.out.println(Arrays.toString(A));
		System.out.print("Set B :   ");
		System.out.println(Arrays.toString(B));
		System.out.print("C (A\\B):  ");
		System.out.println(Arrays.toString(C));
		System.out.println();
	}

}
