package Boj_1773;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());

		boolean[] times = new boolean[C + 1];

		for (int i = 0; i < N; i++) {
			int interval= Integer.parseInt(br.readLine());
			for (int j = 1; interval * j <= C; j++) {
				times[interval * j] = true;
			}
		}
		
		int cnt = 0;

		for (boolean time : times) {
			if (time) {
				cnt++;
			}
		}

		System.out.println(cnt);
	}
}
