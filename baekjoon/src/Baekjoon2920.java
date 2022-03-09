import java.util.Scanner;

public class Baekjoon2920 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[8];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int asc = 0;
		int desc= 0;
		for (int i = 1; i <=8; i++) {
			if(arr[i-1] == i) {
				asc++;
			}else if(arr[i-1]==9-i) {
				desc++;
			}
		}
		if(asc==8) {
			System.out.println("ascending");
		}else if(desc==8) {
			System.out.println("descending");
		}else {
			System.out.println("mixed");
		}
	}
}
