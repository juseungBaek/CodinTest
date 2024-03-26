package Day8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//명예의전당(1)
public class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        answer[0] = score[0];
        List<Integer> result = new ArrayList<>();
//        for (int i = 0; i < k; i++) {					
//			result.add(score[i]);

//			answer[i]= Collections.min(result);
//		}
        // 최소값 계산 하는 시점이 달라진다.
        // for문에서는 모든걸 다 넣고 최소값을 계산하지만
        // foreach문에서는 요소가 추가되기전에 최소값을 계산한다.
        int count = 0;
        for(int scores : score) {
        	if(count == k) {
        		break;
        	}
        	result.add(scores);
        	answer[count]= Collections.min(result);
        	count++;
        }
        for (int i = k	; i < score.length; i++) {
            int min = Collections.min(result);
            if (score[i] > min) {
                result.remove((Integer)min); 
                result.add(score[i]);
                min = Collections.min(result);
                answer[i] = min; 
            } else {
                answer[i] = answer[i - 1]; 
            }
        }
        

        return answer;
    }
}