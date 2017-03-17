package Boj_10814;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
	private static final String SPACE = " ";
	private static final String NEW_LINE = "\n";

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Person[] persons = new Person[N];

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			persons[i] = new Person(i, Integer.parseInt(st.nextToken()), st.nextToken());
		}

		br.close();

		Arrays.sort(persons, Person.comparator);

		StringBuilder sb = new StringBuilder();

		for (Person p : persons) { 
			sb.append(p.age).append(SPACE).append(p.name).append(NEW_LINE);
		}
		
//		for(int i = 0; i < N; i++){
//			sb.append(persons[i].ageµîµî).
//		}

		System.out.println(sb.toString());
	}

	private static class Person {
		public int idx;
		public int age;
		public String name;

		public Person(int idx, int age, String name) {
			this.idx = idx;
			this.age = age;
			this.name = name;
		}

		private static Comparator<Person> comparator = new Comparator<Main.Person>() {
			@Override
			public int compare(Person p1, Person p2) {
				if (p1.age < p2.age) {
					return -1;
				}

				else if (p1.age == p2.age) {
					if (p1.idx < p2.idx) {
						return -1;
					}

					else {
						return 1;
					}
				}

				else {
					return 1;
				}
			}
		};
	}
}
