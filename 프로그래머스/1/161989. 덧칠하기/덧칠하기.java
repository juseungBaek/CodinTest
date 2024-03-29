
class Solution {
	public int solution(int n, int m, int[] section) {
		int answer = 0;
		int count = 0;
		for(int color : section) {
			if(count<= color) {
				answer++;
				count=color+m;
			}
		}
		return answer;
	}
}