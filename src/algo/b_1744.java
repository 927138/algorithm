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
			
			// -���� ���� count
			if(arr[i] < 0) m_count++; 
		}
		Arrays.sort(arr);
		
		
		
		int Max = Integer.MIN_VALUE;
		for(int i=0; i<=N/2; i++) {
			int count = 0; // 2���� ���� �� �ִ� ��쿡 ���� ������ ���߱� ���� ����
			int sum = 0;
			
			// -�� ���Ͽ� ���Ѱ��� sum�� ����
			// 2���� �Ѽ��� ������ ������ count 1�� ����
			for(int j=0; j<(m_count/2)*2; j++) {
				sum += arr[j] * arr[++j];
				count++;
			}
			
			// +�� ���� �ݺ������� count���� ���� ���ǿ� ���� ����
			for(int j=N-1; j>=(m_count/2)*2; j--) {
				if(count < i) {
					int x = arr[j--];
					int y = arr[j];
					
					// y = 0, y = 1 �϶� count�� ������Ű�� �ʰ� ��ĭ �̷�.
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
