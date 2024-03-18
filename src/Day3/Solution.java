package Day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution {
	/*
	 * AI 엔지니어인 현식이는 데이터를 분석하는 작업을 진행하고 있습니다. 데이터는 ["코드 번호(code)", "제조일(date)",
	 * "최대 수량(maximum)", "현재 수량(remain)"]으로 구성되어 있으며 현식이는 이 데이터들 중 조건을 만족하는 데이터만 뽑아서
	 * 정렬하려 합니다.
	 */
	// 내가 문제 푼 방법
	/*
	public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
	    int count = 0;
	    int select = 0;

	    switch (ext) {
	        case "code":
	            for (int i = 0; i < data.length; i++) {
	                if (data[i][0] < val_ext) {
	                    count++;
	                }
	            }
	            break;
	        case "date":
	            for (int i = 0; i < data.length; i++) {
	                if (data[i][1] < val_ext) {
	                    count++;
	                }
	            }
	            break;
	        case "maximum":
	            for (int i = 0; i < data.length; i++) {
	                if (data[i][2] < val_ext) {
	                    count++;
	                }
	            }
	            break;
	        case "remain":
	            for (int i = 0; i < data.length; i++) {
	                if (data[i][3] < val_ext) {
	                    count++;
	                }
	            }
	            break;
	    }

	    int[][] answer = new int[count][data[0].length];

	    int index = 0;
	    switch (ext) {
	        case "code":
	            for (int i = 0; i < data.length; i++) {
	                if (data[i][0] < val_ext) {
	                    for (int j = 0; j < data[0].length; j++) {
	                        answer[index][j] = data[i][j];
	                    }
	                    index++;
	                }
	            }
	            break;
	        case "date":
	            for (int i = 0; i < data.length; i++) {
	                if (data[i][1] < val_ext) {
	                    for (int j = 0; j < data[0].length; j++) {
	                        answer[index][j] = data[i][j];
	                    }
	                    index++;
	                }
	            }
	            break;
	        case "maximum":
	            for (int i = 0; i < data.length; i++) {
	                if (data[i][2] < val_ext) {
	                    for (int j = 0; j < data[0].length; j++) {
	                        answer[index][j] = data[i][j];
	                    }
	                    index++;
	                }
	            }
	            break;
	        case "remain":
	            for (int i = 0; i < data.length; i++) {
	                if (data[i][3] < val_ext) {
	                    for (int j = 0; j < data[0].length; j++) {
	                        answer[index][j] = data[i][j];
	                    }
	                    index++;
	                }
	            }
	            break;
	    }

	    switch (sort_by) {
	        case "code":
	            Arrays.sort(answer, Comparator.comparingInt(o -> o[0]));
	            break;
	        case "date":
	            Arrays.sort(answer, Comparator.comparingInt(o -> o[1]));
	            break;
	        case "maximum":
	            Arrays.sort(answer, Comparator.comparingInt(o -> o[2]));
	            break;
	        case "remain":
	            Arrays.sort(answer, Comparator.comparingInt(o -> o[3]));
	            break;
	    }

	    return answer;
	}
*/
	// 다른사람이 문제 푼 방법

	    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
	        List<int[]> list = new ArrayList<>();
	        for(int[] d : data){
	            if(ext.equals("code")){
	                if(d[0] < val_ext) list.add(d);
	            } else if(ext.equals("date")){
	                if(d[1] < val_ext) list.add(d);
	            } else if(ext.equals("maximum")){
	                if(d[2] < val_ext) list.add(d);
	            } else{
	                if(d[3] < val_ext) list.add(d);
	            }
	        }
	        if(sort_by.equals("code")){
	            list.sort((o1, o2) -> o1[0] - o2[0]);
	        } else if(sort_by.equals("date")){
	            list.sort((o1, o2) -> o1[1] - o2[1]);
	        } else if(sort_by.equals("maximum")){
	            list.sort((o1, o2) -> o1[2] - o2[2]);
	        } else{
	            list.sort((o1, o2) -> o1[3] - o2[3]);
	        }
	        int[][] answer = new int[list.size()][data[0].length];
	        for(int i = 0; i < answer.length; i++){
	            answer[i] = list.get(i);
	        }
	        return answer;
	    }

	    // 런타임시간이 확연하게 차이가 나며 코드가 간결하다.
	    // 너무 복잡하게 생각할 필요는 없는 것 같다.

}
