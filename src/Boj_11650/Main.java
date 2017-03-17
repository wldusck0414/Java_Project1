package Boj_11650;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		Num[] num = new Num[N];

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			num[i] = new Num(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		}

		Arrays.sort(num, Num.comparator);

		StringBuilder sb = new StringBuilder();
		
		for (Num n : num) {
				sb.append(n.x).append(" ").append(n.y).append("\n");
		}
		System.out.println(sb.toString());
	}

	private static class Num {
		public int x;
		public int y;

		public Num(int x, int y) {
			this.x = x;
			this.y = y;
		}

		private static Comparator<Num> comparator = new Comparator<Num>() {

			@Override
			public int compare(Num n1, Num n2) {
				if (n1.x < n2.x) {
					return -1;
				} else if (n1.x == n2.x) {
					if (n1.y < n2.y) {
						return -1;
					} else {
						return 1;
					}
				} else {
					return 1;
				}
			}
		};
	}
}
