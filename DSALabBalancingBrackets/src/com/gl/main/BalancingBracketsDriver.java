package com.gl.main;

import java.util.Scanner;
import java.util.Stack;

public class BalancingBracketsDriver {

	public static void main(String args[]) {

		// System.out.println("Enter the Input String: ");
		// Scanner scanner = new Scanner(System.in);
		// String inputString = scanner.nextLine();

		String inputString1 = "([[{}]])";
		String inputString2 = "([[{}]]))";

		isBalancedBrackets(inputString1);
		isBalancedBrackets(inputString2);

		// scanner.close();
	}

	public static void isBalancedBrackets(String inputString) {

		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < inputString.length(); i++) {

			char charValue = inputString.charAt(i);
			if (charValue == '(' || charValue == '[' || charValue == '{')
				stack.push(charValue);

			else {
				if (stack.isEmpty()) {
					System.out.println("The entered String " + inputString + " is not Balanced!!!");
					return;
				}
				char topChar = stack.peek();
				if ((topChar == '(' && charValue == ')') || (topChar == '{' && charValue == '}')
						|| (topChar == '[' && charValue == ']')) {
					stack.pop();
				}
			}
		}

		if (stack.isEmpty()) {
			System.out.println("The entered String " + inputString + " has Balanced Brackets!!!");
		} else {
			System.out.println("Sorry!! The entered String do no contain Balanced Brackets!!!");
		}

	}
}
