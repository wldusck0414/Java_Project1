package Boj_2845;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine().trim(), " ");

		int L = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		int real = L * P;

		StringTokenizer st1 = new StringTokenizer(br.readLine().trim(), " ");

		for (int i = 0; i < 5; i++) {   
			int entry = Integer.parseInt(st1.nextToken());
			int total = entry - real;
			sb.append(total).append(" ");
		}
		System.out.println(sb.toString());
	}
}
