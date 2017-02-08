package Boj_2822;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
	private static final String SPACE = " ";

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Person[] persons = new Person[8];

		for (int i = 1; i <= 8; i++) {
			persons[i - 1] = new Person(i, Integer.parseInt(br.readLine().trim()));
		}

		br.close();

		Arrays.sort(persons, Person.comparatorByScore);
		Arrays.sort(persons, 0, 5, Person.comparatorByIdx);
		
		int sum = 0;
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < 5; i++) {
			sum += persons[i].score;
			sb.append(persons[i].idx).append(SPACE);
		}

		System.out.println(sum);
		System.out.println(sb.toString());
	}

	private static class Person {
		public int idx;
		public int score;

		public Person(int idx, int score) {
			this.idx = idx;
			this.score = score;
		}

		public static Comparator<Person> comparatorByScore = new Comparator<Main.Person>() {
			@Override
			public int compare(Person p1, Person p2) {
				if (p1.score > p2.score) {
					return -1;
				}

				else if (p1.score == p2.score) {
					return 0;
				}

				else {
					return 1;
				}
			}
		};

		public static Comparator<Person> comparatorByIdx = new Comparator<Main.Person>() {
			@Override
			public int compare(Person p1, Person p2) {
				if (p1.idx < p2.idx) {
					return -1;
				}

				else if (p1.idx == p2.idx) {
					return 0;
				}

				else {
					return 1;
				}
			}
		};
	}
}
