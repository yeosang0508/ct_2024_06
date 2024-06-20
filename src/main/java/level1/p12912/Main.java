package level1.p12912;

public class Main {
}

class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        long num1 = a;
        long num2 = b;

        if(num1 > num2) {
            for(;num2 <= num1; num2++) {
                answer += num2;
            }
        } else {
            for(;num1 <= num2; num1++) {
                answer += num1;
            }
        }
        return answer;
    }
}