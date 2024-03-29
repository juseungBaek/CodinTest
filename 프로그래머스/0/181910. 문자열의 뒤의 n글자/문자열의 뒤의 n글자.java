class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        char a = ' ';
        for(int i = my_string.length() - n; i < my_string.length(); i++){
           a = my_string.charAt(i);
            answer += a;
        }
        return answer;
    }
}