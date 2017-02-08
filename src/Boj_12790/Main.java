package Boj_12790;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] nums = new int[N][8];
		
		for(int i=0;i<N;i++){		
			String[] numStrs = br.readLine().split(" ");
			
			for(int j=0;j<8;j++){
				nums[i][j]=Integer.parseInt(numStrs[j]);
			}
		}
				
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<N;i++){
			int res = 0;
			
			for(int j=0;j<4;j++){
				int sum = nums[i][j]+nums[i][j+4];
				
				if (j == 0) {
					if (sum < 1) {
						sum = 1;
					}

					res += sum;
				}

				else if (j == 1) {
					if (sum < 1) {
						sum = 1;
					}

					res += 5 * sum;
				}

				else if (j == 2) {
					if (sum < 0) {
						sum = 0;
					}

					res += 2 * sum;
				}

				else if (j == 3) {
					res += 2 * sum;
				}
			}
			sb.append(res).append("\n");
			}
		System.out.println(sb.toString());
		}
}
				
				
					
		
		
//		int[][] nums = new int[N][8];
//
//		for (int i = 0; i < N; i++) {
//			String[] numStrs = br.readLine().split(" ");
//
//			for (int j = 0; j < 8; j++) {
//				nums[i][j] = Integer.parseInt(numStrs[j]);
//			}
//		}
//
//		StringBuilder sb = new StringBuilder();
//
//		for (int i = 0; i < N; i++) {
//			int res = 0;
//
//			for (int j = 0; j < 4; j++) {
//				int sum = nums[i][j] + nums[i][j + 4];
//
//				if (j == 0) {
//					if (sum < 1) {
//						sum = 1;
//					}
//
//					res += sum;
//				}
//
//				else if (j == 1) {
//					if (sum < 1) {
//						sum = 1;
//					}
//
//					res += 5 * sum;
//				}
//
//				else if (j == 2) {
//					if (sum < 0) {
//						sum = 0;
//					}
//
//					res += 2 * sum;
//				}
//
//				else if (j == 3) {
//					res += 2 * sum;
//				}
//			}
//
//			sb.append(res).append("\n");
//		}
//
//		System.out.println(sb.toString());

