package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_2798 {
	public static void main(String[] args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int max = 0, count = 0;
		int t[] = new int[N];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			t[i] = Integer.parseInt(st.nextToken());
		}
		
		
		for(int i=0; i<N-2; i++) { 
			for(int j=i+1; j<N-1; j++) { 
				for(int z=j+1; z<N; z++) {
					int hap = t[i] + t[j] + t[z];
					System.out.print("(i, j, z) : (" + i + ", " + j + ", " + z); 
					System.out.println("hap, max : (" + hap + ", " + max +")" + ++count);
					if(hap <= M && max < hap) {
						max = hap;
					} 
				}
			} 
		}
		System.out.println(max);
	}
}	
