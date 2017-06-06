package leetcode;

import java.util.Stack;

public class Problem150_EvaluateRPN {
    public static int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        for(String str: tokens){
            if(str.equals("+")||str.equals("-")||str.equals("*")||str.equals("/")){
                int op2 = s.pop();
                int op1 = s.pop();
            	switch(str){
                case "+":
                	s.push(op1 + op2);
                	break;
                case "-":
                	s.push(op1 - op2);
                	break;
                case "*":
                	s.push(op1 * op2);
                	break;
                case "/":
                	s.push(op1 / op2);
                	break;
				}
            }else{
                s.push(Integer.parseInt(str));
			}
		}
        return s.peek();
    }
}
