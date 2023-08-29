package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_1551 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int arr[] = new int[N];
		st = new StringTokenizer(br.readLine(), ",");
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=1; i<=K; i++) {
			for(int j=0; j<N-1; j++) {
				arr[j] = arr[j+1] - arr[j];
			}
		}
		
		for(int i=0; i<N-K-1; i++) {
			System.out.print(arr[i] + ",");
		}System.out.println(arr[N-K-1]);
	}

}
