class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        int p = 0;
        int y = 0;
        for (int i = 0; i < s.length(); i++) {
			Character ch = s.charAt(i);
			System.out.println(ch);
			if(ch.equals('p')||ch.equals('P')) {
				p+=1;
			}else if(ch.equals('y')||ch.equals('Y')) {
				y+=1;
			}
		}
        System.out.println(p);
        System.out.println(y);
        if(p!=y) {
        	answer=false;
        }

        return answer;
    }
}