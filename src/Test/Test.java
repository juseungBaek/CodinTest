package Test;

import java.util.Arrays;

import Day3.Solution3;

public class Test {
	public static void main(String[] args) {

		Solution3 s1 = new Solution3();

		String[] name = {"may", "kein", "kain", "radi"};
		int[] yearning = {5, 10, 1, 3};
		String[][] photo = {{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};
//		String[] name = {"kali", "mari", "don"};
//		int[] yearning = {11, 1, 55};
//		String[][] photo = {{"kali", "mari", "don"}, {"pony", "tom", "teddy"}, {"con", "mona", "don"}};
		System.out.println(Arrays.toString(s1.solution(name, yearning, photo)));
		
	
	}
	

}
