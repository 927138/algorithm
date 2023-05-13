package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_1009 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		// st[0] = 1, st[1] = 2
		// 
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()); // st.size() = 2
			int b = Integer.parseInt(st.nextToken()); // st.siez() = 1
			int arr[] = new int[4];
			
			arr[0] = a%10;
			if(arr[0] == 0) {
				System.out.println(10);
				continue;
			}
//			
			for(int j=1; j<arr.length; j++) {
				arr[j] = arr[j-1] * a;
			}
//			System.out.println(arr[b%4] + ", " + b%4);
			
//			if(arr[b%4] % 10 == 0)
			System.out.println(arr[(b-1)%4] % 10);
		}
	}

}
