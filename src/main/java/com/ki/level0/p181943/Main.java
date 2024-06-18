package com.ki.level0.p181943;

public class Main {
}

class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";

        String[] mystring = my_string.split("");
        String[] overwritestring = overwrite_string.split("");

        int count = s;

        for(int i = 0; i < overwritestring.length ; i++){
            mystring[count] = overwritestring[i];
            count++;
        }

        for(int k = 0; k < mystring.length; k++){
            answer += mystring[k];
        }

        return answer;
    }
}