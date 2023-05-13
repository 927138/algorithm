package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class b_1181 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		int count = 0;
		String str[] = new String[N];
		
		for(int i=0; i<N; i++) {
			str[i] = br.readLine();
		}
		
		// 문자열에 대한 정렬
		Arrays.sort(str);
		
		//익명클래스로 문자 길이에 대한 정렬
		Arrays.sort(str, new Comparator<String>() {
			public int compare(String s1, String s2) {
				return s1.length() - s2.length();
			}
		});
		//람다식을 이용한 문자 길이에 대한 정렬
//		Arrays.sort(str, (String s1, String s2) -> s1.length() - s2.length());
		
		for(int i=0; i<N-1; i++) {
			if(!str[i].equals(str[i+1]))
				System.out.println(str[i]);
		}
		//반복문에서 마지막 값에 대한 출력이 없음
		System.out.println(str[N-1]);
	}
}
