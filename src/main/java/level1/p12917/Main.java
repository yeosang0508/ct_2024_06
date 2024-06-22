package level1.p12917;

import java.util.Arrays;
import java.util.Collections;

public class Main {
}
class Solution {
    public String solution(String s) {
        String answer = "";

        String[] str = s.split("");
        Arrays.sort(str, Collections.reverseOrder());

        for(String a: str)
            answer += a;

        return answer;
    }
}