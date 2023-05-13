package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_13305 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int len[] = new int[N-1];
		int oil[] = new int[N];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N-1; i++) {
			len[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			oil[i] = Integer.parseInt(st.nextToken());
		}
		
		// 오일 첫번째 오일저장
		long n_oil = oil[0];
		long sum = 0;
		for(int i=0; i<N-1; i++) {
			// 저장된 오일과 oil[i]를 비교
			if(n_oil > oil[i]){
				n_oil = oil[i];
			}
			sum += n_oil*len[i];
		}
		
		System.out.println(sum);
		
	}

}
