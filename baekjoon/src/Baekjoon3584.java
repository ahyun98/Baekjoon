import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Baekjoon3584 {
	static int[][] tree;
	static int a;
	static int b;
	static ArrayList<Integer> route = new ArrayList<>();
	static ArrayList<Integer> aRoute;
	static ArrayList<Integer> bRoute;
	static int size;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			int V = Integer.parseInt(br.readLine());
			tree = new int[V][2];
			size = V;
			st = new StringTokenizer(br.readLine());
			for (int i = 1; i <= V-1; i++) {
				int id = Integer.parseInt(st.nextToken());
				if (tree[id][0] == 0) {
					tree[id][0] = Integer.parseInt(st.nextToken());
				}else {
					tree[id][1] = Integer.parseInt(st.nextToken());
				}
			}
			a = Integer.parseInt(br.readLine()); //찾는 숫자 1
			b = Integer.parseInt(br.readLine()); //찾는 숫자 2
			
//			for (int i = 0; i < V; i++) {
//				System.out.print(i+"인덱스 : [");
//				for (int j = 0; j < 2; j++) {
//					System.out.print(+tree[i][j]+" ");
//				}
//				System.out.println("]");
//			}
			route(route,1);
			System.out.println(aRoute);
//			System.out.println(aRoute);
			System.out.println(bRoute);
			for (int i = aRoute.size()-1; i >= 0; i--) {
				if(bRoute.contains(aRoute.get(i))) {
					System.out.println(aRoute.get(i));
					break;
				}
			}
		}
	}
	public static void route(ArrayList<Integer> route, int here) {
		route.add(here);
		if(here == a) {//만약에 원하는 위치에 도달했다면
			aRoute = new ArrayList<>(route);

		}else if(here == b) {
			bRoute = new ArrayList<>(route);
		}
//		System.out.println(here);
//		System.out.println(route);
		
		if(here >= tree.length || tree[here][0] == 0 && tree[here][1]==0) { //더이상 내려갈 곳 없으면
			return;
		}
		
		if(tree[here][0] != 0) {
			route(route,tree[here][0]); //왼쪽으로 이동			
			route.remove(route.size()-1); //방금 넣은거 빼기
		}
		if(tree[here][1] != 0) {
			route(route,tree[here][1]);			
			route.remove(route.size()-1); //방금 넣은거 빼기
		}
		
	}
	public static void left(int a) {
		route(route,a);
		route.remove(route.size()-1);
	}
}
