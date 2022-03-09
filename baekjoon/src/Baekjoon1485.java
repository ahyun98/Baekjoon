

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon1485 {
	public static void main(String[] args) {
		int[][] locationList = new int[4][2];
		Scanner sc = new Scanner(System.in);
		int iter = sc.nextInt();
		double[] len = new double[6];
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<iter; i++) {
			int a = 0;
			for (int j=0; j<4; j++) {
				for(int k=0; k<2; k++) {
					locationList[j][k]=sc.nextInt();
				}
			}
			
			for(int k=0; k<3; k++){
				for(int t=k+1; t<4; t++) {
					int xlen = Math.abs(locationList[k][0]-locationList[t][0]);
					int ylen = Math.abs(locationList[k][1]-locationList[t][1]);
					len[a] = Math.sqrt(xlen*xlen+ylen*ylen);
					a++;
				}
			}
			Arrays.sort(len);
			if(len[0]==len[1] && len[1]==len[2] && len[2]==len[3] && len[4]==len[5]) {
				sb.append(1).append("\n");
			}else {
				sb.append(0).append("\n");
			}

		}
		System.out.println(sb);
		
	}
}
//			int minX = Integer.MAX_VALUE;
//			int maxX = Integer.MIN_VALUE;
//			int minY = Integer.MAX_VALUE;
//			int maxY = Integer.MIN_VALUE;
//			for (int j = 0; j <4; j++) {
//				if(minX>locationList[j][0]) {
//					minX = locationList[j][0];
//					minY = locationList[j][1];
//				}else if(maxX<locationList[j][0]) {
//					maxX = locationList[j][0];
//					minY = locationList[j][1];
//				}
//			}
//			System.out.println(minX);
//			System.out.println(minY);
//			System.out.println(maxY);
//			System.out.println(maxX);
//			for(int k=0; k<4; k++){
//				for(int t=0;t<2; t++) {
//					System.out.print(locationList[k][t]+" ");
//				}
//				System.out.println();
//			}
//			for (double d : len) {
//				System.out.println(d);
//			}
			
