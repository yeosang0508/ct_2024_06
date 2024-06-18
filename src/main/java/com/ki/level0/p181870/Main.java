package com.ki.level0.p181870;

import java.nio.file.Watchable;

public class Main {
}

class Solution {
    public String[] solution(String[] strArr) {
        int cnt = 0;
        for(int i = 0; i < strArr.length; i++) {
            if(strArr[i].contains("ad")) {
                cnt++;
            }
        }

        String[] answer = new String[strArr.length - cnt];
        int idx = 0;
        for(int i = 0; i < strArr.length; i++) {
            if(!strArr[i].contains("ad")) {
                answer[idx++] = strArr[i];
            }
        }

        return answer;
    }
}