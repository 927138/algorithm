package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_9093 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			String str[] = br.readLine().split(" ");
			for(int j=0; j<str.length; j++) {
				sb.append(new StringBuilder().append(str[j]).reverse().toString() + " ");
			}sb.append("\n");
		}
		System.out.println(sb);
	}

}
