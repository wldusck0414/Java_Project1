package Boj_1427;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String num = br.readLine();
		char[] charNum = num.toCharArray();
		
		Arrays.sort(charNum);

		for (int i = charNum.length-1; i >= 0; i--) {
			sb.append(charNum[i]);
		}
		System.out.println(sb.toString());
	}
}