package com.ki.level0.p181838;

public class Main {
}
class Solution {
    public int solution(int[] date1, int[] date2) {
        if(date1[0] == date2[0] && date1[1] == date2[1] && date1[2] == date2[2]) {
            return 0;
        }

        if(date1[0] < date2[0]){
            return 1;
        } else if (date1[0]==date2[0] && date1[1] < date2[1]){
            return 1;
        } else if (date1[0]==date2[0] && date1[1] == date2[1] && date1[2] < date2[2]){
            return 1;
        }
        return 0;
    }
}