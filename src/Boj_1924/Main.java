package Boj_1924;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int Month = Integer.parseInt(st.nextToken());
		int Day = Integer.parseInt(st.nextToken());
		int month = 0;
		int total = 0;

		for (int i = 0; i < Month; i++) {

			switch (i) {
			case 0:
				month = 0;
				break;
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				month = 31;
				break;
			case 2:
				month = 28;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				month = 30;
				break;
			}
			total += month;
		}
		total += Day;

		switch (total % 7) {
		case 0:
			System.out.println("SUN");
			break;
		case 1:
			System.out.println("MON");
			break;
		case 2:
			System.out.println("TUE");
			break;
		case 3:
			System.out.println("WED");
			break;
		case 4:
			System.out.println("THU");
			break;
		case 5:
			System.out.println("FRI");
			break;
		case 6:
			System.out.println("SAT");
			break;
		}
	}
}
