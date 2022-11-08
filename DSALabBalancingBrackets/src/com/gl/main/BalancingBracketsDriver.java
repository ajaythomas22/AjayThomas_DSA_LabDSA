package com.gl.main;

import java.util.Scanner;
import java.util.Stack;

public class BalancingBracketsDriver {

	public static void main(String args[]) {

		System.out.println("Enter the Input String: ");
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();

		isBalancedBrackets(inputString);

		scanner.close();
	}

	public static void isBalancedBrackets(String inputString) {

		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < inputString.length(); i++) {

			char charValue = inputString.charAt(i);
			if (charValue == '(' || charValue == '[' || charValue == '{')
				stack.push(charValue);

			else {
				if (stack.isEmpty()) {
					System.out.println("Input Expression is not Balanced!!!");
				}
				char topChar = stack.peek();
				if ((topChar == '(' && charValue == ')') || (topChar == '{' && charValue == '}')
						|| (topChar == '(' && charValue == ')')) {
					stack.pop();
				}
			}
		}

		if (stack.isEmpty())
			System.out.println("The entered String has Balanced Brackets!!!");

		else
			System.out.println("Sorry!! The entered String do no contain Balanced Brackets!!!");

	}
}
