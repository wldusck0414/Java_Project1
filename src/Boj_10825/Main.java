package Boj_10825;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());

		Person[] person = new Person[N];

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			person[i] = new Person(st.nextToken(), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()),
					Integer.parseInt(st.nextToken()));
		}
		Arrays.sort(person, Person.comparator);

		for (Person p : person) {
			sb.append(p.name).append("\n");
		}
		
		System.out.println(sb.toString());
	}

	private static class Person {
		public String name;
		public int korea;
		public int english;
		public int math;

		public Person(String name, int korea, int english, int math) {
			this.name = name;
			this.korea = korea;
			this.math = math;
			this.english = english;
		}

		private static Comparator<Person> comparator = new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
				if (p1.korea > p2.korea) {
					return -1;
				} else if (p1.korea == p2.korea) {
					if (p1.english < p2.english) {
						return -1;
					} else if (p1.english == p2.english) {
						if (p1.math > p2.math) {
							return -1;
						} else if (p1.math == p2.math) {
							return p1.name.compareTo(p2.name);
						} else {
							return 1;
						}
					} else {
						return 1;
					}
				} else {
					return 1;
				}

			}

		};
	}
}
