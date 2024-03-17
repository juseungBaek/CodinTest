package Day2;

public class Solution {
	/*
	 * 여름이는 강아지를 산책시키려고 합니다. 여름이는 2차원 좌표평면에서 동/서/남/북 방향으로 1m 단위로 이동하면서 강아지를 산책시킵니다.
	 * 산책루트가 담긴 문자열 route가 주어질 때, 도착점의 위치를 return하도록 빈칸을 채워 solution함수를 완성해 주세요.
	 */
	public int[] solution(String route) {
		int east = 0;
		int north = 0;
		int[] answer = new int[2];
		for (int i = 0; i < route.length(); i++) {
			switch (route.charAt(i)) {
			case 'N':
				north++;
				break;
			case 'S':
				north--;
				break;
			case 'E':
				east++;
				break;
			case 'W':
				east--;
			}
		}
		answer[0] = east;
		answer[1] = north;
		return answer;
	}

}
