import java.util.Scanner;

public class Baekjoon1546 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double[] score = new double[N];
		for (int i = 0; i < score.length; i++) {
			score[i] = sc.nextDouble();
		}
		double max = 0;
		for (int i = 0; i < score.length; i++) {
			max = Math.max(max, score[i]);
		}
		double sum=0;
		for (int i = 0; i < score.length; i++) {
			score[i] = score[i]/max*100;
			sum += score[i];
		}
		System.out.println(sum/score.length);
	}
}
