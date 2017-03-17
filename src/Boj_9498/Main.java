package Boj_9498;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		if (N <= 100 && N >= 90) {
			System.out.println("A");
		} else if (N <= 89 && N >= 80) {
			System.out.println("B");
		} else if (N <= 79 && N >= 70) {
			System.out.println("C");
		} else if (N <= 69 && N >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}
}
