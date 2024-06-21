package level1.p86051;

public class Main {
}
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;

        int totalNum = 45;
        int total = 0;

        for(int i =0; i < numbers.length; i++){
            total += numbers[i];
        }

        answer = totalNum - total;

        return answer;


    }
}