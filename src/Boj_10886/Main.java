package Boj_10886;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	private static final int CUTE = 1;
	private static final int NOT_CUTE = 0;

	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int people = Integer.parseInt(br.readLine());
		int res = 0;

		for (int i = 0; i < people; i++) {
			int vote = Integer.parseInt(br.readLine());

			if (vote == CUTE)
				res++;
			else
				res--;
		}

		if (res > 0) {
			System.out.println("Junhee is cute!");
		} else {
			System.out.println("Junhee is not cute!");
		}
	}

}
