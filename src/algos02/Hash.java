/**
 * Simple Hash functions (Finn. hajautus), where
 * [0] = free (VAPAA)
 * [-1] = deleted (POISTETTU)
 */
package algos02;

import java.util.Arrays;

/**
 * @author Antiik.dev
 * @version 6 April 2022
 */
public class Hash {
	
	public int m = 20;				// array size (m >= n)
	public int n = 0;				// amount of numbers
	public int[] t = new int[m];	// hash table

	
	/**
	 * Initialize empty array with free index
	 * zero markings t[0]
	 */
	public Hash() {
		for (int i = 0; i < m; i++) {
			t[i] = 0;
		}
	}
	
	
	/**
	 * Hash function with open address creation
	 * (hajautusfunktio avoimella osoitteenmuodostuksella)
	 * @param k number to same index
	 * TODO POSSIBLE: yksikasitteisyys; is k already saved
	 */
	private void h(int k) {
		if ( this.n > this.m ) return;	// 1. m >= n
		if ( t[k] == 0 ) {				// 2. first index h(k)
			t[k] = k;
			n++;
			return;
		}
		for (int i = k+1; i < m; i++) {	// 3. h(k,i), i=0,1,2,...,
			if ( t[i] == 0 ) {
				t[i] = k;
				n++;
				break;
			}
		}								// if not found, not saved
	}
	
	
	/**
	 * @return Hash table to string
	 */
	public void print() {
		System.out.println(Arrays.toString(t));
	}
	
	
	// TODO: Search (etsi)
	
	// TODO: Delete (poista)
	
	
	/**
	 * Main for testing
	 * @param args not in use
	 */
	public static void main(String[] args) {
		Hash haja = new Hash();
		
		System.out.println("Hash array before add:");
		haja.print();
		
		haja.h(1);
		System.out.println("Hash array after add:");
		haja.print();
	}

}
