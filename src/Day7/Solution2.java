package Day7;
// 가장 가까운 같은 글자
public class Solution2 {
	public int[] solution(String s) {
		int[] answer = new int[s.length()];
		int count = 0;
		for (int i = 1; i < s.length(); i++) { //문자열전체 반복
			char a = s.charAt(i);		// 문자열 하나씩 가져와서
			for (int j = 0; j < i; j++) {	// 자기 앞 문자까지 반복으로 확인
				if (a == s.charAt(j)) {	//	같은 문자가있으면 비교문자 인덱스 - 현재 인덱스

					answer[i] = i - j;
				}
			}
			if (answer[i] == 0) {	// 같은 글자가 없으면 0으로 되어있어 0이면 -1로 정의
				answer[i] = -1;
			}
		}

		answer[0] = -1;	// 첫글자는 비교가 안되므로 무조건 -1
		return answer;
	}
}
