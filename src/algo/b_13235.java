package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_13235 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String str = br.readLine();
		sb.append(str);
		
		if(str.contains(sb.reverse())) System.out.println("true");
		else System.out.println("false");
		
//		boolean flag = false;
//		if(str.length() == 1 ) flag = true;
//		else {
//			for(int i=0; i<str.length()/2; i++) {
//				if(str.charAt(i) == str.charAt(str.length()-i-1)) flag=true;
//				else {
//					flag=false;
//					break;
//				}
//				
//			}
//		}
//		
//		if(flag) System.out.println("true");
//		else System.out.println("false");
	}
}
