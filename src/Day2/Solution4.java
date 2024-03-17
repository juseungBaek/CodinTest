package Day2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution4 {
	
/*
각 칸마다 색이 칠해진 2차원 격자 보드판이 있습니다. 그중 한 칸을 골랐을 때, 위, 아래, 왼쪽, 오른쪽 칸 중 
같은 색깔로 칠해진 칸의 개수를 구하려고 합니다.
보드의 각 칸에 칠해진 색깔 이름이 담긴 이차원 문자열 리스트 board와 고른 칸의 위치를 나타내는 
두 정수 h, w가 주어질 때 board[h][w]와 이웃한 칸들 중 같은 색으로 칠해져 있는 칸의 개수를 return 하도록 solution 함수를 완성해 주세요.
이웃한 칸들 중 몇 개의 칸이 같은 색으로 색칠되어 있는지 확인하는 과정은 다음과 같습니다.
 */
	public int solution(String[][] board, int h, int w) {
	    int count = 0; // 몇개가 같은지 카운트 할 변수 생성
	    String targetColor = board[h][w];	// 현재 지정된 자리의 색 저장할 변수 생성
	    int height = board.length;	// 높이의 길이 
	    int width = board[0].length;	// 가로의 길이

	    if (h > 0 && board[h - 1][w].equals(targetColor))		    // 위쪽 확인
	        count++;

	    if (h < height - 1 && board[h + 1][w].equals(targetColor))  // 아래쪽 확인
	        count++;

	    if (w > 0 && board[h][w - 1].equals(targetColor))			// 왼쪽 확인
	        count++;

	    if (w < width - 1 && board[h][w + 1].equals(targetColor))	// 오른쪽 확인
	        count++;

	    return count;
	}
}
