package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class croatia {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String x[] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		String str = br.readLine();
		
		for(int i=0; i<x.length; i++) {
			if(str.contains(x[i])) {
				int pos = 0;
				while(true) {
					int y = str.indexOf(x[i], pos);
					if(y == -1) break;
					pos = y + 1;
				}
				str = str.replace(x[i], "#");
				System.out.println(str);
			}
		}
		
		System.out.println(str.length());
		
	}

}
