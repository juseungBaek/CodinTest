package Day5;

public class Solution2 {
    public String solution(String[] cards1, String[] cards2, String[] goal) {

        int idx1 = 0;	// cards1 배열 인덱스
        int idx2 = 0;	// cards2 배열 인덱스
        
        for(String word : goal) {	// 비교할 배열을 문자열로 구분
        	// 현재 인덱스번호가 cards1길이보다 짧고, 현재 문자열이 cards1의 인덱스랑 비교해서 같은지
        	if(idx1<cards1.length&&word.equals(cards1[idx1])) {
        		// 같으면 cards1의 인덱스 번호 증가
        		idx1++;
        	}else if(idx2<cards2.length&&word.equals(cards2[idx2])) {
        		// 현재 인덱스번호가 cards2길이보다 짧고, 현재 문자열이 cards1의 인덱스랑 비교해서 같은지
        		// 같으면 cards2의 인덱스 번호 증가
        		idx2++;
        	}else {
        		return "No";
        	}
        }
        
        return "Yes";
    }
    /*
    배열 cards1, cards2를 차례대로 확인하여 goal 배열의 요소와 정확하게 일치하는지 확인하는 문제다.
    배열 cards1과 cards2에 해당하는 인덱스 idx1, idx2를 선언한다.
    for-each 문을 통해 goal 배열을 순회하면서 goal의 요소를 currentStr에 담는다.
    currentStr이 cards1[idx1] 또는 cards[idx2]에 존재하는지 확인하여 존재하는 경우 해당 idx를 증가시킨다.
    위 조건을 만족시키지 못하는 경우 goal 배열과 완벽히 일치하게 만들 수 없으므로 "No"를 반환하고, 
    반복문을 무사히 마치면 "Yes"를 반환한다.
    */
}
