package Boj_1181;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		Word[] word = new Word[N];

		for (int i = 0; i < N; i++) {
			word[i] = new Word(br.readLine());
		}

		Arrays.sort(word, Word.comparator);

		StringBuilder sb = new StringBuilder();
		sb.append(word[0].text).append("\n");

		for (int i = 1; i < N; i++) {
			if (!word[i - 1].text.equals(word[i].text)) {
				sb.append(word[i].text).append("\n");
			}
		}

		System.out.println(sb.toString());
	}

	private static class Word {
		public String text;

		public Word(String text) {
			this.text = text;
		}

		private static Comparator<Word> comparator = new Comparator<Word>() {

			@Override
			public int compare(Word w1, Word w2) {
				if (w1.text.length() < w2.text.length()) {
					return -1;
				}

				else if (w1.text.length() == w2.text.length()) {
					return w1.text.compareTo(w2.text);
				}

				else {
					return 1;
				}
			}
		};
	}
}
