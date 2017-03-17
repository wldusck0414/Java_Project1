package Boj_5576;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] W = new int[10];
		int[] K = new int[10];
		int Wsum = 0, Ksum = 0;

		for (int i = 0; i < 10; i++) {
			W[i] = Integer.parseInt(br.readLine());
		}
		for (int i = 0; i < 10; i++) {
			K[i] = Integer.parseInt(br.readLine());
		}

		Arrays.sort(W);
		Arrays.sort(K);

		for (int i = 7; i < 10; i++) {
			Wsum += W[i];
			Ksum += K[i];
		}

		System.out.println(Wsum + " " + Ksum);
	}
}
