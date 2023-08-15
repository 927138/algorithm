package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class b_1068 {

	private static int cnt = 0;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;

		int N = Integer.parseInt(br.readLine());
		ArrayList<Integer> arr[] = new ArrayList[N];
		boolean visit[] = new boolean[N];
		st = new StringTokenizer(br.readLine());
		int remove = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			arr[i] = new ArrayList<>();
		}

		int root = 0;
		for (int i = 0; i < N; i++) {
			int x = Integer.parseInt(st.nextToken());
			if (x == -1) {
				root = i;
				continue;
			}
			if (i == remove)
				continue;

			arr[x].add(i);
//9
//1 6 4 1 3 3 8 8 -1
//3

		}
		dfs(arr, visit, root, remove);
		System.out.println(cnt);

	}

	static void dfs(ArrayList<Integer> arr[], boolean visit[], int x, int remove) {

		if (x == remove)
			return;

		if (arr[x].size() == 0)
			cnt++;
		visit[x] = true;

		for (Integer i : arr[x]) {
			if (visit[i])
				continue;

			visit[i] = true;
			dfs(arr, visit, i, remove);
		}
	}

}
