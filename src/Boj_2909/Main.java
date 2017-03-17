package Boj_2909;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int C = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		int num = (int) (Math.round(C / Math.pow(10, K)) * Math.pow(10, K));

		System.out.println(num);
	}
}
