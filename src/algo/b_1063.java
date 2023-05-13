package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_1063 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
//		 8*8
		String str1 = st.nextToken();
		String str2 = st.nextToken();
		int N = Integer.parseInt(st.nextToken());
		
		for(int i=0; i<N; i++) {
			String str = br.readLine(); 
			
			switch(str){
			case("R") :
				
				break;
			case("L") :
				break;
			case("B") :
				break;
			case("T") :
				break;
			case("RT") :
				break;
			case("LT") :
				break;
			case("RB") :
				break;
			case("LB") :
				break;
			
			}
		}
	}

}
