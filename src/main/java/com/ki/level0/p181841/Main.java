package com.ki.level0.p181841;

public class Main {
}

class Solution {
    public String solution(String[] str_list, String ex) {
        String answer = "";

        for(int i = 0; i < str_list.length; i++){
            if(str_list[i].contains(ex)){
                answer += "";
            } else{
                answer += str_list[i];
            }
        }
        return answer;
    }
}