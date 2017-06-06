package leetcode;

/**
  * Given two strings s and t, determine if they are isomorphic.
  * Two strings are isomorphic if the characters in s can be replaced to get t.
  * All occurrences of a character must be replaced with another character while 
  * preserving the order of characters. No two characters may map to the same character
  *  but a character may map to itself.
  *  For example,
  *  Given "egg", "add", return true.
  *  Given "foo", "bar", return false.
  *  Given "paper", "title", return true.
  * @author ccding
  *
 */
public class Problem205_IsomorphicStrings {
	 public boolean isIsomorphic(String s, String t){
		 if(s.length() != t.length())
			 return false;
		 int len = s.length();
		 int[] sTot = new int[256];
		 int[] tTos = new int[256];
		 for(int i=0; i<len; i++){
			 if(sTot[s.charAt(i)] == 0 && tTos[t.charAt(i)] == 0){
				 sTot[s.charAt(i)] = t.charAt(i);
				 tTos[t.charAt(i)] = s.charAt(i);
			 }else{
				 if(sTot[s.charAt(i)] != t.charAt(i) || tTos[t.charAt(i)] != s.charAt(i))
					 return false;
			 }
		 } 
		 return true;
	 }
}
