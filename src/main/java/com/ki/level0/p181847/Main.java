package com.ki.level0.p181847;

public class Main {

}

class Solution {
    public String solution(String n_str) {
        String answer = "";

        String[] nstr = n_str.split("");
        int count = 0;

        for(int i = 0; i < nstr.length; i++){

            if(nstr[i].equals("0") ){
                answer += "";
                count++;
            }else {
                break;
            }
        }

        for(int k = count; k <nstr.length; k++){
            answer += nstr[k];
        }
        return answer;
    }
}