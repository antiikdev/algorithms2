/**
 * Hash where method hlinear contains options for
 * linear, square and double hash search 
 */
package algos02;

import java.util.Arrays;

/**
 * @author Antiik.dev
 * @version 6 April 2022
 */
public class HashSearch {
	
	// [0] = free (VAPAA)
	// [-1] = deleted (POISTETTU)
	public int m = 10;				// array max size (m >= n)
	public int n = 0;				// amount of numbers saved in the array
	public int[] t = new int[m];	// hash table with max (m)

	
	/**
	 * Initialize empty array with free index
	 * zero markings t[0]
	 */
	public HashSearch() {
		for (int i = 0; i < m; i++) {
			t[i] = 0;
		}
	}
	
	
	/**
	 * ADD Hash function with open address creation
	 * Finn. LISAA hajautusfunktio avoimella osoitteenmuodostuksella
	 * @param k added number
	 */
	private void add(int k) {
		if ( this.n > this.m ) return;	// 1. m >= n
		
		for (int i = 0; i < m; i++) {	// 2. h(k,i), i=0,1,2,...,
			int hash = hLinear(k, i);
			if ( t[hash] == 0 ) {
				t[hash] = k;
				n++;
				break;
			}
		}							
	}
	
	
	/**
	 * Hash linear search
	 * @param key being searched
	 * @return index of the number if found, -1 if not found
	 */
	public int search(int key) {
		int index = -1;
		
		for (int i = 0; i < this.m; i++) {
			int hash = hLinear(key, i);
			if ( this.t[hash] == key ) return hash;
			// If free slot 0, then key does not exist:
			if ( this.t[hash] == 0 ) break;
		}
		return index;
	}
	
	
	/**
	 * Delete index from hash table
	 * If found key is found
	 * @param key being deleted¨
	 */
	public void delete(int key) {
		int search = search(key);
		if (search >= 0 ) {
			this.t[search] = -1;
			n--;
		}
	}
	
	/**
	 * Linear search // AND // Square and double hash options
	 * @param key hash
	 * @param i number
	 * @return key+i mod m
	 */
	public int hLinear(int key, int i) {
		// Linear search:
		// return (key + i) % this.m;
		
		// Square search h(k,i)=(h(k)+i^2)\mod m,
		// return (key + i * i) % this.m;
		
		// double hash: h(k,i)=(h_1(k) + i * h_2(k)) mod m, where
		// h_1(k)=h(k) AND h_2(k)=7-(k mod 7).
		return (key + (7 - i * (key % 7))) % this.m;
	}
	
	
	/**
	 * @return Prints hash array to string
	 */
	public void print() {
		System.out.println(Arrays.toString(t));
	}
	
	
	/**
	 * Main for testing
	 * @param args not in use
	 */
	public static void main(String[] args) {
		// New hash class
		HashSearch h = new HashSearch();
		int[] taulukko = { 21, 55, 31, 49, 52, 72, 26, 19 };
		
		// Add taulukko array's numbers
		System.out.println("---------- Search ---------");
		for (int i = 0; i < taulukko.length; i++) {
			h.add(taulukko[i]);
			System.out.print("Kun lisatty " + taulukko[i] + ": ");
			h.print();
		}
		
	}

}
