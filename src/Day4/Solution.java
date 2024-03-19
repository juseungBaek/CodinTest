package Day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//바탕화면 정리
public class Solution {
    public int[] solution(String[] wallpaper) {
    	// i = hegith
    	// j = width
        int[] answer = new int[4];
        List<Integer> mega = new ArrayList<>();
        List<Integer> coffee = new ArrayList<>();
        List<Integer> hi = new ArrayList<>();
        int h = 0;
        int w = 0;
        for (int i = 0; i < wallpaper.length; i++) {
			for (int j = 0; j < wallpaper[0].length(); j++) {
				if(wallpaper[i].charAt(j)=='#') {
					mega.add(i);
					mega.add(j);
				}
			}
		}
        for (int i = 0; i < mega.size(); i++) {
			if(i%2==0) {
				coffee.add(mega.get(i));
			}else {
				hi.add(mega.get(i));
			}
		}
       int maxh= Collections.max(coffee);
       int maxw= Collections.max(hi);
       int minh= Collections.min(coffee);
       int minw= Collections.min(hi);
       answer[0] = minh;
       answer[1] = minw;
       answer[2] = maxh+1;
       answer[3] = maxw+1;
        return answer;
    }
    
    // 다른 사람이 문제 푼 방법
    public int[] solution(String[] wallpaper) {
    	// 0으로 초기화를 하지 않는 이유는 좌표값이 0이 될수도있는데
    	// 0과 0은 비교를 하면 에러가 나기때문에 최소값과 최대값으로 초기화를 해놓았다.
        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        int maxY = Integer.MIN_VALUE;
        for(int i=0; i< wallpaper.length;i++ ){
            for(int j=0; j<wallpaper[i].length();j++){
                if(wallpaper[i].charAt(j)=='#'){
                    minX = Math.min(minX,i);
                    minY = Math.min(minY,j);
                    maxX = Math.max(maxX,i);
                    maxY = Math.max(maxY,j);
                }
            }
        }
        return new int[]{minX,minY,maxX+1,maxY+1};
    }
    // Math. 클래스를 사용하여 조금더 간결하게 구할수가 있다.
}
