package Boj_2851;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws Exception {
		// ���۸� ���� �Է� ���� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// �� ���� ���� ����
		int totalPoint = 0;

		for (int i = 0; i < 10; i++) {
			int currentPoint = Integer.parseInt(br.readLine());
			int currentDistance = 100 - totalPoint;

			// 100���� �־��� ����� ���� ��� ������ Ż��
			if (Math.abs(currentDistance) < Math.abs(currentDistance - currentPoint)) {
				break;
			}

			// �� ������ ���� ������ ����
			totalPoint += currentPoint;
		}

		br.close();

		// ��� �� ���
		System.out.println(totalPoint);
	}
}
