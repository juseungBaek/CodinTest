import java.util.Arrays;
class Solution {
    public int[] solution(int[] list) {
        Arrays.sort(list);
        int[] answer = new int[list.length-5];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list[list.length - 1 - i];
        }
        Arrays.sort(answer); 
        return answer;
    }
}