package Boj_10707;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] num = new int[5];

		for (int i = 0; i < 5; i++) {
			num[i] = Integer.parseInt(br.readLine());
		}
			int X_cost = num[0] * num[4];
			int Y_cost = 0;
			
			if (num[4] <= num[2]) {
				Y_cost = num[1];
			} else {
				Y_cost = num[1] + (num[4] - num[2]) * num[3];
			}
			
			if(X_cost>Y_cost){
				System.out.println(Y_cost);
			} else {
				System.out.println(X_cost);
			}
		

	}
}
