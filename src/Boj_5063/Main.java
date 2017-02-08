package Boj_5063;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int[][] nums = new int[N][3];

		for (int i = 0; i < N; i++) {
			String[] numStr = br.readLine().split(" ");
			for (int j = 0; j < 3; j++) {
				nums[i][j] = Integer.parseInt(numStr[j]);
			}
		}

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < N; i++) {
			String res = null;
			for (int j = 0; j < 1; j++) {
				int cost = nums[i][j] + nums[i][j + 2];

				if (cost < nums[i][1]) {
					res = "advertise";
				} else if (cost == nums[i][1]) {
					res = "does not matter";
				} else if (cost > nums[i][1]) {
					res = "do not advertise";
				}
			}
			sb.append(res).append("\n");
		}
		System.out.println(sb.toString());
	}
}
