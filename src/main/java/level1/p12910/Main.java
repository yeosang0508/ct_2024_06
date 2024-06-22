package level1.p12910;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    }



class Solution {
    public int[] solution(int[] arr, int divisor) {
        int count = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0) {
                count++;
            }
        }

        if(divisor == 1) {
            Arrays.sort(arr);
            return arr;
        }

        if(count == 0) {
            int[] answer = {-1};
            return answer;
        }

        int a = 0;
        int[] answer = new int[count];

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0) {
                answer[a++] = arr[i];
            }
        }

        Arrays.sort(answer);
        return answer;

    }
}