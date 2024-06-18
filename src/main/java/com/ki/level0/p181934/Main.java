package com.ki.level0.p181934;

public class Main {
}

class Solution {
    public int solution(String ineq, String eq, int n, int m) {

        if(ineq.equals(">") && eq.equals("=") ){
            if(n >= m){
                return 1;
            }
            return 0;
        }

        if(ineq.equals("<") && eq.equals("=")){
            if(n <= m){
                return 1;
            }
            return 0;
        }

        if(ineq.equals(">") && eq.equals("!")){
            if(n > m){
                return 1;
            }
            return 0;
        }

        if(ineq.equals("<") && eq.equals("!")){
            if(n < m){
                return 1;
            }

        }
        return 0;
    }
}