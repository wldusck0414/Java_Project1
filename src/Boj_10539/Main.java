package Boj_10539;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		int[] A = new int[N];
		int[] B = new int[N];

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++) {
			B[i] = Integer.parseInt(st.nextToken());
		}

		A[0] = B[0];
		sb.append(A[0]).append(" ");
		for (int i = 1; i < N; i++) {
			A[i] = B[i] * (i + 1) - B[i - 1] * i;
			sb.append(A[i]).append(" ");
		}
		System.out.println(sb.toString());

	}
}
