/**
 * Sorts integer array to order using heapsort
 */
package algos01;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Antiik.dev
 * @version 30 March 2022
 */
public class Heapsort {

	
	/**
	 * Enters random integers from range 0 to 99
	 * to an array with a size of ten
	 * @param a array where random number input
	 */
	public static void randomArray(int[] a) {
		if ( a.length <= 0 ) return;
		Random ran = new Random();
		for (int i = 0; i < a.length; i++) {
			a[i] = ran.nextInt(99);
		}
	}
	
	
	/**
	 * Heapsort's an integer array (Finn. kekolajittelu)
	 * @param a array with integer numbers
	 */
	public static void kekolajittelu(int[] a) {
		if ( a.length <= 0 ) return;
		int n = a.length-1;
		
		a[0] = n;
		teeKeko(a); // O(n)
		
		for (int i = n; i > 1; i--) {
			swap(a, a[1], a[i], i);
			a[0]--;
			korjaaKeko(a, 1); // O(log n)
			// Heapsort time complexity,
			// finn. kekolajittelun aikavaativuus: O(n log n)
		}
	}
	
	
	/**
	 * Swaps first and Nth integer of an array
	 * @param a array
	 * @param first array's first index integer
	 * @param i index of 2nd swap
	 */
	public static void swap(int[] a, int first, int j, int i) {
		if ( a.length <= 0 ) return;
		a[1] = j;
		a[i] = first;
	}
	
	
	/**
	 * Creates a heap in array
	 * Calls method "korjaaKeko"
	 * @param a heap array created
	 */
	public static void teeKeko(int[] a) {
		for (int i = a[0]/2; i >= 1; i--) {
			korjaaKeko(a, i);
		}
	}
	
	
	/**
	 * Fixes the heap order
	 * @param a array
	 * @param i 
	 */
	public static void korjaaKeko(int[] a, int i) {
		if (2*i > a[0]) return; // if i:ll‰ ei lapsia, ei tarvetta
		
		int j = 2*i;
		int alkio = a[i];
		// Siirret‰‰n alkiota kohti lehtisolmuja
		while (j <= a[0]) {
			if ((j < a[0]) && (a[j] > a[j+1])) j = j+1;
			if (alkio <= a[j]) break; // lopetetaan silmukka
			a[j/2] = a[j];
			j = 2*j;
		}
		a[j/2] = alkio;
	}
	
	
	/**
	 * Main for testing
	 * @param args not in use
	 */
	public static void main(String[] args) {
		// Taulukko, jossa satunnaisia kokonaislukuja
		// (engl. array with random integer numbers):
		int size = 10;
		int[] array = new int[size];
		randomArray(array);
		System.out.println("Before: "+Arrays.toString(array));
		
		// Kekolajittelu (engl. heapsort):
		kekolajittelu(array);
		System.out.println("After:  "+Arrays.toString(array));
	}

}
