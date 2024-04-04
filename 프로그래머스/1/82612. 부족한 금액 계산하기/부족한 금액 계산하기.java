class Solution {
    public long solution(int price, int money, int count) {
	        long answer = 0;
	        long result = 0;
	        for (int i = 1; i <= count; i++) {
				
				result += price*i;
	        }
	        answer = money - result; 
	 
	        answer = answer>=0 ? 0:Math.abs(answer);
	        return answer;
	    }
}