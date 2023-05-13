package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class b_1158 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int arr[] = new int[N];
		Queue<Integer> q = new LinkedList<>();
		
		for(int i=0; i<N; i++) {
			q.offer(i+1);
		}
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<K-1; j++) {
				q.offer(q.peek());
				q.poll();
			}
			arr[i] = q.peek();
			q.poll();
		}
		
		System.out.print("<"+ arr[0]);
		for(int i=1; i<N; i++) {
			System.out.print(", " + arr[i]);
		}
		System.out.println(">");
	}

}
