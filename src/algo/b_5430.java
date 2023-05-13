package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class b_5430 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int C = Integer.parseInt(br.readLine());
		
		for(int i=0; i<C; i++) {
			StringBuilder sb = new StringBuilder();
			
			String def = br.readLine();
			int N = Integer.parseInt(br.readLine());
			boolean flag = true;
			boolean error_flag = true;
			
			Deque<Integer> d = new LinkedList<>();
			st = new StringTokenizer(br.readLine(), "[ , ]");
			for(int j=0; j<N; j++) {
				d.offer(Integer.parseInt(st.nextToken()));
			}
			
			for(int j=0; j<def.length(); j++) {
				if(def.charAt(j) == 'R') flag = !flag;
				else if(def.charAt(j) == 'D') {
					if(!d.isEmpty()) {
						if(flag) d.pollFirst();
						else d.pollLast();
					}else {
						error_flag = false;
						break;
					}
				}
			}
			print(d, sb, error_flag, flag);
			System.out.println(sb);
			
		}
		
		
	}
	static void print(Deque d, StringBuilder sb, boolean error_flag, boolean flag) {
		if(error_flag) {
			sb.append("[");
			int size = d.size();
			for(int i=0; i<size; i++) {
				if(flag) sb.append(d.pollFirst());
				else sb.append(d.pollLast());
				
				if(i != size-1) sb.append(","); 
			}
			sb.append("]");
		}else {
			sb.append("error");
		}
	}

}
