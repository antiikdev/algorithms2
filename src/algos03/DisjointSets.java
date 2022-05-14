/**
 * Disjoint sets with union-find (Finn. alkiovieraita osajoukkoja)
 * ------------------------------------
 * 1. negative -number indicates that the node is a root node
 * 	and how many nodes it has (e.g. -3 means three nodes)
 * 2. positive numbers indicate on what root node
 * 	the node belongs to (e.g. 2 means belongs to root node 2)
 * 3. Set items (nodes) are { 1, 2, 3, 4, 5, 6, 7, 8 }
 */
package algos03;

import java.util.Arrays;

/**
 * @author Antiik.dev
 * @version 20 April 2022
 */
public class DisjointSets {
	
	private static int n = 9;
	private static int[] pvJoukko = new int[n];
	
	
	/**
	 * Initialize DisjointSets
	 * node in array pvJoukko[0] is left empty (i=1)
	 */
	public DisjointSets() {
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
		if (pvJoukko[a] <= pvJoukko[b]) {
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
	 * Main for tesing
	 * @param args not in use
	 */
	public static void main(String[] args) {
		DisjointSets set = new DisjointSets();
		System.out.println("Individual: " + Arrays.toString(pvJoukko));
		
		set.union(2,6);
		System.out.println("Union(2,6): " + Arrays.toString(pvJoukko));
		set.union(3,5);
		System.out.println("Union(3,5): " + Arrays.toString(pvJoukko));
		set.union(7,8);
		System.out.println("Union(7,8): " + Arrays.toString(pvJoukko));
		
		int x = set.find(5);
		System.out.println("Find 5's root node: " + x);
		System.out.println("After find: " + Arrays.toString(pvJoukko));
		
		set.union(1,4);
		System.out.println("Union(1,4): " + Arrays.toString(pvJoukko));
		set.union(1,3);
		System.out.println("Union(1,3): " + Arrays.toString(pvJoukko));
		set.union(2,7);
		System.out.println("Union(2,7): " + Arrays.toString(pvJoukko));
		set.union(1,2);
		System.out.println("Union(1,2): " + Arrays.toString(pvJoukko));
		
		// 
		x = set.find(8);
		System.out.println("Find 8's root node: " + x);
		System.out.println("After find: " + Arrays.toString(pvJoukko));
	}

}
