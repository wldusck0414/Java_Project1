package Boj_9711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	private static final String NEW_LINE = "\n";
	private static final String CASE = "Case #";
	private static final String COLON = ": ";

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();

		for (int i = 1; i <= T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int P = Integer.parseInt(st.nextToken());
			int Q = Integer.parseInt(st.nextToken());
			long[] fibo = new long[2];
			fibo[0] = 0;
			fibo[1] = 1 % Q;

			for (int j = 2; j <= P; j++) {
				long tmp = fibo[1];
				fibo[1] = (fibo[0] % Q + fibo[1] % Q) % Q;
				fibo[0] = tmp;
			}

			sb.append(CASE).append(i).append(COLON).append(fibo[1]).append(NEW_LINE);
		}

		System.out.println(sb.toString());
	}
}
