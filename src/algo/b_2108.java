package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class b_2108 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int arr[] = new int[N];
		int arr2[] = new int[8001];
		
		int sum = 0;
		for(int i=0; i<N; i++) {
			int num = Integer.parseInt(br.readLine());
			arr[i] = num;
			arr2[num+4000]++;
			sum += num;
		}
		
		
		int count = 0, num = 0;
		boolean flag = false;
		for(int i=0; i<arr2.length; i++) {
			if(count < arr2[i]) {
				count = arr2[i];
				num = i-4000;
				flag = true;
			}else if(count == arr2[i] && flag == true) {
				num = i-4000;
				flag = false;
			}
		}
		
		Arrays.sort(arr);
		System.out.println(Math.round((double)sum/N));
		System.out.println(arr[N/2]);
		System.out.println(num);
		System.out.println(arr[N-1] - arr[0]);	
	}
}
