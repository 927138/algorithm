package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_1717 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int arr[] = new int[N+1];
		for(int i=0; i<=N; i++) {
			arr[i] = i;
		}
		
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			
			int x = Integer.parseInt(st.nextToken());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			if(x == 0) {
				insert(arr, a, b);
			}
			else {
				int n1 = search(arr, a);
				int n2 = search(arr, b);
//				System.out.println(n1 + ", " + n2);
				if(n1 == n2) sb.append("YES\n");
				else sb.append("NO\n");
			}
		}
//				for(int j=0; j<N+1; j++) {
//					System.out.print(arr[j] + " ");
//				}System.out.println();
		
		for(int i=0; i<N+1; i++) {
			System.out.print(arr[i] + " ");
		}System.out.println();
		System.out.println(sb);
	}
	
	static int search(int arr[], int n) {
		if(n == arr[n]) return n;
		
		return arr[n] = search(arr, arr[n]);
	}
	
	static void insert(int arr[], int n, int m) {
		int n1 = search(arr, n);
		int m1 = search(arr, m);
		
		if(n1 == m1) return;
		if(n1 < m1) arr[m1] = n1;
		else arr[n1] = m1;
		System.out.println(n + ", " + m);
		System.out.println(n1 + ", " + m1);
		System.out.println();
	}
}
