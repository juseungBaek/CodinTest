class Solution {
	public int solution(int num) {
		int answer = num;
		int count = 0;
		boolean start = true;

		while (start) {
			if (answer == 1) {
				start=false;
				break;
			}
			if(count==500) {
				count = -1;
				break;
			}
			if (answer % 2 == 0) {
				answer /= 2;
			} else if (answer % 2 == 1) {
				answer = answer * 3 + 1;
			}

			count++;
		}
		return count;
	}
}