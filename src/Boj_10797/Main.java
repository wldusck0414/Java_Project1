package Boj_10797;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine().trim());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int[] num = new int[5];
		int res = 0;

		for (int i = 0; i < 5; i++) {
			num[i] = Integer.parseInt(st.nextToken());

			if (num[i] == N) {
				res++;
			}
		}

		System.out.println(res);

	}
}
