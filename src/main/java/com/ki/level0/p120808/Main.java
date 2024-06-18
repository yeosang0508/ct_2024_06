package com.ki.level0.p120808;

public class Main {

}

class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int a;
        int b;

        if(denom1 % denom2 == 0 || denom2 % denom1 ==0){
            if(denom1 < denom2){
                a = denom2 / denom1;
                b = numer1 * a;
                answer[0] = b + numer2;
                answer[1] = denom2;

                return answer;

            } else if (denom2 < denom1) {
                a = denom1 / denom2;
                b = numer2 * a;
                answer[0] = b + numer1;
                answer[1] = denom1;
            }
        }else {
            answer[0] = (numer1*denom2) + (numer2*denom1);
            answer[1] = denom1 * denom2;
        }
       return answer;
    }
}