package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_1213 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		// ���ĺ� ������ŭ �迭 ����
		int ch[] = new int[26];
		// Ȧ�� ����, Ȧ���� ���ĺ�
		int odd = 0, odd_number = 0;
		String str = br.readLine();
		
		// ���ڿ��� ���� ���ĺ� ���� ����
		for(int i=0; i<str.length(); i++) {
			ch[(int)(str.charAt(i) - 'A')]++;
		}
		
		// ���ں� ������ ���Ͽ� Ȧ�� �Ǵ�
		for(int i=0; i<ch.length; i++) {
			if(ch[i]%2 == 1) {odd++; odd_number = i;}
		}
		
		// odd�� Ȧ�� �ϰ�� ����
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
		// odd�� �ִ°��
		if(odd == 1) {
			sb.append((char)(odd_number + 'A'));
		}
		result += sb.reverse();
		System.out.println(result);
		
	}
}
