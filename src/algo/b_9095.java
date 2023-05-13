package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_9095 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int arr[] = new int[11];
		int T = Integer.parseInt(br.readLine());
		
		search(0, arr);
		
		for(int i=0; i<T; i++) {
			System.out.println(arr[Integer.parseInt(br.readLine())]);
		}
		
	}
	static void search(int x, int arr[]) {
		if(x > 10) return;
		else {
			arr[x]++;
			for(int i=1; i<=3; i++) {
				search(x+i, arr);
			}
		}		
	}
}
