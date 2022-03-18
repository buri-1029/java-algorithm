package programmers.courses;

import java.util.Arrays;

public class P96089_주식가격 {

	public static void main(String[] args) {
		int[] prices = {1, 2, 3, 2, 3};
		System.out.println(Arrays.toString(solution(prices)));
	}

	public static int[] solution(int[] prices) {
		int[] answer = new int[prices.length];

		for (int i = 0; i < prices.length; i++) {
			int sec = 0;
			for (int j = i + 1; j < prices.length; j++) {
				sec++;
				if (prices[i] > prices[j]) {
					break;
				}
			}
			answer[i] = sec;
		}

		return answer;
	}
}
