package programmers.Level2;

import java.util.Arrays;

public class P42885_구명보트 {

	public static void main(String[] args) {
		int[] people = {70, 50, 80, 50};
		int limit = 100;

		System.out.println(solution(people, limit));
	}

	private static int solution(int[] people, int limit) {
		int answer = 0;

		Arrays.sort(people);

		int min = 0;

		for (int max = people.length - 1; min <= max; max--) {
			if (people[min] + people[max] <= limit) {
				min++;
			}
			answer++;
		}

		return answer;

	}

}
