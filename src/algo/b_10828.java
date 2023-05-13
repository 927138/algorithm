package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_10828 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int test = Integer.parseInt(br.readLine());
		int stack[] = new int[test];
		int size = 0;
		
		for(int i=0; i<test; i++) {
			st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			switch(str) {
			case "push":
				if(size>=stack.length) break;
				stack[size++] = Integer.parseInt(st.nextToken());
				break;
			case "pop":
				if(size>0) System.out.println(stack[--size]);
				else System.out.println("-1");
				break;
			case "size":
				System.out.println(size);
				break;
			case "empty":
				if(size<1) System.out.println("1");
				else System.out.println("0");
				break;
			case "top":
				if(size>0) System.out.println(stack[size-1]);
				else System.out.println("-1");
				break;	
			}
		}
			
	}
}
