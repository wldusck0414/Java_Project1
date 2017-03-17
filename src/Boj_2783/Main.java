package Boj_2783;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		double X = Double.parseDouble(st.nextToken());
		double Y = Double.parseDouble(st.nextToken());
		
		double Q = 1000.00 / Y;
		double seven = Q * X;

		int N = Integer.parseInt(br.readLine());

		double[] num = new double[N];
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
			double x1 = Double.parseDouble(st1.nextToken());
			double y1 = Double.parseDouble(st1.nextToken());

			double Q1 = 1000.00 / y1;
			double price = Q1 * x1;

			num[i] = price;
		}
			Arrays.sort(num);
		
		System.out.println(Math.min(num[0], seven));
		
	}
}
