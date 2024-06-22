package level1.p12935;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

}


class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length - 1];

        int[] delete = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            delete[i] = arr[i];
        }
        Arrays.sort(delete);


        if (arr.length == 1) {
            arr[0] = -1;
            return arr;
        }

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < delete.length; j++) {
                if (arr[i] == delete[j]) {
                    answer[count++] = arr[i];
                }
            }
        }

        return answer;
    }
}