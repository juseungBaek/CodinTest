class Solution {
	public int[] solution(String s) {
		int[] answer = new int[s.length()];
		int count = 0;
		for (int i = 1; i < s.length(); i++) {
			char a = s.charAt(i);
			for (int j = 0; j < i; j++) {
				if (a == s.charAt(j)) {

					answer[i] = i - j;
				}
			}
			if (answer[i] == 0) {
				answer[i] = -1;
			}
		}

		answer[0] = -1;
		return answer;
	}
}