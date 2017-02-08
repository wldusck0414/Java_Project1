import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	private static final String NEW_LINE = "\n";

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] cnts = new int[3][101];
		int[][] persons = new int[N][3];

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");

			for (int j = 0; j < 3; j++) {
				persons[i][j] = Integer.parseInt(st.nextToken());
				cnts[j][persons[i][j]]++;
			}

		}

		br.close();

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < N; i++) {
			int sum = 0;

			for (int j = 0; j < 3; j++) {
				if (cnts[j][persons[i][j]] != 1) {
					persons[i][j] = 0;
				}

				sum += persons[i][j];
			}

			sb.append(sum).append(NEW_LINE);
		}

		System.out.println(sb.toString());
	}
}