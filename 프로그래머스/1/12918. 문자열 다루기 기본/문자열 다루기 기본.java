class Solution {
	public boolean solution(String s) {
		boolean answer = true;
		if(s.matches(".*[a-zA-Z].*")) {
			answer = false;
		}else if(s.length()!=4&&s.length()!=6) {

			answer = false;
		}
		
		return answer;
	}
}