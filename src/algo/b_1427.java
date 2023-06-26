package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class b_1427 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		char ch[] = br.readLine().toCharArray();
		Arrays.sort(ch);
		
		for(int i=ch.length-1; i>=0; i--) {
			sb.append(ch[i]);
		}
		System.out.println(sb);
	}

}
