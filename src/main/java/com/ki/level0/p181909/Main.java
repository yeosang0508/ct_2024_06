package com.ki.level0.p181909;
import java.util.Arrays;

public class Main {
}

class Solution {
    public String[] solution(String my_string) {
        String[] answer = new String[my_string.length()]; //1.
        for(int i =0; i< my_string.length(); i++){
            //2.
            answer[i] = my_string.substring(i,my_string.length());
        }

        Arrays.sort(answer); //3.

        return answer;
    }
}