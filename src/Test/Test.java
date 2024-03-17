package Test;

import java.util.Arrays;

import Day2.Solution4;

public class Test {
	public static void main(String[] args) {

		Solution4 s1 = new Solution4();
		
		String[][] color = {{"blue", "red", "orange", "red"}, {"red", "red", "blue", "orange"}, {"blue", "orange", "red", "red"}, {"orange", "orange", "red", "blue"}};
		int h = 1;
		int w = 1;
		int width = color[0][1].length();
		System.out.println(width);
//        System.out.println(s1.solution(color, h, w));
	}
	

}
