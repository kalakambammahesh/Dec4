package com.inter;

import java.util.Scanner;
import java.util.Stack;

class InfixToPostFix {
	
	private static final Scanner sc = new Scanner(System.in);
	
	public static int prec(char c) {
		
		switch(c) {
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		case '^':
			return 3;
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		
		String expression = sc.nextLine();
		
		String result = new String("");
		
		int len = expression.length();
		
		
		
		Stack<Character> stack = new Stack<>();
		for(int i = 0;i < len;i++) {
			
			char c = expression.charAt(i);
			
			if(Character.isLetterOrDigit(c)) {
				result += c;
			}else if(c == '(') {
				stack.push(c);
			}else if(c == ')') {
				while(stack.peek() != '(' && !stack.isEmpty()) {
					result += stack.pop();
				}
				if(stack.peek() != '(' && !stack.isEmpty()) {
					System.out.println("INVALID EXP");
				}else {
					stack.pop();
				}
			}else { //operator
				while(!stack.isEmpty() && prec(c) <= prec(stack.peek())) {
					result += stack.pop();
				}
				stack.push(c);
			}
			
		}
		while(!stack.isEmpty()) {
			result += stack.pop();
		}
	System.out.println(result);
	}
	
}