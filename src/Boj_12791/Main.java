package Boj_12791;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

	private static final String NEW_LINE = "\n";
	private static final String SPACE = " ";
	private static HashMap<Integer, String[]> albums = new HashMap<>();

	public static void main(String args[]) throws Exception {

		albums.put(1967, new String[] { "DavidBowie" });
		albums.put(1969, new String[] { "SpaceOddity" });
		albums.put(1970, new String[] { "TheManWhoSoldTheWorld" });
		albums.put(1971, new String[] { "HunkyDory" });
		albums.put(1972, new String[] { "TheRiseAndFallOfZiggyStardustAndTheSpidersFromMars" });
		albums.put(1973, new String[] { "AladdinSane", "PinUps" });
		albums.put(1974, new String[] { "DiamondDogs" });
		albums.put(1975, new String[] { "YoungAmericans" });
		albums.put(1976, new String[] { "StationToStation" });
		albums.put(1977, new String[] { "Low", "Heroes" });
		albums.put(1979, new String[] { "Lodger" });
		albums.put(1980, new String[] { "ScaryMonstersAndSuperCreeps" });
		albums.put(1983, new String[] { "LetsDance" });
		albums.put(1984, new String[] { "Tonight" });
		albums.put(1987, new String[] { "NeverLetMeDown" });
		albums.put(1993, new String[] { "BlackTieWhiteNoise" });
		albums.put(1995, new String[] { "1.Outside" });
		albums.put(1997, new String[] { "Earthling" });
		albums.put(1999, new String[] { "Hours" });
		albums.put(2002, new String[] { "Heathen" });
		albums.put(2003, new String[] { "Reality" });
		albums.put(2013, new String[] { "TheNextDay" });
		albums.put(2016, new String[] { "BlackStar" });

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int Q = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();

		while (Q-- != 0) {

			StringTokenizer st = new StringTokenizer(br.readLine(), " ");

			int S = Integer.parseInt(st.nextToken());
			int E = Integer.parseInt(st.nextToken());

			StringBuilder sb2 = new StringBuilder();
			int albumCnt = 0;

			for (int i = S; i <= E; i++) {
				String[] musicNames = albums.get(i);

				if (musicNames != null) {
					for (String musicName : musicNames) {
						albumCnt++;
						sb2.append(i).append(SPACE).append(musicName).append(NEW_LINE);
					}
				}
			}
			sb.append(albumCnt).append(NEW_LINE);
			sb.append(sb2);
		}
		br.close();
		System.out.println(sb.toString());
	}
}
