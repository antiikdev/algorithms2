/**
 * Counts how many letters two stings have in common.
 */
package algos04;

/**
 * @author Antiik.dev (Ilkka Kotilainen)
 * @version 28 Apr 2022
 */
public class CountLetters {
	
	
	/**
	 * Counts common letters in two strings
	 * Note: each letter can only present once in each string
	 * @param a first string
	 * @param b second string
	 * @return common letters in a and b
	 */
	public static String commonLetters(String a, String b) {
		char[] t1 = a.toCharArray();
		char[] t2 = b.toCharArray();
		String sameLetters = "";
		
		for (int i = 0; i < t1.length; i++) {
			for (int j = 0; j < t2.length; j++) {
				if ( t1[i] == t2[j] ) sameLetters = sameLetters + t1[i];
			}
		}
		return sameLetters;
	}
	

	/**
	 * Main for testing
	 * @param args not in use
	 */
	public static void main(String[] args) {
		
		// Strings a and b
		String a = "CEHLNP";
		String b = "ABENPS";
		String result;
		
		result = commonLetters(a,b);
		System.out.println("String a: " + a);
		System.out.println("String b: " + b);
		System.out.println("Same letters: " + result);
		
		System.out.println();
		
		// Strings c and d
		String c = "AFKPRW";
		String d = "ADFKORT";
		
		String tulos = commonLetters(c,d);
		System.out.println("String a: " + c);
		System.out.println("String b: " + d);
		System.out.println("Same letters: " + tulos);
	}

}
