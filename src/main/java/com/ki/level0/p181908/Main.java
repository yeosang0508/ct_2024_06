package com.ki.level0.p181908;

public class Main {

}

class Solution {
    public int solution(String my_string, String is_suffix) {

        if(my_string.endsWith(is_suffix)){
            return 1;
        }

        return 0;
    }
}