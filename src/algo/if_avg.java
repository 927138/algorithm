package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class if_avg {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int std = Integer.parseInt(br.readLine());
		
		for(int i=0; i<std; i++) {
			st = new StringTokenizer(br.readLine());
			int sub_num = Integer.parseInt(st.nextToken());
			int num[] = new int[sub_num];
			int hap = 0, avg = 0;
			
			for(int j=0; j<sub_num; j++) {
				int x = Integer.parseInt(st.nextToken());
				hap += x;
				num[j] = x;
			}
			avg = hap/sub_num;
			
			int count = 0;
			for(int j=0; j<sub_num; j++) {
				if(avg < num[j]) count++;
			}
			
			System.out.println(String.format("%.3f", (double)count/sub_num * 100) + "%");
		}
		
		
	}
}
