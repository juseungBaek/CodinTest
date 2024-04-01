import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
class Solution {
    public  List<Integer>  solution(int[] arr, int divisor) {
        int count=0;
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
			if(arr[i]%divisor==0) {
				count++;
				a.add(arr[i]);
			}
			
		}
        if(a.isEmpty()) {
        	a.add(-1);
        }
                Collections.sort(a);
        return a;
    }
}