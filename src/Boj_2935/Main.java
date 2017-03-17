package Boj_2935;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		BigDecimal A = new BigDecimal(br.readLine());
		String sign = br.readLine().trim();
		BigDecimal B = new BigDecimal(br.readLine());

		if (sign.equals("*")) {
			System.out.println(A.multiply(B));
		} else if (sign.equals("+")) {
			System.out.println(A.add(B));
		}
	}
}
