/**
 *  Heap (Finn. keko) using integer array
 */
package algos01;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Antiik.dev
 * @version 29 March 2022
 *
 */
public class Heap {
	
	// MAX size of array:
	static int MAXPQ = 11;
	
	
	/**
	 * Enters random integers from range 0 to 99
	 * to an array with a size of ten
	 * @param a array where random number input
	 */
	public static void randomHeapArray(int[] a) {
		if ( a.length <= 0 ) return;
		Random ran = new Random();
		for (int i = 1; i < a.length; i++) {
			a[i] = ran.nextInt(99);
		}
	}
	
	
	/**
	 * @return random int between 0 and 99
	 */
	public static int randomInt() {
		Random ran = new Random();
		return ran.nextInt(99);
	}
	
	
	/**
	 * Adds input to heap array
	 * @param a heap array
	 * @param alkio input to be added
	 */
	public static void lisaaKekoon(int[] a, int alkio) {
		if (a[0] >= MAXPQ) {
			// Taulukko on taynna
			// TODO mahdollinen: kasvata taulukon kokoa 
			return;
		}
		a[0]++;
		int i = a[0];
		// Alkion siirto kohti juurisolmua
		while ((i > 1) && (a[i/2] > alkio)) {
			a[i] = a[i/2];
			i = i / 2;
		}
		a[i] = alkio;
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
		if (2*i > a[0]) return; // i:ll‰ ei lapsia, ei tekoja
		
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
	 * Checks integer numbers priority order from an heap array
	 * by informing the last place for a number being in order
	 * @param a is heap array
	 */
	public static int checkHeapPriority(int[] a) {
		int result = 0;
		for (int i = a.length-1; i >= 1; i--) {
			if ( a[i] >= a[i/2] ) result = i;
		}
		return result;
	}
	
	
	/**
	 * Finds second smallest integer number from the heap
	 * @param a array
	 * @return second smallest int number
	 */
	public static int heapSecondSmallest(int[] a) {
		if ( a.length <= 0 ) return 0;
		int[] twoSmallest = { a[a.length-1], 0 };
		
		for (int i = a.length-1; i >= 1; i--) {
			if ( a[i] < twoSmallest[0] ) {
				twoSmallest[1] = twoSmallest[0];
				twoSmallest[0] = a[i];
			}
		}
		return twoSmallest[1];
	}
	
	
	/**
	 * Finds biggest number in heap array
	 * @param a is heap array
	 * @return biggest number in heap array
	 */
	public static int heapBiggest(int[] a) {
		if ( a.length <= 0 ) return 0;
		int biggest = a[1];
		
		for (int i = 2; i < a.length; i++) {
			if ( a[i] > biggest ) biggest = a[i];
		}
		return biggest;
	}
	
	
	/**
	 * Main for testing
	 * @param args not in use
	 */
	public static void main(String[] args) {
		// Random array
		int size = 11;
		int[] array = new int[size];
		randomHeapArray(array);
		
		// ----- Keon rakentaminen alkioiden syottovaiheessa ------
		// ---------------------------------------------------------
		// int[] array = { 0, 18, 5, 30, 22, 16, 15, 9, 7, 8, 21 };
		int[] heap = new int[11];
		System.out.print("Tyhja taulukko  : " + Arrays.toString(array)+"\n");
		
		// i = 1 as (heap's) array[0] is for its size
		int i = 1;
		while (i < array.length) {
			int alkio = array[i];
			lisaaKekoon(heap, alkio); // rakentaminen
			// array[i] = alkio; // ei-rakentaminen
			i++;
		}
		
		System.out.print("Keko rakennettu : "+Arrays.toString(heap)+"\n");
		
		
		// ---- Mihin paikkaan asti taulukon luvut muodostavat keon
		// (viimeinen paikka jossa luvut eivat jarjestyksessa) ----
		int result = checkHeapPriority(heap);
		System.out.println("Priority ends in index "+result);
		
		// ---- Keon toiseksi pienin alkio ----
		result = heapSecondSmallest(heap);
		System.out.println("Second smallest number is "+result);
		
		// ---- Keon suurin alkio ----
		result = heapBiggest(heap);
		System.out.println("Biggest number is "+result);
		System.out.println("----------------");
		
		
		// --------- Muodostetaan uusi keko -------
		// ----------------------------------------
		// lisaaKekoon-algoritmilla
		System.out.println("lisaaKekoon-algoritmia:");
		
		int[] taulukko = { 12, 20, 18, 4, 33, 26, 9, 17, 25, 13 };
		int[] keko = new int[11];
		System.out.print("Tyhja taulukko  : " + Arrays.toString(taulukko)+"\n");
		
		int j = 0;
		while (j < taulukko.length) {
			int alkio = taulukko[j];
			lisaaKekoon(keko, alkio); // rakentaminen
			j++;
		}
		System.out.print("Keko rakennettu : "+Arrays.toString(keko)+"\n");
		System.out.println("----------------");
	
		
		// teeKeko-algoritmilla
		System.out.println("teeKeko-algoritmilla:");
		// taulukko2[0] alkioiden lukumaara:
		int[] taulukko2 = { 10, 12, 20, 18, 4, 33, 26, 9, 17, 25, 13 };
		System.out.print("Jo lisatyt alkiot: " +
				Arrays.toString(taulukko2)+"\n");
		teeKeko(taulukko2);
		System.out.print("Keko rakennettu  : "+
				Arrays.toString(taulukko2));
		
	}

}
