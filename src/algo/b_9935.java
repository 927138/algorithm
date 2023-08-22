package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class b_9935 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String str = br.readLine();
		String boom = br.readLine();
		
		Stack<Character> result = new Stack<>();
		
		for(int i=0; i<str.length(); i++) {
			result.push(str.charAt(i));
			
//			if(result.size() >= boom.length()) {
//				boolean flag = true;
//				for(int j=0; j<boom.length(); j++) {
//					if(result.get(result.size() - boom.length() + j) != boom.charAt(j)) {
//						flag = false;
//						break;
//					}
//				}
//				
//				if(flag) {
//					for(int j=0; j<boom.length(); j++) {
//						result.pop();
//					}
//				}
//			}
			if(boom.contains(String.valueOf(str.charAt(i)))) sb.append(str.charAt(i));
			if(sb.indexOf(boom) >= 0) {
				sb = sb.replace(sb.indexOf(boom), sb.length(), "");
				
				for(int j=0; j<boom.length(); j++) {
					result.pop();
				}
				
			}
		}
		
		sb = new StringBuilder();
		for(char ch : result) {
			sb.append(ch);
		}
		
		
		if(sb.toString().equals("")) System.out.println("FRULA");
		else System.out.println(sb.reverse());
	}

}
