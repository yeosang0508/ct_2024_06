package com.ki.level0.p181873;

public class Main {
}

class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";

        String[] my = my_string.split("");

        for(int i = 0; i < my.length; i++){
            if(my[i].equals(alp)){
                answer += my[i].toUpperCase();
            } else {
                answer += my[i];
            }
        }
        return answer;
    }
}