package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class b_27951 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		char arr[] = new char[N];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			arr[i] = st.nextToken().charAt(0);
		}
		
		
			
		
		st = new StringTokenizer(br.readLine());
		int U = Integer.parseInt(st.nextToken());
		int D = Integer.parseInt(st.nextToken());
		
		for(int i=0; i<N; i++) {
			if(arr[i] == '1') {
				arr[i] = 'U';
				U--;
			}else if(arr[i] == '2') {
				arr[i] = 'D';
				D--;
			}
		}
		for(int i=0; i<N; i++) {
			if(arr[i] == '3' &&U > 0) {
				arr[i] = 'U';
				U--;
			}else if(arr[i] == '3' && D > 0){
				arr[i] = 'D';
				D--;
			}
		}
		if(U < 0 || D < 0) {
			sb.append("NO");
		}else {
			sb.append("YES\n");
			for(int i=0; i<N; i++) {
				sb.append(arr[i]);
			}
		}
		
		System.out.println(sb);

	}

}
