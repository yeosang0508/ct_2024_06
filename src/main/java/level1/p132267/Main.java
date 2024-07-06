package level1.p132267;

public class Main {
}
 class Solution {
    public int solution(int a, int b, int n) {
        // a : 내가 줘야하는 양, b : 내가 받는 양, n : 가지고 있는 빈병 개수
        int answer = 0;

        while(n >= a)
        {
            answer += (n / a) * b;
            n = (n / a) * b + n % a;
        }
        return answer;
    }
}