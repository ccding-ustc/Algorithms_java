package leetcode;

/**
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * And then read line by line: "PAHNAPLSIIGYIR"
 * Write the code that will take a string and make this conversion given a number of rows:
 * string convert(string text, int nRows);
 * convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
 * @author ccding
 *
 */
public class Problem006_ZigZagConversion {
	public String convert(String s, int numRows) {
		 StringBuilder[] sbs = new StringBuilder[numRows];
		 int len = s.length();
		 for(int i=0; i<numRows; i++)
			 sbs[i] = new StringBuilder();
		 int idx = 0;
		 while(idx < len){
			 for(int i=0; i<numRows&&idx<len; i++){
				 sbs[i].append(s.charAt(idx++));
			 }
			 for(int i=numRows-2; i>=1&&idx<len; i--){
				 sbs[i].append(s.charAt(idx++));
			 }
		 }
		 for(int i=1; i<numRows; i++)
			 sbs[0].append(sbs[i]);
		 return sbs[0].toString();
	 }
}
