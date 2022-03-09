import java.util.Scanner;

public class Baekjoon1157 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		word = word.toUpperCase();
		char[] arr = word.toCharArray();
		int[] count = new int[26];
		for (int i = 0; i < arr.length; i++) {
			count[arr[i]-'A']++;
		}


		int max = 0;
		int maxid = 0;
		for (int i = 0; i < count.length; i++) {
			if(max<count[i]) {
				max =count[i];
				maxid = i;
			}
			
		}

		int cnt = 0;
		for (int i = 0; i < count.length; i++) {
			if(max==count[i])
				cnt++;
		}
		if(cnt>1) {
			System.out.println("?");
		}else {
			System.out.println((char) (maxid+'A'));
		}
	}
}
