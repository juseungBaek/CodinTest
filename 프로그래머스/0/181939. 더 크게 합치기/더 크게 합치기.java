class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String total = a + "" + b;
		String tal = b + "" + a;
		int A = Integer.parseInt(total);
		int B = Integer.parseInt(tal);
		
		if(A>B) {
			answer = A;
		}else {
			answer = B;
		}
        return answer;
        
    }
}