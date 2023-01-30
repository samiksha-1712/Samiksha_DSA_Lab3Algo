package com.greatLearning.LabSession3;

import java.util.Stack;

public class BalancingBrackets {

	// Function to check if brackets are balanced
	static boolean checkingBracketsBalanced(String bracketExpression) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < bracketExpression.length(); i++) {
			char character = bracketExpression.charAt(i);
			if (character == '(' || character == '[' || character == '{') {
				stack.push(character);
				continue;
			}
			if (stack.isEmpty())
				return false;
			char c;
			switch (character) {
			case '}':
				c = stack.pop();
				if (c == '(' || c == '[')
					return false;
				break;
			case ')':
				c = stack.pop();
				if (c == '[' || c == '{')
					return false;
				break;
			case ']':
				c = stack.pop();
				if (c == '(' || c == '{')
					return false;
				break;
			}
		}
		return (stack.isEmpty());
	}

	// Main Method
	public static void main(String[] args) {
		// String bracketExpression = "([[{}]])"; // Sample input 1
		String bracketExpression = "([[{}]]))"; // Sample input 2
		Boolean result;
		result = checkingBracketsBalanced(bracketExpression);
		if (result)
			System.out.println("The entered String has Balanced Brackets");
		else
			System.out.println("The entered String do not contain Balanced Brackets");
	}
}
