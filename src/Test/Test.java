package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import Day8.Solution;

public class Test {
	public static void main(String[] args) {
		Solution s1 = new Solution();

		int k = 4;
		int[] score = {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000};
//        List<Integer> result = new ArrayList<>();
//        result.add(score[0]);
//        result.add(score[1]);
//        result.add(score[2]);
//
//			int min = Collections.min(result);
//System.out.println(min);

		System.out.println(Arrays.toString(s1.solution(k,score)));


	}

}
