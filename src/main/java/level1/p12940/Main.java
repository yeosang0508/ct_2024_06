package level1.p12940;

public class Main {
}

class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        if (n < m) {
            if (m % n == 0) {
                answer[0] = n;
                answer[1] = m;
            } else {
                answer[0] = 1;
                answer[1] = m * n;
            }
        }else {
            if(n % m == 0) {
                answer[0] = m;
                answer[1] = n;
            } else{
                answer[0] = 1;
                answer[1] = m * n;
            }
        }


        return answer;
    }
}