package com.ki.level0.p181915;

public class Main {
}

class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";

        String[] mystring = my_string.split("");

        for(int i = 0; i < index_list.length; i++){
           answer += mystring[index_list[i]];
        }
        return answer;
    }
}