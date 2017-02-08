package Boj_5554;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] s = new int[4];
		int sum = 0;

		for (int i = 0; i < 4; i++) {
			s[i] = Integer.parseInt(br.readLine());
			sum += s[i];
		}

		int minute = sum / 60;
		int second = sum % 60;

		System.out.println(minute);
		System.out.println(second);

	}
}
