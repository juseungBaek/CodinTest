package Day7;

import java.util.Arrays;
import java.util.Iterator;
// 둘만의 암호
public class Solution {
    public String solution(String s, String skip, int index) {
    	String answer = "";
    	// 해당 문자에서 옆으로 문자를 나열한다
    	//ex) a이면 a,b,c,d,e,f,g,h ....
    	// a일때 +1을해서 b로 만들었는데 b가 skip에 포함되어있으면
    	// 뛰어넘고 c로 확인을한다
    	// c가 없으면 answer에 c를 추가
    	// 이렇게 s의 문자열을 모두 반복
    	for (int i = 0; i < s.length(); i++) { 
    		char c = s.charAt(i);
    		for (int j = 0; j < index; j++) {
				c+=1;
				if(c>'z') {
					c-=26;
				}
				if(skip.contains(String.valueOf(c))) {
					j--;
				}
			}
			
    		answer += c;
		}
    	
    	
        return answer;
    }
}
