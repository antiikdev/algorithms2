/**
 * Priority queue with operations
 * Includes Finnish language comments, methods and variables
 */
package algos01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Antiik.dev
 * @version 30 March 2022
 */
public class PriorityQueue {
	
	private static int n = 0;
	private static List<Integer> queue = new ArrayList<>();
	// Optional array:
	// private int MAX = 10;
	// private int[] array = new int[MAX];

	
	/**
	 * @return random int between 0 and 99
	 */
	public static int randomInt() {
		Random ran = new Random();
		return ran.nextInt(99);
	}
	
	
	/**
	 * Adds a new value
	 * @param value what added
	 */
	private static void lisaaAlkio(int value) {
		queue.add(value);
		n++;
	}
	
	
	/**
	 * Remvoes smallest value
	 * @return smallest removed value
	 */
	private static int poistaPienin() {
		int smallest = queue.get(0);
		int j = 0;
		
		for (int i = 1; i < n; i++) {
			if (queue.get(i) < smallest) {
				smallest = queue.get(i);
				j = i;
			}
		}
		queue.remove(j);
		n--;
		return smallest;
	}
	
	
	/**
	 * Check if the queue is empty
	 * @return true is empty, false if not
	 */
	private static boolean isEmpty() {
		if (n <= 0) return true;
		else return false;
	}
	
	
	/**
	 * Size of the queue, i.e. amount of numbers
	 * @return size
	 */
	private static int size() {
		return n;
	}
	
	
	/**
	 * Prints the queue
	 */
	private static void printQueue() {
		for (int i = 0; i < n; i++) {
			int s = queue.get(i);
			System.out.print(s + " ");
		}
		System.out.println();
	}
	
	
	/**
	 * Removes second smallest number and returns it
	 * @return second smallest number
	 */
	private static int poistaToiseksiPienin() {
		if ( queue.isEmpty() ) return 0;
		
		int[] taulu = new int[n-2]; // kaksi suurinta jaa
		int[] pienimmat = { Integer.MAX_VALUE, 0 };
		int[] indeksit = { 0, 0 };
		
		for (int i = 0; i < n; i++) {
			taulu[i] = poistaPienin();
			if (taulu[i] < pienimmat[0]) {
				// tallen. pienin, ja toiseksi pienin tauluun
				pienimmat[1] = pienimmat[0];
				pienimmat[0] = taulu[i];
				// tallen. pien. ja tois. pien. indeksit tauluun
				indeksit[1] = indeksit[0];
				indeksit[0] = i;
			}
			else if ( taulu[i] < pienimmat[1] ) {
				pienimmat[1] = taulu[i];
				indeksit[1] = i;
			}
		}
		
		// queue pituudesta yksi poistetaan
		n--;
		
		// Alkioiden palautus, paitsi ei toiseksi pieninta
		for (int i = 0; i < taulu.length; i++) {
			if ( i == indeksit[1] ) continue;
			lisaaAlkio(taulu[i]);
		}
		
		// Palautetaan poistettu toiseksi pienin arvo
		return pienimmat[1];
	}
	
	
	/**
	 * Main for testing
	 * @param args not in use
	 */
	public static void main(String[] args) {
		// --------- Testing PriorityQueue -------
		// Is the queue empty?
		// boolean b = isEmpty();
		// System.out.println("Queue is empty: " + b);
		
		// Add values and print value as well as size
		int addValues = 6;
		for (int i = 0; i < addValues; i++ ) {
			int random = randomInt();
			lisaaAlkio(random);
		}

		System.out.print("Content: "); printQueue();
		// System.out.print("Size of the queue: " + size() + "\n");
		
		/* Remove smallest
		int small = poistaPienin();
		System.out.println("Smallest removed was "+small);
		System.out.print("Content after removal: "); printQueue();
		*/
		
		
		// --- remove second smallest number ----
		int secondSmallest = poistaToiseksiPienin();
		System.out.println("Second smallest removed was " + secondSmallest);
		System.out.print("Content: "); printQueue();
	}

}
