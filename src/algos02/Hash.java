/**
 * Simple hash open addressing for positive integer numbers
 * Finn. hajautus positiivisille kokonaisluvuille
 * avoimella osoitteenmuodostuksella
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
	
	public int m = 6;				// array max size (m >= n)
	public int n = 0;				// amount of numbers saved in the array
	public int[] t = new int[m];	// hash table with max (m)

	
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
	 * Linear search
	 * @param key hash
	 * @param i number
	 * @return key+i mod m
	 */
	public int hLinear(int key, int i) {
		return (key + i) % this.m;
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
		Hash haja = new Hash();
		
		// Testing of empty hash array and print function
		System.out.print("Hash array before: ");
		haja.print();
		
		// Testing of hash add function 
		haja.add(1);
		haja.add(1);
		haja.add(2);
		System.out.print("Hash array after:  ");
		haja.print();
		
		// Testing search function
		int search = 2;
		int result = haja.search(2);
		System.out.println("Index of the number " + search +
				" (-1 if not found): " + result);
		search = 6;
		result = haja.search(7);
		System.out.println("Index of the number " + search +
				" (-1 if not found): " + result);
		
		// Testing delete function
		int del = 2;
		haja.delete(del);
		System.out.print("Number " + del + " deleted:  ");
		haja.print();
	}

}
