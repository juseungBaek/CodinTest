import java.util.Arrays;
class Solution {
    public String solution(String phone_number) {
        String answer = "";
        char[] a = phone_number.toCharArray();
        System.out.println(Arrays.toString(a));
        for(int i = 0 ; i<phone_number.length(); i++){
            answer += i<phone_number.length()-4 ? "*":phone_number.charAt(i);
        }
        
        return answer;
    }
}