package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class B_1931 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int n_min[][] = new int[N][2];
		
		for(int i=0;i<N; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int finish = Integer.parseInt(st.nextToken());
			
			n_min[i][0] = start;
			n_min[i][1] = finish;
		}
		
//		for(int i=0; i<N; i++) {
//			System.out.println(n_min[i][0] + ", " + n_min[i][1]);
//		}
		
		// finish�� ���Ͽ� ���� �� start�� ���Ͽ� �������� ����
		// �߿�
		Arrays.sort(n_min, new Comparator<int []>() { //return ���� = ��������, ��� = ��������
			public int compare(int[] a, int[] b) {
				if(a[1] == b[1]) {
					return a[0] - b[0]; 
				}else if(a[1] < b[1]) {
					return a[1] - b[1];
				}
				return 1;
			}
		});
		
//		for(int i=0; i<N; i++) {
//			System.out.println(n_min[i][0] + ", " + n_min[i][1]);
//		}
		
		// ���ĵ� �迭���� time�� ù�� ° ���۽ð��� �޾ƿ� ��
		// ���ǿ� �����Ѵٸ� time�� finish�� �־� �������ش�.
		int time = n_min[0][0];
		int count = 0;
		for(int i=0; i<N; i++) {
			if(time <= n_min[i][0]) {
				time = n_min[i][1];
				count++;
			}
		}
		System.out.println(count);
	}
}
