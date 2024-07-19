package level1.p176963;

import java.util.HashMap;
import java.util.Map;

public class Main {
}
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];

        Map<String, Integer> map = new HashMap<>();

        for(int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }

        int count = 0;

        for(int i = 0; i < photo.length; i++) {
            for(int j = 0; j < photo[i].length; j++) {
                if(map.get(photo[i][j]) != null) {
                    answer[count] += map.get(photo[i][j]);
                }
            }
            count++;
        }


        return answer;
    }
}