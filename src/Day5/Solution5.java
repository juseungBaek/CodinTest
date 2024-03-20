package Day5;

import java.util.Iterator;

public class Solution5 {
    public int solution(int[] arr, int idx) {
        int answer = -1;
        for (int i = idx; i < arr.length; i++) {
			if(arr[i] == 1) {
				answer = i;
				break;
			}
		}

        return answer;
    }
}
