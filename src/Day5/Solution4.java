package Day5;

import java.util.ArrayList;

public class Solution4 {
    public int[] solution(int l, int r) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            if (isZeroFiveNumber(i)) {
                result.add(i);
            }
        }

        if (result.isEmpty()) {
            return new int[]{-1};
        } else {
            return result.stream().mapToInt(Integer::intValue).toArray();
        }
    }

    private boolean isZeroFiveNumber(int num) {
        String strNum = String.valueOf(num);
        for (char ch : strNum.toCharArray()) {
            if (ch != '0' && ch != '5') {
                return false;
            }
        }
        return true;
    }
}
