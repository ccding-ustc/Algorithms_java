package newcoder;

/**
 * 实现《剑指offer》第三版 所有问题实例
 * @author ccding
 * @date 2017/06/13
 *
 */
public class JustForOffer3th {
	
	/**
	 * 请实现一个函数，将一个字符串中的空格替换成“%20”。
	 * 例如，当字符串为We Are Happy.
	 * 则经过替换之后的字符串为We%20Are%20Happy。
	 * @param str
	 * @return
	 */
	public String replaceSpace(StringBuffer str) {
    	StringBuffer sb = new StringBuffer();
        for(int i=0; i<str.length(); i++)
            if(str.charAt(i) == ' ')
                sb.append("%20");
        	else
                sb.append(str.charAt(i));
        return sb.toString();
    }
}
