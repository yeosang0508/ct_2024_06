package com.ki.level0.p120911;
import java.util.Arrays;
public class Main {
}

class Solution {
    public String solution(String my_string) {
        my_string = my_string.toLowerCase();

        char[] chArr = my_string.toCharArray();
        Arrays.sort(chArr);

        String answer = new String(chArr);
        return answer;
    }
}
