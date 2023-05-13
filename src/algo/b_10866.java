package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class b_10866 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Deque<Integer> d = new LinkedList<>();
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			switch(str) {
			case "push_front":
				d.offerFirst(Integer.parseInt(st.nextToken()));
				break;
			case "push_back":
				d.offerLast(Integer.parseInt(st.nextToken()));
				break;
				
			case "pop_front":
				if(!d.isEmpty()) {
					System.out.println(d.peekFirst());
					d.pollFirst();
				}else System.out.println(-1);
				break;
			case "pop_back":
				if(!d.isEmpty()) {
					System.out.println(d.peekLast());
					d.pollLast();
				}else System.out.println(-1);
				break;
				
			case "size":
				System.out.println(d.size());
				break;
				
			case "empty":
				if(d.isEmpty()) System.out.println(1);
				else System.out.println(0);
				break;
			case "front":
				if(d.peekFirst() != null) System.out.println(d.peekFirst());
				else System.out.println(-1);
				break;
			case "back":
				if(d.peekLast() != null) System.out.println(d.peekLast());
				else System.out.println(-1);
				break;
				
			
			}
				
			
		}
		
	}

}
