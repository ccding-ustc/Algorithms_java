package leetcode;

/**
 * Implement atoi to convert a string to an integer.
 * @author ccding
 *
 */
public class Problem008_StringToInteger {
	 public int myAtoi(String str){
		 str = str.trim();
		 if(str.length() == 0)
			 return 0;
		 int start = 0;
		 while(start < str.length() && (str.charAt(start)=='-'||str.charAt(start)=='+'))
			 start++;
		 if(start>1)
			 return 0;
		 int sign = 1;
		 if(str.charAt(0)=='-')
			 sign = -1;
		 long sum = 0;
		 for(int i=start; i<str.length(); i++){
			 if(str.charAt(i)>'9' || str.charAt(i)<'0')
				 break;
			 sum = sum*10 + (str.charAt(i)-'0');
			 if (sign == 1 && sum > Integer.MAX_VALUE)
					return Integer.MAX_VALUE;
			 if (sign == -1 && (-1) * sum < Integer.MIN_VALUE)
					return Integer.MIN_VALUE;
		 }
	
		 return (int)sum * sign;
	 }
}
