package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class b_2217 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int k_weight[] = new int[N];
		int max = Integer.MIN_VALUE;
		int k = 1;
		
		for(int i=0; i<N; i++) {
			k_weight[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(k_weight);
		
		for(int i=N; i>0; i--) {	
			int num = k_weight[i-1] * k++;
			if(max < num) max = num;
		}
		
		System.out.println(max);
	}

}
