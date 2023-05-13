package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class avg_score {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int count = Integer.parseInt(br.readLine());

		st = new StringTokenizer(br.readLine());
		int max = Integer.parseInt(st.nextToken());
		int hap = max;
		for(int i=0; i<count-1; i++) {
			int num = Integer.parseInt(st.nextToken());
			hap += num;
			if(max < num) max = num;
		}
		
		System.out.println((double)hap/count / max * 100);
	}
}
