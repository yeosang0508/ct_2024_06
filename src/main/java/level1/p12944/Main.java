package level1.p12944;

public class Main {
}

class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        int sum = 0;
        int n = arr.length;

        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        answer = (double)sum / n;
        return answer;
    }
}