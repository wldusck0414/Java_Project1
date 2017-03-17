package Boj_10984;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			int subject = Integer.parseInt(br.readLine());
			float[][] num = new float[subject][2];

			float point = 0;
			float grade = 0;
			float total = 0;

			for (int j = 0; j < subject; j++) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");

				num[j][0] = Integer.parseInt(st.nextToken());
				num[j][1] = Float.parseFloat(st.nextToken());

				point = point + num[j][0];
				grade = grade + num[j][0] * num[j][1];
				total = grade / point;
			}
			sb.append((int) point).append(" ").append(Math.round(total*10f)/10f).append("\n");

		}
		System.out.println(sb.toString());
	}
}