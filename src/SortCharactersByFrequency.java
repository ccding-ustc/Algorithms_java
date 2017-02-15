

/**
 * 
 * @ClassName: SortCharactersByFrequency
 *
 * @Description: Given a string, sort it in decreasing
 *  order based on the frequency of characters.
 *
 * @author: ccding
 * @date: 2017年2月14日 上午8:50:36
 *
 */
public class SortCharactersByFrequency {
	public static String frequencySort(String s){
		char[] newChars = new char[256];
		int[] frequencies = new int[256];
		for(char c:s.toCharArray()){
			frequencies[c]++;
			newChars[c] = c;
		}
		for(int i=1; i<frequencies.length; i++){
			char tmpChar = newChars[i];
			int tmpFrequency = frequencies[i];
			int j = i-1;
			while(j>=0 && frequencies[j] < tmpFrequency){
				frequencies[j+1] = frequencies[j];
				newChars[j+1] = newChars[j];
				j--;
			}
			newChars[j+1] = tmpChar;
			frequencies[j+1] = tmpFrequency;
		}
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<frequencies.length; i++){
			if(frequencies[i] > 0){
				while(frequencies[i]-->0)
					sb.append(newChars[i]);
			}
		}
		return sb.toString();
	}
}
