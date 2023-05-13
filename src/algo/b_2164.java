package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class b_2164 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Queue<Integer> q = new LinkedList<>();
		int N = Integer.parseInt(br.readLine());
		
		// 1~N���� Queue�� ����
		for(int i=1; i<N+1; i++) {
			q.offer(i);
		}
		
		while(true) {
			// Queue�� �����ִ� ���� �Ѱ���� ���.
			if(q.size() <= 1) {
				System.out.println(q.peek());
				break;
			}
			
			// �ΰ��� ���� ������ ���ÿ� �ι�° �������� queue���� �߰�.
			q.poll();
			int q_num = q.poll();
			q.offer(q_num);
		}
		
		
		
	}

}
