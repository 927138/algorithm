package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_1213 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		// 알파벳 개수만큼 배열 선언
		int ch[] = new int[26];
		// 홀수 개수, 홀수인 알파벳
		int odd = 0, odd_number = 0;
		String str = br.readLine();
		
		// 문자열에 대한 알파벳 개수 저장
		for(int i=0; i<str.length(); i++) {
			ch[(int)(str.charAt(i) - 'A')]++;
		}
		
		// 문자별 개수에 대하여 홀수 판단
		for(int i=0; i<ch.length; i++) {
			if(ch[i]%2 == 1) {odd++; odd_number = i;}
		}
		
		// odd가 홀수 일경우 시작
		if(odd>1) System.out.println("I'm Sorry Hansoo");
		else {
			for(int i=0;i<ch.length; i++) {
				for(int j=0; j<ch[i]/2; j++) {
					System.out.println((char) (i + 'A'));
					sb.append((char) (i + 'A'));
				}
			}
		}
		
		String result = "";
		result += sb;
		// odd가 있는경우
		if(odd == 1) {
			sb.append((char)(odd_number + 'A'));
		}
		result += sb.reverse();
		System.out.println(result);
		
	}
}
