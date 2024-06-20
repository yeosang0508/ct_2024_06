package level1.p12954;

public class Main {
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        long[] answer = new long[n];


        for (int i = 0; i < n; i++) {
            answer[i] = x;
            x += x;
        }

        System.out.println(answer);
    }
}


class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];

        for (int i = 0; i < n; i++) {
            answer[i] = x;
            x += x;
        }
        return answer;
    }
}