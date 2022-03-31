import java.util.Scanner;

public class Baekjoon18017 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = 299792458.0;
		System.out.printf("%.15f%n",(a + b) / (1 + (a * b) / (c * c)));
	}
}
