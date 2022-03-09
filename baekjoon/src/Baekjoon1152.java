import java.util.Scanner;

public class Baekjoon1152 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		String[] arr = word.split(" ");
		int ans = arr.length;
		if (!word.equals(" ")) {
			if (arr[0].equals("")) {
				ans--;
			}
		}
		System.out.println(ans);
	}
}
