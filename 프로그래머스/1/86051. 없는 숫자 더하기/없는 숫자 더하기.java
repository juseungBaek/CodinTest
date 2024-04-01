class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int[] abc = new int[10];
        for (int i = 0; i < 10; i++) {
			for (int j = 0; j < numbers.length; j++) {
				if(i==numbers[j]) {
					abc[i]=numbers[j];
				}
			}
		}
        for (int i = 1; i < abc.length; i++) {
			if(abc[i]==0) {
				answer+=i;
			}
			
		}
        return answer;
    }
}