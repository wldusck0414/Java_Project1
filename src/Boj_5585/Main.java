package Boj_5585;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int res = 1000 - N;
		
		int M500_Q = res / 500;
		int M500_R = res % 500;
		int M100_Q = M500_R / 100;
		int M100_R = M500_R % 100;
		int M50_Q = M100_R / 50;
		int M50_R = M100_R % 50;
		int M10_Q = M50_R / 10;
		int M10_R = M50_R % 10;
		int M5_Q = M10_R / 5;
		int M5_R = M10_R % 5;
		int M1_Q = M5_R / 1;
		
		int sum = M500_Q + M100_Q + M50_Q + M10_Q + M5_Q + M1_Q;

		System.out.println(sum);
		

	}
}
