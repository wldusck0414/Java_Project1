package Boj_5567;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		boolean[][] link = new boolean[n + 1][n + 1];
		ArrayList<Integer> friends = new ArrayList<>(n);

		for (int i = 0; i < m; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int k = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());

			if (k == 1) {
				friends.add(v);
			}

			link[k][v] = link[v][k] = true;
		}

		br.close();

		boolean[] isInvited = new boolean[n + 1];

		for (int k : friends) {
			isInvited[k] = true;

			for (int v = 1; v <= n; v++) {
				if (link[k][v]) {
					isInvited[v] = true;
				}
			}
		}

		int cnt = 0;

		for (int i = 1; i <= n; i++) {
			if (isInvited[i]) {
				cnt++;
			}
		}

		if (cnt > 0) {
			System.out.println(cnt - 1);
		}

		else {
			System.out.println(0);
		}
	}
}
