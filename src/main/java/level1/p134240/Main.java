package level1.p134240;

public class Main {
}
class Solution {
    public String solution(int[] food) {
        String answer = "";

        int[] count = new int[food.length];
        count[0] = 1;


        for (int i = 1; i < food.length; i++) {
            if (food[i] % 2 == 1) {
                count[i] = (food[i] / 2);

            } else {
                count[i] = (food[i] / 2);
            }
        }
        for (int k = 1; k < count.length; k++) {
            for (int j = count[k]; j > 0; j--) {
                answer += k;
            }
        }

        answer += "0";


        for (int k = count.length - 1; k > 0; k--) {
            for (int j = count[k]; j > 0; j--) {
                answer += k;
            }
        }

        if (answer.length() < 3) {
            return null;
        }

        return answer;
    }
}