

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Baekjoon10828 {
	static int index = -1;

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int com = Integer.parseInt(br.readLine());
		int[] stack = new int[com];
		StringBuilder sb =  new StringBuilder();

		
		for (int i = 0; i < com; i++) {
			String command = br.readLine();
			if (command.contains("push")) {
				
				String strnum = command.replaceAll("[^\\d]","");
				int num = Integer.parseInt(strnum);
				push(stack,num);
				
			} else if (command.equals("top")) {
				sb.append(top(stack)).append("\n");
				
			} else if (command.equals("size")) {
				sb.append(size(stack)).append("\n");
			} else if (command.equals("pop")) {
				sb.append(pop(stack)).append("\n");
			} else if (command.equals("empty")){
				sb.append(isEmpty(stack)).append("\n");
			}
		}
		System.out.println(sb);
	}

	public static void push(int[] stack, int num) {
		stack[++index] = num;
	}

	public static int pop(int[] stack) {
		if(index==-1) {
			return -1;
		}else {
			int rem = stack[index];
			stack[index] = 0;
			index--;
			return rem;
			
		}
	}

	public static int size(int[] stack) {
		return index+1;
	}

	public static int isEmpty(int[] stack) {
		if(index==-1) {
			return 1;
		}else {
			return 0;
		}
	}

	public static int top(int[] stack) {
		if(index==-1) {
			return -1;
		}else {
			return stack[index];
		}
	}

}
