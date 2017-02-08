package Boj_5596;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[][] nums = new int[2][4];
		for (int i = 0; i < 2; i++) {
			String[] numStr = br.readLine().split(" ");
			for (int j = 0; j < 4; j++) {
				nums[i][j] = Integer.parseInt(numStr[j]);
			}
		}

		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0; i < 4; i++) {
			sum1 += nums[0][i];
			sum2 += nums[1][i];
		}

		if (sum1 > sum2) {
			System.out.println(sum1);
		} else if (sum1 < sum2) {
			System.out.println(sum2);
		} else if (sum1 == sum2) {
			System.out.println(sum1);
		}

	}
}
