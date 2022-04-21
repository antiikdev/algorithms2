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
 * 4. array: -2, 1, -1, -1, -1
 */
package algos03;

import java.util.ArrayList;

/**
 * @author Antiik.dev
 * @version 21 April 2022
 */
public class UnionFind {
	
	public ArrayList<Joukko> pvJoukko = new ArrayList<Joukko>();
	

// -------------------------------------------------------
// Joukko is a one item
// -------------------------------------------------------
	static class Joukko {
		
		int root;
		String name = "";
		
		
		/*
		 * Initializes Joukko
		 */
		public Joukko(int r, String j) {
			this.root = r;
			this.name = j;
		}
		
		
		/**
		 * @return root number
		 */
		public int getRoot() {
			return this.root;
		}
		
		
		/**
		 * Sets item root number
		 * @param num to be set
		 */
		public void setRoot(int num) {
			this.root = num;
		}
		
		
		/**
		 * Jono to String method
		 * @return Joukko as a String
		 */
		@Override
		public String toString() {
			return "" + this.root + " " + this.name;
		}
	}
// -------------------------------------------------------
// -------------------------------------------------------
	
	
	/**
	 * Union of trees
	 * @param p basic set of Joukkos
	 * @param a node (Finn. solmu)
	 * @param b node (Finn. solmu)
	 */
	public static void union(UnionFind p, int a, int b) {
		// Assumption: a and b are root nodes
		int k = 0;
		k = p.pvJoukko.get(a).getRoot() + p.pvJoukko.get(b).getRoot();
		
		if (p.pvJoukko.get(a).getRoot() <= p.pvJoukko.get(b).getRoot()) {
		    p.pvJoukko.get(a).setRoot(k);
		    p.pvJoukko.get(b).setRoot(a);
		    }
		else {
			p.pvJoukko.get(b).setRoot(k);
		    p.pvJoukko.get(a).setRoot(b);
		    }
	}

	
	/**
	 * Find root node
	 * @param x node to be found
	 * @return found node
	 */
	public static int find(UnionFind p, int x) {
		int j, k;
		// Find root node:
		j = x;
		while (p.pvJoukko.get(j).getRoot() > 0) {
			j = p.pvJoukko.get(j).getRoot();
			}
		// Search path comporession
		while (p.pvJoukko.get(x).getRoot() > 0) {
			k = x;
		    x = p.pvJoukko.get(x).getRoot();
		    p.pvJoukko.get(k).setRoot(j);
		    }
		return j;
	}
	
	
	/**
	 * Creates new set of UnionFind Joukkos
	 * NOTE: index (i) zero is null as not used in union-find
	 * @param p UnionFind object
	 * @param j Joukko object
	 */
	public static void createNewSet(UnionFind p, String j[]) {
		for (int i = 0; i < j.length; i++) {
			if ( i == 0 ) {
				p.pvJoukko.add(null);
			}
			p.pvJoukko.add(new Joukko(-1, j[i]));
		}
	}
	
	
// -------------------------------------------------------
// -------------------------------------------------------
	/**
	 * Main for testing
	 * @param args not in use
	 */
	public static void main(String[] args) {
		// Five new items created and saved
		UnionFind perusjoukko = new UnionFind();
		String[] jonot = {"kiuru", "lokki", "rastas", "sorsa", "varis"};
		createNewSet(perusjoukko, jonot);
		System.out.println("Individual nodes:     " + perusjoukko.pvJoukko.toString());
		
		// Union 
		// {"kiuru", "lokki", "rastas", "sorsa", "varis"};
		//		1		2		 3		   4		5
		System.out.println(" --- Union ---");
		union(perusjoukko, 1, 2);
		System.out.println("Union kiuru & lokki:  " + perusjoukko.pvJoukko.toString());
		
		union(perusjoukko, 1, 4);
		System.out.println("Union kiuru & sorsa:  " + perusjoukko.pvJoukko.toString());
		
		union(perusjoukko, 3, 5);
		System.out.println("Union rastas & varis: " + perusjoukko.pvJoukko.toString());
		
		// Find
		System.out.println(" --- Find ---");
		int x = find(perusjoukko, 1);
		System.out.print("Water birds root nodes:  ");
		System.out.print("kiuru " + x + ", ");
		x = find (perusjoukko, 2);
		System.out.print("lokki " + x + " and ");
		x = find (perusjoukko, 4);
		System.out.print("sorsa " + x + ".");
		System.out.println();
		
		System.out.print("Forest birds root nodes: ");
		x = find (perusjoukko, 3);
		System.out.print("rastas " + x + ", ");
		x = find (perusjoukko, 5);
		System.out.print("varis " + x + ".");
		System.out.println();
	}

}
