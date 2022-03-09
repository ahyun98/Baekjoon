import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Baekjoon17413 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();
		Stack<Character> stack = new Stack<>();
		Stack<Character> tag = new Stack<>();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if((ch>='a' && ch<='z') ||(ch>='0' && ch<='9')) {
				stack.push(ch);
			}else if(ch=='<') {
				while(!stack.isEmpty()) {
					sb.append(stack.pop());
				}
				stack.push(ch);
			}else if(ch=='>') {
				tag.push(ch);
				while(stack.peek()!='<') {
					tag.push(stack.pop());
				}
				tag.push(stack.pop());
				while(!tag.isEmpty()) {
					sb.append(tag.pop());
				}
			}else if(ch==' ') {
				if(stack.contains('<')) {
					stack.push(ch);
				}else {
					while(!stack.isEmpty()) {
						sb.append(stack.pop());
					}
					sb.append(" ");
				}
			}
		}
		while(!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		System.out.println(sb);
	}
}
