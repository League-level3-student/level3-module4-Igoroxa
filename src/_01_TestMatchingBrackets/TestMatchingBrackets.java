package _01_TestMatchingBrackets;

import java.util.Stack;

public class TestMatchingBrackets {
	/*
	 * Use a Stack to complete the method for checking if every opening bracket has
	 * a matching closing bracket
	 */
	public static boolean doBracketsMatch(String b) {
		Stack<Character> chars = new Stack<Character>();
		for (int i = 0; i < b.length(); i++) {
			if (b.charAt(i) == '{') {

				chars.push(b.charAt(i));
			}
			if (b.charAt(i) == '}') {
				if (chars.isEmpty()) {
					return false;
				}
				else {
				chars.pop();
				}
			}
				
					if (chars.isEmpty()) {
					return true;
				}
				
			}

		return false;
	}
}