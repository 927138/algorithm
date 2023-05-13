package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.StringTokenizer;

public class b_10845 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int test = Integer.parseInt(br.readLine());
		
		Queue<Integer> q = new LinkedList<>();
		for(int i=0; i<test; i++) {
			st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			switch(str) {
			case "push":
				try {
					int x = Integer.parseInt(st.nextToken());
					q.add(x); //q.offer();
				}
				catch(NoSuchElementException e) {}
				break;
			case "pop":
				try { System.out.println(q.remove());} //q.poll();
				catch(NoSuchElementException e) { System.out.println("-1");}
				break;
			case "size":
				System.out.println(q.size());
				break;
			case "empty":
				if(q.isEmpty()) System.out.println("1");
				else System.out.println("0");
				break;
			case "front":
				try { System.out.println(q.element()); } //q.peek();
				catch(NoSuchElementException e) { System.out.println("-1");	}
				break;
			case "back":
				try {
					Iterator iter = q.iterator();
					Integer z = -1;
					while(iter.hasNext())
						z = (Integer) iter.next();
					System.out.println(z);
				}
				catch(NoSuchElementException e) { System.out.println("-1");	}
				break;
			}
		}
	}
}
