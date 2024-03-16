package Solution;

public class Solution2 {
    public int[] solution(int start, int end_num) {

/*
 * 문제
 * 정수 start_num와 end_num가 주어질 때, start_num에서 end_num까지 
 * 1씩 감소하는 수들을 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
 */
        int[] answer = new int[start-end_num+1]; // 시작정수부터 끝 정수까지의 모든 정수를 담을 수 있는 배열 생성 
        int count = 0; // 배열 index를 올려줄 정수 생성
        for (int i = start; i >= end_num; i--) { // start의 정수부터 -1씩 감소하면서 담겨야하기때문
			answer[count] = start-count;		 // i를 start로 정의해주고 -1씩 감소하면서 담기
			count++;
		}
        return answer;
    }
}
