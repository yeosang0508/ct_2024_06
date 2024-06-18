package com.ki.level0.p120841;

public class Main {

}
class Solution {
    public int solution(int[] dot) {

        if(dot[0] > 0 && dot[1] > 0) return 1;

        if(dot[0] < 0 && dot[1] > 0) return 2;

        if(dot[0] < 0 && dot[1] < 0) return 3;

        return 4;
    }
}