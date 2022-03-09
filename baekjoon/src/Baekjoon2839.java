import java.util.Scanner;

public class Baekjoon2839 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int rem = num;
		int a = 0;
		int ans = -1;
		for (int i = 0; i <= num/5; i++) {
			a=i;
			num = num-5*i;
			if(num%3==0) {
				a+=num/3;
			}else {
				a = -1;
			}
			if(ans==-1) {
				ans = a;
			}else {
				if(a!=-1)
					ans = Math.min(ans, a);				
			}
			num = rem;
		}
		System.out.println(ans);
	}
}
