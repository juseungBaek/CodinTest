package Day5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
	public int[] solution(String[] keymap, String[] targets) {
		int[] result = new int[targets.length];
		HashMap<Character, Integer> key = new HashMap<>();
		int count = 0;	// 제출할 배열 인덱스
		for (String keymap1 : keymap) {	//keymap에있는 문자들의 몇번 눌려야되는지 간편하게 정리
			for (int i = 0; i < keymap1.length(); i++) {	// 각 인덱스의 문자열을 문자로 구분
				char character = keymap1.charAt(i);		
				// 번호가있으면 기존에 있는 정수로 없으면 최대 정수로
				int currentMin = key.getOrDefault(character, Integer.MAX_VALUE);
				 // 해당 문자에 대해 키값과 벨류값으로 기존의 정수랑 새로들어온 정수 비교하여 낮은 정수를 벨류값으로
				key.put(keymap1.charAt(i), Math.min(currentMin, i + 1));

			}
		}

		for (String target : targets) {	//	targets배열 안에있는 문자열을 문자로 변환하기위한 1단계
			for (int j = 0; j < target.length(); j++) {	// 각 요소 문자열을 문자로 변환
			if (key.containsKey(target.charAt(j))) {	// HashMap 값에 현재 문자가 포함되어있는지 확인
					result[count] += key.get(target.charAt(j));	// 포함이되어있으면 제출할 배열 해당 인덱스에 눌려야할 정수 추가
				} else {
					result[count] = -1;	// 해당 문자가 없다면 -1로 반환
					break;
				}
			}
			count++;	// 제출할 배열 인덱스 번호
		}

		return result;
	}
}
