package Boj_5565;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int total = Integer.parseInt(br.readLine());
		int[] price = new int[9];
		
		for(int i=0;i<9;i++){
			price[i] = Integer.parseInt(br.readLine());
			total -= price[i];
		}
		System.out.println(total);
	}
}
