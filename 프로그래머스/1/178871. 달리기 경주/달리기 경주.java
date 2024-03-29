import java.util.HashMap;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = players;
		String[] player = {"mumu", "soe", "poe", "kai", "mine"} ;
		String[] calling = {"kai", "kai", "mine", "mine"};
        // 현재 선수들의 이름과 등수가 들어간다
        HashMap<String, Integer> pla = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
			pla.put(players[i], i);
		}
        for (int i = 0; i < callings.length; i++) {
        	// 현재 불린 선수의 등수
			int rank = pla.get(callings[i]);

			// 순서가 바뀔 선수의 이름
			String name = answer[rank-1];
			
			answer[rank] = name;
			answer[rank-1]=callings[i];
			pla.put(callings[i], rank-1);
			pla.put(name, rank);

		}

	
        return answer;
    }
}