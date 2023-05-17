package algo;

import java.io.*;
import java.util.*;

public class atm {
	public static void main(String []args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int x = Integer.parseInt(bf.readLine());
		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
		
		int array [] = new int [st.countTokens()];
		for(int i=0; st.hasMoreTokens(); i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		
		
		
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);	
		}
	}
}
