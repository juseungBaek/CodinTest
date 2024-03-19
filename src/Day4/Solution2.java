package Day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution2 {
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
