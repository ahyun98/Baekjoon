import java.util.Scanner;

public class Baekjoon10809 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		int[] count = new int[26];
		for (int i = 0; i < count.length; i++) {
			count[i] = -1;
		}
		for (int i = 0; i < word.length(); i++) {
			if (count[word.charAt(i) - 'a'] == -1)
				count[word.charAt(i) - 'a'] = i;
		}

		for (int i : count) {
			System.out.print(i + " ");
		}
	}
}
