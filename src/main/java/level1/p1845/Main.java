package level1.p1845;

import java.util.ArrayList;
import java.util.List;

public class Main {
}

class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        List <Integer> list = new ArrayList<Integer>();

        for(int i = 1; i < nums.length; i++) {
            if(list.contains(nums[i])) {
                continue;
            }
            list.add(nums[i]);
            if(list.size() == nums.length / 2 ) {
                break;
            }
        }
        answer = list.size();
        return answer;
    }
}