package Day3;

import java.util.ArrayList;
import java.util.List;

public class Solution3 {

	/*
	 * 사진들을 보며 추억에 젖어 있던 루는 사진별로 추억 점수를 매길려고 합니다. 사진 속에 나오는 인물의 그리움 점수를 모두 합산한 값이 해당
	 * 사진의 추억 점수가 됩니다. 예를 들어 사진 속 인물의 이름이 ["may", "kein", "kain"]이고 각 인물의 그리움 점수가
	 * [5점, 10점, 1점]일 때 해당 사진의 추억 점수는 16(5 + 10 + 1)점이 됩니다. 다른 사진 속 인물의 이름이 ["kali",
	 * "mari", "don", "tony"]이고 ["kali", "mari", "don"]의 그리움 점수가 각각 [11점, 1점,
	 * 55점]]이고, "tony"는 그리움 점수가 없을 때, 이 사진의 추억 점수는 3명의 그리움 점수를 합한 67(11 + 1 +
	 * 55)점입니다. 그리워하는 사람의 이름을 담은 문자열 배열 name, 각 사람별 그리움 점수를 담은 정수 배열 yearning, 각 사진에
	 * 찍힌 인물의 이름을 담은 이차원 문자열 배열 photo가 매개변수로 주어질 때, 사진들의 추억 점수를 photo에 주어진 순서대로 배열에
	 * 담아 return하는 solution 함수를 완성해주세요.
	 */
//	public int[] solution(String[] name, int[] yearning, String[][] photo) {
//		int[] answer = new int[photo.length];
//
//		 List<String> person = new ArrayList<>();
//        int index = 0;
//        int count = 0;
//        for (int i = 0; i < photo.length; i++) {
//			for (int j = 0; j < photo[i].length; j++) {
//	            for(String p : name) {
//	            	if(p.equals(photo[i][j])) {
//	            		answer[i]+=yearning[index];
//
//	            	}
//	            	index++;
//	            }
//	            index=0;
//			}
//			
//		}
//
//		return answer;
//	}
	
	// 다른사람이 문제 푼 방법
	import java.util.*;

	class Solution {
	    public int[] solution(String[] name, int[] yearning, String[][] photo) {
	        int[] answer = new int[photo.length];

	        // 맵에 키와 벨류로 이름과 점수를 넣어준다.
	        HashMap<String, Integer> map = new HashMap<>();
	        for(int i = 0; i < name.length; i++) {
	            map.put(name[i], yearning[i]);
	        }

	        int sum;
	        //사진 갯수만큼 반복
	        for(int i = 0; i < photo.length; i++) {
	            sum = 0; // 사진 한번 돌고나면 점수 초기화
	            // 사진안 사람 수만큼 반복
	            for(int j = 0; j < photo[i].length; j++) {
	                // map안에있는 키와 현재 사진의 사람이름과 비교해서
	            	// 같으면 그사람의 점수 추가
	            	if(map.containsKey(photo[i][j])) 
	                    sum += map.get(photo[i][j]);
	            }   
	            answer[i] = sum;
	        }   

	        return answer;
	    }
	   // 이게 훨씬 가독성이 좋다.
	    
	}


