

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Baekjoon1935 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		for (int tc = 1; tc <= 1; tc++) {
			int num = sc.nextInt();
			int[] alphabet = new int[26];
			
			String expr = sc.next();
			for (int i = 0; i < num; i++) {
				alphabet[i] = sc.nextInt();
			}
			
			StringBuilder sb = new StringBuilder();
			Stack<Character> stack = new Stack<>();

//			for (int i = 0; i < expr.length(); i++) {
//				char ch = expr.charAt(i);
//				if (Character.isUpperCase(ch)) {
//					sb.append(ch);
//				} else if (ch == '+') {
//					if (stack.isEmpty()) {
//						stack.push(ch);
//					} else {
//						while (!stack.isEmpty()) {
//							if (stack.peek() == '(') {
//								stack.push(ch);
//								break;
//							} else {
//								sb.append(stack.pop());
//
//							}
//						}
//						if (stack.isEmpty()) {
//							stack.push(ch);
//						}
//					}
//				} else if (ch == '-') {
//					if (stack.isEmpty()) {
//						stack.push(ch);
//					} else {
//						while (!stack.isEmpty()) {
//							if (stack.peek() == '(') {
//								stack.push(ch);
//								break;
//							} else {
//								sb.append(stack.pop());
//
//							}
//						}
//						if (stack.isEmpty()) {
//							stack.push(ch);
//						}
//					}
//				} else if (ch == '*') {
//					while (!stack.isEmpty()) {
//						if (stack.peek() == '/' || stack.peek()=='*') {
//							sb.append(stack.pop());
//						} else {
//							stack.push(ch);
//							break;
//						}
//					}
//					if(stack.isEmpty()) {
//						stack.push(ch);
//					}
//
//				} else if (ch == '/') {
//					while (!stack.isEmpty()) {
//						if (stack.peek() == '/' || stack.peek()=='*') {
//							sb.append(stack.pop());
//						} else {
//							stack.push(ch);
//							break;
//						}
//					}
//					
//					if(stack.isEmpty()) {
//						stack.push(ch);
//					}
//				} else if (ch == '(') {
//					stack.push(ch);
//
//				} else if (ch == ')') {
//					while (!stack.isEmpty()) {
//						if (stack.peek() == '(') {
//							stack.pop();
//							break;
//						} else {
//							sb.append(stack.pop());
//						}
//					}
//
//				}
//			}
//			while (!stack.isEmpty())
//				sb.append(stack.pop());
//			String postFixExpr = sb.toString();
//
//			System.out.println(postFixExpr);
			
			Stack<Double> calStack = new Stack<>();
			for (int i = 0; i < expr.length(); i++) {
				char ch = expr.charAt(i);
				if (Character.isUpperCase(ch)) {
					calStack.push((double) alphabet[ch-65]);
				} else {
					double num2 = calStack.pop();
					double num1 = calStack.pop();
					double result = 0;
					switch (ch) {
					case '+':
						result = num1 + num2;
						break;
					case '*':
						result = num1 * num2;
						break;
					case '/':
						result = num1 / num2;
						break;
					case '-':
						result = num1 - num2;
						break;
					}
					calStack.push(result);
				}
			}

			System.out.format("%.2f", calStack.pop());
		}
	}
}
