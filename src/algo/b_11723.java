package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_11723 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int M = Integer.parseInt(br.readLine());
		boolean arr[] = new boolean[21];
		
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
	
			switch(st.nextToken()) {
			case "add":
				arr[Integer.parseInt(st.nextToken())] = true;
				break;
			case "remove":
				arr[Integer.parseInt(st.nextToken())] = false;
				break;
			case "check":
				if(arr[Integer.parseInt(st.nextToken())]) sb.append(1 + "\n");
				else sb.append(0 + "\n");
				break;
			case "toggle":
				int x = Integer.parseInt(st.nextToken());
				if(arr[x]) arr[x] = false;
				else arr[x] = true;
				break;
			case "all":
				for(int j=1; j<arr.length; j++) {
					arr[j] = true;
				}
				break;
			case "empty":
				for(int j=1; j<arr.length; j++) {
					arr[j] = false;
				}
				break;
			}
		}
		System.out.println(sb);
	}

}
