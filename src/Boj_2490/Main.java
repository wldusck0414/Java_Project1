package Boj_2490;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int[][] num = new int[3][4];
		String yut = null;
		for (int i = 0; i < 3; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int cnt = 0;
			for (int j = 0; j < 4; j++) {
				num[i][j] = Integer.parseInt(st.nextToken());
				if (num[i][j] == 1) {
					cnt++;
				}
			}
			if (cnt == 0) {
				yut = "D";
			} else if (cnt == 1) {
				yut = "C";
			} else if (cnt == 2) {
				yut = "B";
			} else if (cnt == 3) {
				yut = "A";
			} else if (cnt == 4) {
				yut = "E";
			}
			sb.append(yut).append("\n");
		}
		System.out.println(sb.toString());
	}
}
