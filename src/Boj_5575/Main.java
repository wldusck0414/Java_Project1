package Boj_5575;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < 3; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine().trim(), " ");

			int h = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			int s = Integer.parseInt(st.nextToken());
			int h1 = Integer.parseInt(st.nextToken());
			int m1 = Integer.parseInt(st.nextToken());
			int s1 = Integer.parseInt(st.nextToken());

			int sum = h * 60 * 60 + m * 60 + s;
			int sum1 = h1 * 60 * 60 + m1 * 60 + s1;
			int total = sum1 - sum;

			int hour = total / 3600;
			int minute = total % 3600 / 60;
			int second = total % 3600 % 60;

			sb.append(hour).append(" ").append(minute).append(" ").append(second).append("\n");
		}

		System.out.println(sb.toString());
	}
}
