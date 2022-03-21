import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Baekjoon11000 {
	// 우선순위큐로 해결하는 문제
	// 먼저 입력값들을 받아서 시작시간 순으로(같다면  end시간) 정렬하자 
	// 우선순위큐에 넣어서 비교함
	// 우선순위큐에는 end시간만 넣을 것이고 새로 넣으려는 강의의 시작 시간이 맨 아래 있는 값(peek)의 end시간보다 작을 경우에 쌓는다(강의실을 하나 더 연다는 뜻)
	// 새로 넣으려는 강의의 시간이 peek의 값보다 크거나 같을 경우에는 맨 아래값을 삭제하고 새 end시간으로 넣어준다. 우선순위 큐이므로 새로운 end시간이 아래있는 end시간보다 작을 경우 아래로 내려간다.
	  public static PriorityQueue<Integer> endQ = new PriorityQueue<>();
	    public static void main(String[] args) throws IOException {
	        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        StringTokenizer st;

	        int n = Integer.parseInt(br.readLine());

	        int[][] table = new int[n][2];

	        for(int i=0; i<n; i++){
	            st = new StringTokenizer(br.readLine());
	            table[i][0] = Integer.parseInt(st.nextToken());
	            table[i][1] = Integer.parseInt(st.nextToken());
	        }

	        Arrays.sort(table, (o1, o2) -> {
	            if(o1[0] == o2[0]) return o1[1] - o2[1];
	            else return o1[0] - o2[0];
	        });

	        endQ.add(table[0][1]);

	        for(int i=1; i<table.length; i++){
	            if(endQ.peek() <= table[i][0]) endQ.poll();
	            endQ.add(table[i][1]);
	        }
	        
	        //int형은 그냥 내보낼수없어서 string으로 바꿔주는 작업이 필요함.
	        //flush()는 현재 버퍼에 저장되어 있는 내용을 클라이언트로 전송하고 버퍼를 비운다.
	        bw.write(String.valueOf(endQ.size()));
	        bw.flush();
	        bw.close();
	        br.close();
	    }
}
