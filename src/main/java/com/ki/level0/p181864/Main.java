package com.ki.level0.p181864;

public class Main {
}
class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;

        String rpStr = myString.replace('A', 'X').replace('B','A').replace('X','B');

        if(rpStr.contains(pat)){
            return 1;
        }
        return 0;
    }
}