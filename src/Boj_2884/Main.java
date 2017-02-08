package Boj_2884;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] timeStr = new String[2];
		timeStr = br.readLine().split(" ");
		int hour = Integer.parseInt(timeStr[0]);
		int minute = Integer.parseInt(timeStr[1]);

		if (0 <= hour && hour <= 23) {
			if (0 <= minute && minute <= 59) {
				if (minute > 45) {
					minute = minute - 45;
				} else {
					if (hour == 0) {
						hour = 23;
					} else {
						hour = hour - 1;
					}
					minute = 60 + (minute - 45);
					if (minute == 60) {
						minute = 00;
					}
				}
			}
		}
		System.out.println(hour + " " + minute);
	}
}
