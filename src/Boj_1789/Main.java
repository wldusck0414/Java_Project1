package Boj_1789;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine().trim());
		
		int sum = 0;

		for (int i = 1;; i++) {
			sum += i;
			if (sum > N) {
				System.out.println(i-1);
				break;
			}
		}
	}
}
