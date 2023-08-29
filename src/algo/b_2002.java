package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class b_2002 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		List<String> list = new ArrayList<>();
		
		for(int i=0; i<N*2; i++) {
			list.add(br.readLine());
		}
		
		int count = 0;
		for(int i=0; i<N; i++) {
			if(list.get(i).equals(list.get(i+N))) count++;
		}System.out.println(count);
		
	}

}
