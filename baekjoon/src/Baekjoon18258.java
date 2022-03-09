

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon18258 {
	static int startIndex = 0;
	static int endIndex = -1;

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int com = Integer.parseInt(br.readLine());
		int[] queue = new int[com];
		StringBuilder sb =  new StringBuilder();

		
		for (int i = 0; i < com; i++) {
			String command = br.readLine();
			if (command.contains("push")) {
				
				String strnum = command.replaceAll("[^\\d]","");
				int num = Integer.parseInt(strnum);
				push(queue,num);
				
			} else if (command.equals("front")) {
				sb.append(front(queue)).append("\n");
				
			} else if (command.equals("size")) {
				sb.append(size(queue)).append("\n");
			} else if (command.equals("pop")) {
				sb.append(pop(queue)).append("\n");
			} else if (command.equals("empty")){
				sb.append(isEmpty(queue)).append("\n");
			}else if (command.equals("back")) {
				sb.append(back(queue)).append("\n");
			}
		}
		System.out.println(sb);
	}

	public static void push(int[] queue, int num) {
		queue[++endIndex] = num;
	}

	public static int pop(int[] queue) {
		if(endIndex==-1) {
			
			return -1;
			
		}else {
			
			int rem = queue[startIndex];
			
			if(startIndex==endIndex) {
				endIndex=-1;
				startIndex=-1;
			}else if(startIndex!=endIndex-1) {
				endIndex--;
			}
			startIndex++;
			return rem;
			
		}
	}

	public static int size(int[] queue) {
		if (endIndex==-1) {
			return 0;
		}
		return endIndex-startIndex+1;
	}

	public static int isEmpty(int[] queue) {
		if(endIndex==-1) {
			return 1;
		}else {
			return 0;
		}
	}

	public static int front(int[] queue) {
		if(endIndex==-1) {
			return -1;
		}else {
			
			return queue[startIndex];
		}
	}
	
	public static int back(int[] queue) {
		if(endIndex == -1) {
			return -1;
		}else {
			return queue[endIndex];
		}
	}
}
