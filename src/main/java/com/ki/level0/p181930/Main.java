package com.ki.level0.p181930;

public class Main {
}

class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;

        int count = 0;
        if(a==b){
            count+=2;
        }

        if(a==c){
            count+=2;
        }

        if(c==b){
            count+=2;
        }
        if(count >= 3){
            count =3;
        }

        if(count == 3){
            answer = (a+b+c) * ((a*a)+(b*b)+(c*c)) * ((a*a*a)+(b*b*b)+(c*c*c));
            return answer;
        }else if(count == 2){
            answer = (a+b+c) * ((a*a)+(b*b)+(c*c));
            return answer;
        }else{
            answer = a+b+c;
            return answer;
        }

    }
}