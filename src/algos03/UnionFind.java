/**
 * Disjoint sets union-find- operation with Strings
 * 
 * Set String items in albhabetical order and afterwards equal int numbers:
 *  {"kiuru", "lokki", "rastas", "sorsa", "varis"}
 * 	    1		  2	       3   		4		 5
 * ** Example: **
 * 1. array: -1, -1, -1, -1, -1
 * 2. union(1,2)
 * 3. tree:
 * 		1	3	4	5
 * 		2
 * 4. array: -2, 1, 3, 4, 5
 */
package algos03;

import java.util.Arrays;

/**
 * @author Antiik.dev
 * @version 20 April 2022
 */
public class UnionFind {
	
	private static int n = 6;
	private static int[] pvJoukko = new int[6];
	private static String[] jonot = {"kiuru", "lokki", "rastas", "sorsa", "varis"};

	
	/**
	 * Initialize DisjointSets
	 * node in array pvJoukko[0] is left empty (i=1)
	 */
	public UnionFind() {
		for (int i = 1; i < n; i++) {
			pvJoukko[i] = -1;
		}
	}
	
	
	/**
	 * Union of trees
	 * @param a node (Finn. solmu)
	 * @param b node (Finn. solmu)
	 */
	public void union(int a, int b) {
		// Oletus: a ja b juurisolmuja
		  int k;
		  k = pvJoukko[a] + pvJoukko[b];
		  if (pvJoukko[a] <= pvJoukko[b])
		  {
		    pvJoukko[a] = k;
		    pvJoukko[b] = a;
		  }
		  else
		  {
		    pvJoukko[b] = k;
		    pvJoukko[a] = b;
		  }
	}
	
	
	/**
	 * Find root node
	 * @param x node to be found
	 * @return found node
	 */
	public int find(int x) {
		  int j, k;
		  // Juurisolmun etsintä:
		  j = x;
		  while (pvJoukko[j] > 0) {
		    j = pvJoukko[j];
		  }
		  // Hakupolun tiivistys:
		  while (pvJoukko[x] > 0) {
		    k = x;
		    x = pvJoukko[x];
		    pvJoukko[k] = j;
		  }
		  return j;
		}
	
	
	/**
	 * Main for testing
	 * @param args not in use
	 */
	public static void main(String[] args) {
		UnionFind set = new UnionFind();
		System.out.println("Individual: " + Arrays.toString(pvJoukko));
		
		// TODO: union nimen perusteella, eli metodin luonti, jossa
		// nimen vaihto alkion indeksiksi
		set.union(1, 2);
		System.out.println("Union(2,6): " + Arrays.toString(pvJoukko));
		
		// TODO: vastaava kuin unionissa
		int x = set.find(5);
		System.out.println("Find 5's root node: " + x);
	}

}
