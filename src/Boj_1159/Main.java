package Boj_1159;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		String[] name = new String[N];

		for (int i = 0; i < N; i++) {
			name[i] = br.readLine();
		}
		for (int i = 0; i < N; i++) {
			int cnt = 0;
			String standard = name[i];
			for (int j = 0; j < N; j++) {
				if (standard.substring(0, 2).equals(name[j].substring(0, 2))) {
					cnt++;
					if (cnt >= 5) {
						sb.append(standard.substring(0, 2)).append(" ");
					}
				} else {
					System.out.println("PREDAJA");
				}

			}
		}
		System.out.println(sb.toString());
	}
}