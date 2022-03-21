import java.util.Scanner;

public class Baekjoon1747 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		boolean flag = true;
		int ans = N;
		String ansstr;
		while(flag) {
			if(ans == 1) {
				System.out.println(2);
				break;
			}
			if(primecheck(ans)) {
				ansstr = Integer.toString(ans);
				if(pelindrom(ansstr)) {
					System.out.println(ans);
					break;
				}
			}
			ans++;
		}
	}
	public static boolean primecheck(int num) {
		for (int i = 2; i * i <= num; i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean pelindrom(String str) {
		for (int i = 0; i < str.length()/2; i++) {
			if(str.charAt(i)!=str.charAt(str.length()-1-i)) {
				return false;
			}
		}
		return true;
	}
}
