package Boj_5597;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] num = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,
				19,20,21,22,23,24,25,26,27,28,29,30};
		int[] nums = new int[30];
		
		for(int i = 1; i<=28;i++){
			nums[i] = Integer.parseInt(br.readLine().trim());
		}
		
		for(int i = 1; i<=28; i++){
			int temp = nums[i];
			num[temp] = 0;				
			}
		for(int i = 1;i<=30;i++){
			int temp = num[i];
			if(temp != 0){ 
				System.out.println(num[i]);
			}
		}
	}
}
