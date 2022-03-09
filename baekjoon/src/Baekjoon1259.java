import java.util.Scanner;

public class Baekjoon1259{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		while(true) {
			String word = sc.next();
			int i= Integer.parseInt(word);
			if(i==0) break;
			int half = word.length()/2;
			String flag = "yes";
			for (int j = 0; j < half; j++) {
				if(word.charAt(j)!=word.charAt(word.length()-1-j)) {
					flag="no";
					break;
				}
			}
			sb.append(flag).append("\n");
			
		}
		System.out.println(sb);
	}
}

