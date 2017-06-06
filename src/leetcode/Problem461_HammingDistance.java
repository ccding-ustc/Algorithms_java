package leetcode;

/**
 * The Hamming distance between two integers is the number of 
 * positions at which the corresponding bits are different.
 * Given two integers x and y, calculate the Hamming distance.
 * Note: 0 <= x,y <= 2^31
 * @author ccding
 *
 */
public class Problem461_HammingDistance {
	public int hamingDistance(int x, int y){
		return Integer.bitCount(x^y);
	}
}
