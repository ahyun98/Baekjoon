

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Baekjoon1620 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int poketmon = Integer.parseInt(st.nextToken());
		int problem = Integer.parseInt(st.nextToken());
		HashMap<String,Integer> pomap = new HashMap<>();
		String[] poList = new String[poketmon];
		for (int i = 0; i < poketmon; i++) {
			String a=br.readLine();
			poList[i]=(a);
			pomap.put(a, i+1);
		}
		
		
		for (int i = 0; i <problem; i++) {
			String pro = br.readLine();
			if(47<pro.charAt(0) && pro.charAt(0)<58) {
				sb.append(poList[(Integer.parseInt(pro)-1)]).append("\n");
			}else {
				if(pomap.containsKey(pro)) {
					sb.append(pomap.get(pro)).append("\n");
				}
			}
		}

		System.out.println(sb);
	}
}
