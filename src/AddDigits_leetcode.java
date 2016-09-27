
public class AddDigits_leetcode {
	public static int addDigits(int num){
		 int digit=0;
	        while(num != 0){
	            digit+=num%10;
	            if(digit>=10){
	                digit = 1 + digit%10;
	            }
	            num = num/10;
	        }
	        return digit;
	}
	public static int addDigits2(int num){
		return num==0 ? 0: (num-1)%9+1;
	}
}
