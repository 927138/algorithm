package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class b_11650 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int array[][] = new int[N][2];
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			array[i][0] = Integer.parseInt(st.nextToken());
			array[i][1] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(array[0]);
//		Arrays.sort(array, (o1, o2) -> {
//			if(o1[0] == o2[0]) return o1[1] - o2[1];
//			else return o1[0] - o2[0];
//		});
		for(int i=0;i<N; i++) {
			System.out.println(array[i][0] + " " + array[i][1]);
		}
	}

}
