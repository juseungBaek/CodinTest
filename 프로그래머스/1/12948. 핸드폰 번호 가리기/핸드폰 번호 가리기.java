import java.util.Arrays;
class Solution {
    public String solution(String phone_number) {
        String answer = "";
        char[] a = phone_number.toCharArray();
        for(int i = 0 ; i<phone_number.length()-4; i++){
            a[i]='*';
        }
        for(char b : a) {
        	answer+=b;
        }
        return answer;
    }
}