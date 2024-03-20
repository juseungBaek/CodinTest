package Day5;

import java.util.ArrayList;
import java.util.List;

public class Solution3 {
	public String solution(String code) {

		String answer = "";
		int idx = 0;
		List<Character> codes = new ArrayList<>();
		for (int i = 0; i < code.length(); i++) {
			if (code.charAt(i) == '1') {
				idx = (idx == 0) ? 1 : 0;

				continue;
			}
			switch (idx) {
			case 0:
				if (i % 2 == 0) {
					codes.add(code.charAt(i));
				}
				break;
			case 1:
				if (i % 2 != 0) {
					codes.add(code.charAt(i));
				}
				break;
			}

		}
		if (codes.isEmpty()) {
			return "EMPTY";
		}
		for (int i = 0; i < codes.size(); i++) {
			answer += String.valueOf(codes.get(i));
		}

		return answer;
	}
	
	
    public String solution(String code) {
        StringBuilder answer = new StringBuilder();
        int mode = 0;
        for (int i = 0; i < code.length(); i++) {
            char current = code.charAt(i);
            if (current == '1') {
                mode = mode == 0 ? 1 : 0;
                continue;
            }

            if (i % 2 == mode) {
                answer.append(current);
            }
        }
        return answer.length() == 0 ? "EMPTY" : answer.toString();
    }
}
