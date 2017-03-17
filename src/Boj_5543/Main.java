package Boj_5543;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] num = new int[5];

		for (int i = 0; i < 5; i++) {
			num[i] = Integer.parseInt(br.readLine());
		}

			Arrays.sort(num, 0, 3);
			Arrays.sort(num, 3, 5);
			
			int set = num[0] + num[3]-50;
			System.out.println(set);
	}
}
