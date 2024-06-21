package level1.p12948;

import java.util.Arrays;

public class Main {
}

class Solution {
    public String solution(String phone_number) {


        String[] str = phone_number.split("");
        for(int i = 0; i < str.length - 4; i++){
            str[i] = "*";
        }

        String answer = String.join("", str);

        return answer;
    }
}