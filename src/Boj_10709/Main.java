package Boj_10709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int H = Integer.parseInt(st.nextToken());
		int W = Integer.parseInt(st.nextToken());

		String[][] cloud = new String[H][W];

		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				cloud[i][j] = br.readLine();
			}
		}

		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				if (cloud[i][j] == "c") {
					cloud[i][j] = "0";
				}
			}
		}

	}
}
