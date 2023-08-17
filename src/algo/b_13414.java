package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;

public class b_13414 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		HashSet<String> set = new LinkedHashSet<>(); 
		for(int i=0; i<M; i++) {
			String str = br.readLine();
			
			if(set.contains(str)) set.remove(str);
			set.add(str);
			System.out.println(set);
		}
		
		
//		ArrayList<String> key_set = new ArrayList<>(map.keySet());
//		
		StringBuilder sb = new StringBuilder();
		Iterator<String> iter = set.iterator();
		if(N > set.size()) {
			for(int i=0; i<set.size(); i++) {
				sb.append(iter.next() + "\n");
			}System.out.println(sb);
			return;
		}
		
		for(int i=0; i<N; i++) {
			sb.append(iter.next() + "\n");
		}System.out.println(sb);
	}

}
