package Boj_2577;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		br.close();
		
		int[] num = new int[10];
		String ABC = String.valueOf(A*B*C);
		char [] ABC2 = ABC.toCharArray();
		
		for (int i = 0; i < ABC2.length; i++) {
			num[Character.getNumericValue(ABC2[i])]++;
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int num2 : num){      // for (int num2=0; num2<num.length; num2++)
			sb.append(num2).append("\n");
			//System.out.println(num2+"\n");
			
			
		}
		System.out.println(sb.toString());
	}
	
}
