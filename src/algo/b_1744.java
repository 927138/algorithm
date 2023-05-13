package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class b_1744 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int arr[] = new int[N];
		
		int m_count = 0;
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			
			// -값에 대한 count
			if(arr[i] < 0) m_count++; 
		}
		Arrays.sort(arr);
		
		
		
		int Max = Integer.MIN_VALUE;
		for(int i=0; i<=N/2; i++) {
			int count = 0; // 2개씩 묶을 수 있는 경우에 수의 조건을 맞추기 위한 변수
			int sum = 0;
			
			// -에 대하여 곱한값을 sum에 대입
			// 2개를 한수로 묶었기 때문에 count 1씩 증가
			for(int j=0; j<(m_count/2)*2; j++) {
				sum += arr[j] * arr[++j];
				count++;
			}
			
			// +에 대한 반복문으로 count값에 대한 조건에 맞춰 진행
			for(int j=N-1; j>=(m_count/2)*2; j--) {
				if(count < i) {
					int x = arr[j--];
					int y = arr[j];
					
					// y = 0, y = 1 일때 count를 증가시키지 않고 한칸 미룸.
					if((y == 0 || y == 1) && j != 0) {
						sum += x;
						j++;
						continue;
					}
					else {
						sum += x * y;
						count++;		
					}
				} 
				else sum += arr[j];
			}
			if(Max < sum) Max = sum;
		}
		

		System.out.println(Max);
	}
}
