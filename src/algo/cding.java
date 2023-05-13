package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class cding {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int alpa = Integer.parseInt(st.nextToken());
		int brabo = Integer.parseInt(st.nextToken());
		int charlie = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int count = Integer.parseInt(st.nextToken());
		int a[] = new int[count];
		int result = 0;
		
		
		for(int i=0; i<count; i++) {
			for(int j=0;j<3;j++) {
				st = new StringTokenizer(br.readLine());
				int num1 = Integer.parseInt(st.nextToken());
				int num2 = Integer.parseInt(st.nextToken());
				int num3 = Integer.parseInt(st.nextToken());
				result += (num1*alpa + num2*brabo + num3*charlie);
			}
			a[i] = result;
			result = 0;
		}
		System.out.println(Arrays.stream(a).max().getAsInt());
	}
}
