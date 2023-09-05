package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class b_1202 {

	static class Gem implements Comparable<Gem> {
		int weight;
		int price;
		
		public Gem(int weight, int price){
			this.weight = weight;
			this.price = price;
		}

		@Override
		public int compareTo(Gem o) {
			// TODO Auto-generated method stub
			if(o.weight == this.weight) return this.weight - o.weight;
			return this.weight - o.weight;
		}
		
		
		
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		List<Gem> arr = new ArrayList<>();
		List<Integer> back = new ArrayList<>();
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			
			int w = Integer.parseInt(st.nextToken());
			int p = Integer.parseInt(st.nextToken());
			
			arr.add(new Gem(w, p));
		}
		
		for(int i=0; i<K; i++) {
			back.add(Integer.parseInt(br.readLine()));
		}
		
		// 무게 오름차순, 같다면 무게 가격 내림차순
		Collections.sort(arr);
		
		// 오름차순
		Collections.sort(back);
		
		PriorityQueue<Gem> pq = new PriorityQueue<>((o1, o2) -> o2.price - o1.price);
		long result = 0;
		int idx = 0;
		for(int i=0; i<K; i++) {
			while(idx < N && back.get(i) >= arr.get(idx).weight) {
				System.out.println(i);
				pq.add(arr.get(idx++));
				
			}
			
			if(!pq.isEmpty()) {
				System.out.println(pq.peek().price);
				result += pq.poll().price;
			}
		}System.out.println(result);
		
	}

}
