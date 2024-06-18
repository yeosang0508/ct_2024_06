package com.ki.level0.p120837;

public class Main {

}

class Solution {
    public int solution(int hp) {
       int cnt = 0;

       cnt += (hp / 5);
       hp = hp % 5;

       cnt += (hp / 3);
       hp %= 3;

       cnt += (hp / 1);

       return cnt;
    }
}