import java.util.Scanner;

public class Baekjoon2941 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		int ans = 0;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if ((i + 1 < word.length() && ch == 'c') && (word.charAt(i + 1) == '=' || word.charAt(i + 1) == '-')) {

			} else if ((i + 1 < word.length() && ch == 'd') && (word.charAt(i + 1) == '-')) {

			} else if((i+1<word.length()&&i+2<word.length()&&ch=='d') && (word.charAt(i+1)=='z') && (word.charAt(i+2)=='=')) {
				
			}else if((i + 1 < word.length() && ch == 'l') && 
					(word.charAt(i + 1) == 'j')) {
				
			}else if((i + 1 < word.length() && ch == 'n') && 
					(word.charAt(i + 1) == 'j')){
				
			}else if((i + 1 < word.length() && ch == 's') && 
					(word.charAt(i + 1) == '=')){
				
			}else if((i + 1 < word.length() && ch == 'z') && 
					(word.charAt(i + 1) == '=')) {
				
			}else {
				ans++;
			}
		}
		System.out.println(ans);
	}
}
