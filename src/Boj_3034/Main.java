package Boj_3034;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int W = Integer.parseInt(st.nextToken());
		int H = Integer.parseInt(st.nextToken());
		int[] num = new int[N];
		int D = (int) Math.sqrt(Math.pow(W, 2) + Math.pow(H, 2));

		for (int i = 0; i < N; i++) {
			num[i] = Integer.parseInt(br.readLine());
			if (num[i] <= D) {
				System.out.println("DA");
			} else {
				System.out.println("NE");
			}
		}

	}
}