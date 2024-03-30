

public class Solution {
    public int solution(int n) {
        int answer = 0;

        String result = n+"";
        String[] result2 = new String[result.length()];
        for (int i = 0; i < result.length(); i++) {
			result2[i]=Character.toString(result.charAt(i));
		}
        
        for (int i = 0; i < result2.length; i++) {
			answer += Integer.parseInt(result2[i]);
		}


        return answer;
    }
}