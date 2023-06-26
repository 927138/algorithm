package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_2562 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = st.countTokens();
		System.out.println(a);
		for(int i=0; i<a; i++) {
			System.out.println(st.countTokens() + ", " + st.nextToken() + ", " + st.countTokens());
		}
		
		
		st = new StringTokenizer(br.readLine());
		a = st.countTokens();
		System.out.println(a);
		for(int i=0; i<a; i++) {
			System.out.println(st.countTokens() + ", " + st.nextToken() + ", " + st.countTokens());
		}
//		int max = Integer.MIN_VALUE;
//		int index = 0;
//		
//		for(int i=0; i<9; i++) {
//			int value = Integer.parseInt(br.readLine());
//			// value = 받아오는값
//			// max = 기존의 값들을 비교해서 제일큰값
//			if(value > max) {
//				max = value;
//				index = i+1;
//				
//			}
////			System.out.print("index : " + index);
////			System.out.println(", i = " + i + ", max : " + max);
//			sb.append("index : " + index + ", i = " + i + ", max : " + max +"\n");
//			sb.append(2121+"\n");
//			
//		}
//		
//		System.out.println(sb);
//		System.out.println(max + "\n" + index);
	}

}
