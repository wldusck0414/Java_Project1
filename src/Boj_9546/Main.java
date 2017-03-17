package Boj_9546;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			int T = Integer.parseInt(br.readLine());

			int people = (int) Math.pow(2, T) - 1;
			sb.append(people).append("\n");
		}
		System.out.println(sb.toString());
	}
}
