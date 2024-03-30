class Solution {
public long solution(long n) {
    // 1부터 sqrt(n)까지의 수 중에서 x를 찾음
    for (long x = 1; x * x <= n; x++) {
        if (x * x == n) {
            return (x + 1) * (x + 1); // n이 x의 제곱이면 (x+1)의 제곱을 반환
        }
    }
    return -1; // 양의 정수 x의 제곱이 아니면 -1을 반환
}
}