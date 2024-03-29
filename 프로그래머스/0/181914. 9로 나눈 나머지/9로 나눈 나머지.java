class Solution {
    public int solution(String number) {
        int answer = 0;
        	for(int i=0; i<number.length();i++) {
			answer += number.charAt(i)-'0'; 
		}
        if(answer%9 == 0){
            answer = answer%9;
        }else if(answer%9 != 0){
            answer = answer%9;
        }
        return answer;
    }
}