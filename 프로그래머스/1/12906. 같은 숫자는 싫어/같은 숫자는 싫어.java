import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class Solution {
	   public List<Integer> solution(int[] arr) {
	        List<Integer> uniqueList = new ArrayList<>();

	        for (int i = 0; i < arr.length; i++) {
	            if (i == 0 || arr[i] != arr[i - 1]) {
	                uniqueList.add(arr[i]);
	            }
	        }

	        return uniqueList;
	    }
}