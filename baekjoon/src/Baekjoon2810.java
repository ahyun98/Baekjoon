import java.util.Scanner;
import java.util.Stack;

public class Baekjoon2810 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.next();
		String word = sc.next();
		Stack<Character> cup = new Stack<>();
		int ans = 0;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if(ch=='S') {
				if(cup.isEmpty()) {
					cup.push('*');
					cup.push('S');
				}else if(cup.peek()=='*'){
					cup.push('S');
					cup.push('*');
				}else {
					cup.push('*');
					cup.push('S');
				}
				
			}else if(ch=='L') {
				if(cup.isEmpty()) {
					cup.push('*');
					cup.push('L');
				}else if(cup.peek()=='L') {
					cup.push('L');
					cup.push('*');
				}else if(cup.peek()=='*') {
					cup.push('L');
				}else {
					cup.push('*');
					cup.push('L');
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		while(!cup.isEmpty()) {
			if(cup.pop()=='*')
				ans++;
//			sb.append(cup.pop());
		}
		System.out.println(ans);
//		System.out.println(sb);
	}
}
