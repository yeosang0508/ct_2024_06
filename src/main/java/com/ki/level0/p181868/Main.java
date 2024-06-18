package com.ki.level0.p181868;

public class Main {
}

class Solution {
    public String[] solution(String my_string) {
        String[] answer =  my_string.split(" ");
        int count = 0;

        for(int i = 0; i < answer.length; i++){
            if(!answer[i].equals("")){
                count++;
            }
        }
        int a = 0;
        String[] fin = new String[count];

        for(int i = 0; i < answer.length; i++){
            if(!answer[i].equals("")){
                fin[a++] = answer[i];
            }
        }
        return fin;
    }
}