package Boj_10409;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(); 

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int T = Integer.parseInt(st.nextToken());

		int[] num = new int[n];

		int sum = 0, res = 0;
		
		for (int i = 0; i < n; i++) {
			num[i] = Integer.parseInt(st1.nextToken());
			sum += num[i];

			if (sum > T) {
				res ++;
			}
		}
		sb.append(n-res);
		System.out.println(sb.toString());
	}
}
