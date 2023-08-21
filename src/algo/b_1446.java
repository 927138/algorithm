package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class b_1446 {

	static class Node implements Comparable<Node> {
		int x;
		int y;
		int w;

		Node(int x, int y, int w) {
			this.x = x;
			this.y = y;
			this.w = w;
		}

		@Override
		public int compareTo(Node n) {
			return this.x - n.x;
		}

	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int D = Integer.parseInt(st.nextToken());

		List<Node> list = new ArrayList<>();
		int dp[] = new int[D + 1];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());

			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());

			if (y - x < w || y > D)
				continue;
			list.add(new Node(x, y, w));
		}
		Collections.sort(list);

		int idx = 0;
		int temp = 0;

		while (temp < D) {
			while (idx < list.size()) {
				Node q = list.get(idx);

				if (q.x != temp)
					break;

				if (dp[q.y] == 0)
					dp[q.y] = dp[temp] + q.w;
				else
					dp[q.y] = Math.min(dp[temp] + q.w, dp[q.y]);

				idx++;
			}

			if (dp[temp + 1] == 0)
				dp[temp + 1] = dp[temp] + 1;
			else
				dp[temp + 1] = Math.min(dp[temp] + 1, dp[temp + 1]);

			temp++;
		}

//		for (int i = 1; i <= D; i++) {
//			System.out.printf(" %3d : %3d ||", i, dp[i]);
//			if (i % 10 == 0)
//				System.out.println();
//		}
		
		System.out.println(dp[D]);
	}

}
