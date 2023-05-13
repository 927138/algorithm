package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class b_1059 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int L = Integer.parseInt(br.readLine());
		int arr[] = new int[L];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<L; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}Arrays.sort(arr);
		
		int n = Integer.parseInt(br.readLine());
		
		int l = 0, r = 0;
		for(int i=0; i<L; i++) {
			if(arr[i] < n) l = i;
			else if(arr[i] > n) {
				r = i; break;
			}else if(arr[i] == n){
				System.out.println(0);
				return;
			}
		}
		
		if(arr[0] > n) {
			arr[r+1] = arr[l];
			r += 1;
			arr[l] = 0;
		}
		int count = 0;
		for(int i=arr[l]+1; i<=n; i++) {
			for(int j=n; j<arr[r]; j++) {
				if(i == j) continue;
				if(i <= n && n <= j) count++;
			}
		}
		System.out.println(count);
	}

}
