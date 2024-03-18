package Test;

import java.util.Arrays;

import Day3.Solution;

public class Test {
	public static void main(String[] args) {

		Solution s1 = new Solution();
		int[][] data = {{1, 20300104, 100, 80}, {2, 20300804, 847, 37}, {3, 20300401, 10, 8}};
		String ext = "date";
		int val_ext = 20300501;
		String sort_by = "remain";
		
		System.out.println(Arrays.toString(s1.solution(data, ext, val_ext, sort_by)));
		
	}
	

}
