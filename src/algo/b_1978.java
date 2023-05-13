package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_1978 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int count = 0;
		st = new StringTokenizer(br.readLine());
		
		boolean result[] = new boolean[1001];
		ch(result);
		
		while(st.hasMoreTokens()) {
			System.out.println("dfdf");
			int token = Integer.parseInt(st.nextToken());
			for(int i=0; i<result.length; i++) {
				if(i == token && !result[i]) count++;
		
			}
		}
		System.out.println(count);
	}
	
	public static void ch(boolean array[]) {
		array[0] = array[1] = true; 
		
		for(int i=2; i*i<array.length; i+=1) {
			if(!array[i]) {
				for(int j=i*i; j<array.length; j+=i) {
					array[j] = true;
				}
			}
		}
	}
}
