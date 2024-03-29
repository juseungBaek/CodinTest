class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int total = 0;
		int total1 = num_list[0];
		
		for (int i = 0; i < num_list.length; i++) {
			total += num_list[i];
			
			
		}
		total = total * total;
		for (int i = 1; i < num_list.length; i++) {
			total1 *= num_list[i];
		} 
		
		if(total> total1) {
			answer = 1;
		}else if(total< total1) {
			answer = 0;
		}
        return answer;
    }
}