package com.ki.level0.p120909;

public class Main {
}

class Solution {
    public int solution(int n) {
        return Math.sqrt(n) % 1 == 0 ? 1 : 2;
    }
}