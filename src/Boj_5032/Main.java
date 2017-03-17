package Boj_5032;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int sum = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int Q = 0;
		int R = 0;
		int total = 0;

		while (sum / c >= 1) {
			Q = sum / c;
			R = sum % c;
			sum = Q + R;

			total += Q;
		}
		System.out.println(total);
	}
}
