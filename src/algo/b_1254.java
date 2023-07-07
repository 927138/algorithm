package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_1254 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		int count = 0;
		int l = 0;
		boolean flag = false;
		
		// r == l > 비교안해도됨
		while(true) {
			
			int r = str.length()-1;
			l = count;
			while(l < r) {
//				System.out.print(l + ", " + r + ".  ");
				if(str.charAt(l) == str.charAt(r)) {
					l++; r--;
				}else break;
				
				if(l >= r) flag = true;
			}
			
//			System.out.println(t_l + ", " + r);
			if(flag || count >= r) {
				System.out.println(count+str.length());
				break;
			}else {
				count++;
			}
		}
	
	}
}
