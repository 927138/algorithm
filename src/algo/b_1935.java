package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class b_1935 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Double> s = new Stack<>();
		
		int N = Integer.parseInt(br.readLine());
		double arr[] = new double[26];
		String str = br.readLine();
		
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i=0; i<str.length(); i++) {
			int ch = str.charAt(i) - 'A';
			
			if(ch >= 0 && ch < 26) {
				s.push(arr[ch]);
			}else {
				double y = s.pop();
				double x = s.pop();
				if(str.charAt(i) == '+') {
					s.push(x + y);
				}else if(str.charAt(i) == '-') {
					s.push(x - y);
				}else if(str.charAt(i) == '/') {
					s.push(x / y);
				}else {
					s.push(x * y);
				}

			}
			
		}
		System.out.println(String.format("%.2f", s.pop()));
		
	}

}
