package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class b_11000 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int arr[][] = new int[N][2];
		PriorityQueue<Integer> q = new PriorityQueue<>();
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr, new Comparator<int[]>() {
			public int compare(int a1[], int a2[]) {
				if(a1[0] == a2[0]) {
					return a1[1] - a2[1];
				}else {
					return a1[0] - a2[0];
				}
			}
		});
	
		
//		for(int i=0; i<N; i++) {
//			System.out.println(arr[i][0] + ", " + arr[i][1]);
//		}
//		
		q.offer(arr[0][1]);
		
		for(int i=1; i<N; i++) {
//			System.out.println(q.peek());
			if(q.peek() <= arr[i][0]) q.poll();
			
			q.offer(arr[i][1]);
		}
		System.out.println(q.size());
	}

}
