package level1.p12935;

import java.util.Arrays;

public class Main {
}

class Solution {
    public int[] solution(int[] arr) {
        int count = arr.length;

        int[] answer = new int[count];

        if(arr.length > 1){
            count -= 1;
        } else{
            count = 1;
        }

        if(count == 1){
            answer[0] = -1;
            return answer;
        }


        for(int i = 0; i < count; i++){
            if(arr[i] > arr[i+1]){
                answer[i] = arr[i];
            }
        }
        return answer;
    }
}