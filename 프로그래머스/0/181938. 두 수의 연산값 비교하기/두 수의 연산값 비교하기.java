class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String total = Integer.toString(a)+Integer.toString(b);
    	int total1 = Integer.parseInt(total);
    	int ev = 2 * a * b;
    	if(total1 > ev ) {
    	    answer = total1;
    	}else if (total1 < ev) {
    		answer = ev;
    	} else {
    		answer = total1;
    	}
        return answer;
    }
}