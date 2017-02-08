package Boj_2920;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String line = br.readLine();
		String[] strs = line.split(" "); 

		br.close();

		int before = Integer.parseInt(strs[0]);  // 문자열 값을 숫자로 변환
		 										 // before은 strs[0](문자열 값)을 숫자로 변환시킨 것. 
		boolean isAscending = false;
		boolean isDescending = false;

		for (int i = 1; i < strs.length; i++) {
			int num = Integer.parseInt(strs[i]);
			
			
			if (before < num) {
				isAscending = true;
			} else if (before > num) {
				isDescending = true;
			} else {
				isAscending = false;
				isDescending = false;
			}
			before = num;
		}
		if (isAscending && isDescending) {
			System.out.println("mixed");
		} else if (isAscending && !isDescending) {
			System.out.println("ascending");
		} else {
			System.out.println("descending");
		}

	}

}
