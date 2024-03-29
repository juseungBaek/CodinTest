class Solution {
    public String solution(String my_string, int[] indices) {
        char[] arr = my_string.toCharArray();
        for(int i : indices) {
            arr[i] = ' ';
        }
        StringBuilder sb=  new StringBuilder();
        for(int i=0; i<arr.length; i++) {
            if(arr[i] != ' ') {
                sb.append(arr[i]);
            }
        }
        return sb.toString();
    }
}