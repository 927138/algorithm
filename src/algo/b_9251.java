package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_9251 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		String str2 = br.readLine();
		
		int dp[][] = new int[str1.length()+1][str2.length()+1];
		
		for(int i=1; i<=str1.length(); i++) {
			for(int j=1; j<=str2.length(); j++) {
				
				if(str1.charAt(i-1) == str2.charAt(j-1)) dp[i][j] = dp[i-1][j-1] + 1;
				else dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]); 
//				if(dp[i][j] > str1.length() || dp[i][j] > str2.length()) dp[i][j] = Math.min(str1.length(), str2.length())
			}
		}
		
		for(int i=0; i<=str1.length(); i++) {
			for(int j=0; j<=str2.length(); j++) {
				System.out.printf("%2d ", dp[i][j]);
			}System.out.println();
		}
		
		System.out.println(dp[str1.length()][str2.length()]);
	}

}
//XXXXXF
//XFXXXQ