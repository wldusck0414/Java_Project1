package Boj_9550;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());
	
		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			int sum = 0;
			
			StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < N; j++) {
				int
				Q = Integer.parseInt(st1.nextToken()) / K;
				sum += Q;
			}
			sb.append(sum).append("\n");
		}
		System.out.println(sb.toString());
	}
}
