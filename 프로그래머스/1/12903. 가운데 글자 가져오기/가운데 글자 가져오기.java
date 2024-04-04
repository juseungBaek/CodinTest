class Solution {
    public String solution(String s) {
        String answer = "";
        if(s.length()%2==1) {
        	int count = s.length()/2;
        	answer = Character.toString(s.charAt(count));
        }else {
        	int count = s.length()/2;
        	char a = s.charAt(count-1);
        	char b = s.charAt(count);
        	answer = Character.toString(a)+b;
        }
        return answer;
    }
}