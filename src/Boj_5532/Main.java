package Boj_5532;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int Max = 0;

		int[] HW = new int[4];
		for (int i = 0; i < 4; i++) {
			HW[i] = Integer.parseInt(br.readLine());
		}

		int KD = HW[0] / HW[2];
		int MD = HW[1] / HW[3];

		if (KD > MD) {
			if (HW[0] % HW[2] > 0) {
				KD = KD + 1;
				Max = N - KD;
			} else if (HW[0] % HW[2] == 0) {
				Max = N - KD;
			}
			System.out.println(Max);
		} else if (KD < MD) {
			if (HW[1] % HW[3] > 0) {
				MD = MD + 1;
				Max = N - MD;
			} else if (HW[1] % HW[3] == 0) {
				Max = N - MD;
			}
			System.out.println(Max);
		} else if (KD == MD) {
			if (HW[0] % HW[2] > 0 && HW[1] % HW[3] > 0) {
				KD = KD + 1;
				Max = N - KD;
			}else if(HW[0] % HW[2] == 0 && HW[1] % HW[3] == 0){
				Max = N - KD;
			}
			System.out.println(Max);
		}
	}
}
