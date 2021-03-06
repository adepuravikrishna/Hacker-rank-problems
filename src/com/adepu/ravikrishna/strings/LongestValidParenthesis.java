package com.adepu.ravikrishna.strings;

import java.util.Stack;

public class LongestValidParenthesis {
	public int longestValidParentheses(String s) {
		if (s == null) {
			return 0;
		}
		int n = s.length();
		int max = 0;
		for (int i = 0; i <= n; i++) {
			for (int j = i + 1; j <= n; j++) {

				int temp = findMaxValid(s.substring(i, j));
				if (temp > max) {
					max = temp;
				}

			}

		}
		return max;

	}

	public int findMaxValid(String s) {
		char[] ch = s.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		int count = 0;
		for (char c : ch) {
			if (c == '(') {
				stack.push(')');
				count = count + 2;
			} else if (stack.isEmpty() || stack.pop() != c) {
				return 0;
			}
		}
		if (stack.isEmpty())
			return count;
		return 0;

	}

	public static void main(String[] args) {
		LongestValidParenthesis ls=new LongestValidParenthesis();
		String s="((())())(()))(()()(()(()))(()((((()))))))((()())()))()()(()(((((()()()())))()())(()()))((((((())))((()))()()))))(()))())))()))()())((()()))))(()(((((())))))()((()(()(())((((())(())((()()(()())))())(()(())()()))())(()()()))()(((()())(((()()())))(((()()()))(()()))()))()))))))())()()((()(())(()))()((()()()((())))()(((()())(()))())())))(((()))))())))()(())))()())))())()((()))((()))()))(((())((()()()(()((()((())))((()()))())(()()(()))))())((())))(()))()))))))()(()))())(()())))))(()))((())(()((())(((((()()()(()()())))(()())()((()(()()))(()(())((()((()))))))))(()(())()())()(()(()(()))()()()(()()())))(())(()((((()()))())))(())((()(())())))))())()()))(((())))())((()(()))(()()))((())(())))))(()(()((()((()()))))))(()()()(()()()(()(())()))()))(((()(())()())(()))())))(((()))())(()((()))(()((()()()(())()(()())()(())(()(()((((())()))(((()()(((()())(()()()(())()())())(()(()()((()))))()(()))))(((())))()()))(()))((()))))()()))))((((()(())()()()((()))((()))())())(()((()()())))))))()))(((()))))))(()())))(((()))((()))())))(((()(((())))())(()))))(((()(((((((((((((())(((()))((((())())()))())((((())(((())))())(((()))))()())()(())())(()))))()))()()()))(((((())()()((()))())(()))()()(()()))(())(()()))()))))(((())))))((()()(()()()()((())((((())())))))((((((()((()((())())(()((()))(()())())())(()(())(())(()((())((())))(())())))(()()())((((()))))((()(())(()(()())))))))))((()())()()))((()(((()((()))(((((()()()()()(()(()((()(()))(()(()((()()))))()(()()((((((()((()())()))((())()()(((((()(()))))()()((()())((()())()(())((()))()()(()))";
		int result= ls.longestValidParentheses(s);
		System.out.println(result);
		

	}

}
