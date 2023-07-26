package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class b_13164 {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		ArrayList<Integer> n = new ArrayList<>();
		ArrayList<Integer> k = new ArrayList<>();
		
		st = new StringTokenizer(br.readLine());
		// 원생에 대하여 입력받고 오름차순 정렬.
		for(int i=0; i<N; i++) {
			n.add(Integer.parseInt(st.nextToken()));
		}Collections.sort(n);
		
		// 각 구간의 차를 구한 후 오름차순 정렬
		// ex) (1,3) (3,5) (5,6) (6,10)
		//  >> (5,6) (1,3) (3,5) (6,10)
		for(int i=0; i<N-1; i++) {
			k.add(n.get(i+1) - n.get(i));
		}Collections.sort(k);
//		System.out.println(n);
//		System.out.println(k);
		
		// 구간별 오름차순 된 array k에 대하여 N-K만큼 반복하여 더한다
		// 예제결과) (5,6) + (1,3)
		//      >> (1,3), (5,6), (10)
		//      >>  3개조를 만들면서 최소 비용을 만드는 조를 만듬. 
		int cost = 0;
		for(int i=0; i<N-K; i++) {
			cost += k.get(i);
		}
		System.out.println(cost);
	}

}
